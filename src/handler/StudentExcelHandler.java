package handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import service.StudentExcelService;
import utils.StudentExcel;
import utils.StudentExcelIn;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping(value = "/stuexcel")
@Controller
public class StudentExcelHandler {

    @Resource private StudentExcelIn studentExcelIn;
    @Resource private StudentExcelService studentExcelService;

    @RequestMapping(value = "/studentExcelIn")
    public String studentExcelIn(@RequestParam(value = "excelFile")MultipartFile multipartFile){
        try {
            List<StudentExcel> studentExcelList = studentExcelIn.excelToDB(multipartFile.getInputStream(),multipartFile.getOriginalFilename());
            Integer row=studentExcelService.StudentEin(studentExcelList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "excelin";
    }

}
