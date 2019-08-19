package utils;

import org.apache.poi.ss.formula.functions.T;

import java.util.Date;
import java.util.List;

public class StudentExcel {
    private String blockName; //楼栋
    private Integer roomName; //房间号
    private String berthName;

    private String studentName;
    private Integer gender;
    private String phone;
    private Date checkDate; //入住时间
    private Integer classesNo; //班级id

    private Integer inPeriod; //入住周期
    private Integer money; //入住缴费金额

    @Override
    public String toString() {
        return "StudentExcel{" +
                "blockName='" + blockName + '\'' +
                ", roomName=" + roomName +
                ", berthName='" + berthName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", checkDate=" + checkDate +
                ", classesNo=" + classesNo +
                ", inPeriod=" + inPeriod +
                ", money=" + money +
                '}';
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Integer getRoomName() {
        return roomName;
    }

    public void setRoomName(Integer roomName) {
        this.roomName = roomName;
    }

    public String getBerthName() {
        return berthName;
    }

    public void setBerthName(String berthName) {
        this.berthName = berthName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Integer getClassesNo() {
        return classesNo;
    }

    public void setClassesNo(Integer classesNo) {
        this.classesNo = classesNo;
    }

    public Integer getInPeriod() {
        return inPeriod;
    }

    public void setInPeriod(Integer inPeriod) {
        this.inPeriod = inPeriod;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
