package plus.mybatis.mybatistest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import plus.mybatis.mybatistest.bean.Student;
import plus.mybatis.mybatistest.vo.StudentCourse;

import java.util.List;

/**
 * @author hgw
 */
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * 查出所有学生的所有课程
     * @return 
     */
    @Select("select * from dct_student_course")
    List<StudentCourse> selectAllStudentCourse();
}
