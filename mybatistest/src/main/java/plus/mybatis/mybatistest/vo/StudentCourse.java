package plus.mybatis.mybatistest.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author hgw
 */
@Data
@TableName("dct_student_course")
public class StudentCourse {
    public String commonNo;
    private String name;
    private String gender;
    private String courseName;
}
