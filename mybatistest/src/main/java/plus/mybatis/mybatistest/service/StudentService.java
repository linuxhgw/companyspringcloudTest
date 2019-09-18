package plus.mybatis.mybatistest.service;

import plus.mybatis.mybatistest.bean.Student;
import plus.mybatis.mybatistest.vo.StudentCourse;

import java.util.List;

public interface StudentService {

    int updateStudent(Student student);
    int insertStudent(Student student);
    int deleteStudent(String commonNo);
    List<Student> selectStudent();
    List<StudentCourse> selectStudentCourse();
}
