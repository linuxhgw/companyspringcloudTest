package plus.mybatis.mybatistest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plus.mybatis.mybatistest.bean.Student;
import plus.mybatis.mybatistest.service.StudentService;
import plus.mybatis.mybatistest.vo.StudentCourse;

import java.util.List;

/**
 * @author hgw
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/hi")
    public String  hi(){
        return "hi";
    }

    @GetMapping("/updateStudent")
    public String updateStudent(@RequestBody Student student){
       return String.valueOf( studentService.updateStudent(student));
    }

    @GetMapping("/insertStudent")
    public String insertStudent(@RequestBody Student student){
        return String.valueOf(  studentService.insertStudent(student));
    }
    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("commonNo") String commonNo){
        return String.valueOf(  studentService.deleteStudent(commonNo));
    }
    @GetMapping("/selectStudent")
    public List<Student> selectStudent(){
        return studentService.selectStudent();
    }
    @GetMapping("/selectStudentCourse")
    public List<StudentCourse> selectStudentCourse() {
        return studentService.selectStudentCourse();
    }
}
