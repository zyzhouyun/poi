package utils;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Excel工具类.poi
 */
@Component
public class ExcelSupport {


    /**
     * 提供继承可用方法
     * 创建Excel工作薄
     * 描述：根据文件后缀，自适应上传文件的版本
     */
    protected Workbook createWorkBook(InputStream inputStream, String fileName) throws Exception {
        Workbook wb = null;
        if (fileName.endsWith(".xls")) {
            wb = new HSSFWorkbook(inputStream);  //2003-
        } else if (fileName.endsWith(".xlsx")) {
            wb = new XSSFWorkbook(inputStream);  //2007+
        } else {
            throw new Exception("解析的文件格式有误！");
        }
        return wb;
    }

    /**
     * 描述：对表格中数值进行格式化
     * 统一转成String类型
     */
    protected String getCellValue(Cell cell) {
        String value = null;
        try {
            if (cell.getCellType() == cell.CELL_TYPE_STRING) {
                value = cell.getStringCellValue();
            } else if (cell.getCellType() == cell.CELL_TYPE_BOOLEAN) {
                value = String.valueOf(cell.getBooleanCellValue());
            } else if (cell.getCellType() == cell.CELL_TYPE_FORMULA) {
                value = cell.getCellFormula();
            } else if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    //时间处理：先判断单元格的类型是否则数字类型，然后再判断单元格是否为日期格式
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
                    value = sf.format(cell.getDateCellValue());
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    return cell.getStringCellValue();
                }
            } else if (cell.getCellType() == cell.CELL_TYPE_ERROR) {
                value = "";
            } else if (cell.getCellType() == cell.CELL_TYPE_BLANK) {
                value = "";
            } else {
                value = "未知类型";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }


}
