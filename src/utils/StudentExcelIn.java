package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *Excel导入,需要被控制层调用
 */
@Component
public class StudentExcelIn extends ExcelSupport {

    public List<StudentExcel> excelToDB(InputStream in,String fileName) throws Exception {
        List<StudentExcel> studentExcelList=new ArrayList<>();
        Workbook workBook = this.createWorkBook(in, fileName);
        Sheet sheet=null;
        Row row=null;
        Cell cell=null;
        StudentExcel studentExcel=null;
        //循环工作表Sheet
        for (int i = 0; i < workBook.getNumberOfSheets(); i++) {
            sheet = workBook.getSheetAt(i);
            if(null==sheet){
                continue;
            }
            for(int j=sheet.getFirstRowNum(); j<=sheet.getLastRowNum();j++){
                row=sheet.getRow(j);
                if(null==row||row.getFirstCellNum()==j){
                    continue;
                }
                studentExcel=new StudentExcel(); //封装excel表数据，一行对应一个此对象
                try{
                for(int y=row.getFirstCellNum();y<row.getLastCellNum();y++){
                    cell=row.getCell(y);
                    if(null!=cell){
                        if(y==row.getFirstCellNum()){
                            studentExcel.setBlockName(this.getCellValue(cell));
                        }else if(y==1){
                            studentExcel.setRoomName(Integer.parseInt(this.getCellValue(cell)));
                        }else if(y==2){
                            studentExcel.setBerthName(this.getCellValue(cell));
                        }else if(y==3){
                            studentExcel.setStudentName(this.getCellValue(cell));
                        }else if(y==4){
                            studentExcel.setGender(Integer.parseInt(this.getCellValue(cell)));
                        }else if(y==5){
                            studentExcel.setPhone(this.getCellValue(cell));
                        }else if(y==6){
                            studentExcel.setCheckDate(new SimpleDateFormat("yyy-MM-dd").parse(this.getCellValue(cell)));
                        }else if(y==7){
                            studentExcel.setClassesNo(Integer.parseInt(this.getCellValue(cell)));
                        }else if(y==8){
                            studentExcel.setInPeriod(Integer.parseInt(this.getCellValue(cell)));
                        }else if(y==9){
                            studentExcel.setMoney(Integer.parseInt(this.getCellValue(cell)));
                        }
                    }
                }
                studentExcelList.add(studentExcel);
                }catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
        }
        return studentExcelList;
    }
}
