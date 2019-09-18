package plus.mybatis.mybatistest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import plus.mybatis.mybatistest.bean.Student;
import plus.mybatis.mybatistest.mapper.StudentMapper;
import plus.mybatis.mybatistest.vo.StudentCourse;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class testMapper {

    @Autowired
    StudentMapper mapper;

    @Test
    public void action(){
        final List<Student> Students = mapper.selectList(null);
        Assert.assertEquals(5, Students.size());
        Students.forEach(System.out::println);
    }
    @Test
    @Transactional
    public void action1(){

        final Student student = new Student();
        student.setCommonNo("S006");
        student.setGender("男");
        student.setName("社会人");
        student.setTeacher("T004");
        //增
        final int flag = mapper.insert(student);
        System.out.println(flag+student.getTeacher());
        //改
        student.setTeacher("T003");
        final int updateById = mapper.updateById(student);
        System.out.println("更新"+updateById);
        //删
        final int deleteById = mapper.deleteById("S006");
        System.out.println("删除"+deleteById);
        //查
        final List<Student> Students = mapper.selectList(null);
        Assert.assertEquals(5, Students.size());
        Students.forEach(System.out::println);
        //查询全部学生的全部课程
        final List<StudentCourse> studentCourses = mapper.selectAllStudentCourse();
        studentCourses.forEach(System.out::println);
    }
}
