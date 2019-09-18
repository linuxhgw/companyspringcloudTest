package plus.mybatis.mybatistest.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.mybatis.mybatistest.bean.Student;
import plus.mybatis.mybatistest.mapper.StudentMapper;
import plus.mybatis.mybatistest.service.StudentService;
import plus.mybatis.mybatistest.vo.StudentCourse;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentMapper studentMapper;




    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateById(student);
    }


    @Override
    public int insertStudent(Student student) {
        return studentMapper.insert(student);
    }


    @Override
    public int deleteStudent(String commonNo) {
        return studentMapper.deleteById(commonNo);
    }


    @Override
    public List<Student> selectStudent() {
        return studentMapper.selectList(null);
    }

    @Override
    public List<StudentCourse> selectStudentCourse() {
        return studentMapper.selectAllStudentCourse();
    }
}
