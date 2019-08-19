package dao;

import pojo.Student;

public interface StudentExcelMapper {
    /**
     * 查询最新创建的学生
     */
    public Student findNewStudent();
}
