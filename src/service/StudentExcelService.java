package service;

import com.sun.jndi.ldap.Ber;
import dao.*;
import org.springframework.stereotype.Service;
import pojo.*;
import utils.StudentExcel;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class StudentExcelService {
    @Resource private StudentExcelMapper studentExcelMapper; //获取最新添加学生
    @Resource private BlockMapper blockMapper; //楼栋
    @Resource private RoomMapper roomMapper; //房间
    @Resource private BerthMapper berthMapper; //床位
    @Resource private StudentMapper studentMapper; //学生
    @Resource private PayInfoMapper payInfoMapper; //支付

    //根据楼栋名查询楼栋id
    private Integer selectBlockIdByName(String blockName){
        BlockExample example=new BlockExample();
        example.createCriteria().andNameEqualTo(blockName);
        List<Block> blockList=blockMapper.selectByExample(example);
        return blockList.isEmpty()?null:blockList.get(0).getBlockID();
    }

    //根据房间号查询房间id
    private Integer selectRoomIDByName(Integer roomName){
        RoomExample roomExample=new RoomExample();
        roomExample.createCriteria().andRoomNameEqualTo(roomName);
        List<Room> roomList=roomMapper.selectByExample(roomExample);
        return roomList.isEmpty()?null :roomList.get(0).getRoomID();
    }

    //根据房间id与床位名获取床位id
    private Integer selectBerthIdByName(Integer roomId,String berthName){
        BerthExample example=new BerthExample();
        example.createCriteria().andRoomIDEqualTo(roomId).andBerthNameEqualTo(berthName);
        List<Berth> berthList=berthMapper.selectByExample(example);
        return berthList.isEmpty()?null:berthList.get(0).getBerthID();
    }

    //添加入住学生
    private Integer addStudent(Student student){
        return studentMapper.insertSelective(student);
    }

    //添加支付信息
    private Integer addPayInfo(PayInfo payInfo){
        return payInfoMapper.insertSelective(payInfo);
    }


    //执行excel数据循环插入数据库
    public Integer StudentEin(List<StudentExcel> studentExcelList){
        int flag=0;
        for(StudentExcel stuEin:studentExcelList){
            Integer blockId=this.selectBlockIdByName(stuEin.getBlockName()); //获取楼栋id
            Integer roomId=this.selectRoomIDByName(stuEin.getRoomName()); //获取房间id
            Integer berthId=this.selectBerthIdByName(roomId,stuEin.getBerthName()); //获取床位id
            Student student=new Student();
            student.setRoomID(roomId);
            student.setBerthID(berthId);
            student.setSname(stuEin.getStudentName());
            student.setSex(stuEin.getGender());
            student.setPhone(stuEin.getPhone());
            student.setCheckInDate(stuEin.getCheckDate());
            student.setClassNo(stuEin.getClassesNo());
            //使用Calendar 日历类，根据月份数计算搬出时间
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(stuEin.getCheckDate()); //设置入住时间
            calendar.add(calendar.MONTH,stuEin.getInPeriod());//根据月份计算搬出时间，入住日期+入住周期=搬出日期
            student.setCheckOutDate(calendar.getTime()); //设置搬出时间
            Integer srow=this.addStudent(student); //执行学生添加
            if(srow==1){
                //执行支付信息添加
                PayInfo payInfo=new PayInfo();
                Student newStudent=studentExcelMapper.findNewStudent(); //获取最新添加的学生
                payInfo.setStudentID(newStudent.getStudentID()); //设置最新添加的学生id
                payInfo.setMoney(stuEin.getMoney()); //设置入住缴费金额
                payInfo.setPayDate(new Date()); //设置支付日期，当前日期
                Calendar calendar1=Calendar.getInstance();
                calendar1.setTime(new Date());
                calendar1.add(calendar1.YEAR,1); //付款到期，1年到期
                Date expireDate=calendar1.getTime(); //获取到期时间
                payInfo.setExpireDate(expireDate);
                Integer prow=this.addPayInfo(payInfo); //添加支付记录
                if(prow==1){
                    flag=1; //最终添加成功
                    System.out.println("添加成功");
                }else{
                    flag=-2; //添加支付信息失败
                }

            }else{
                flag=-1; //添加学生失败
            }
        }
        return flag;
    }

}
