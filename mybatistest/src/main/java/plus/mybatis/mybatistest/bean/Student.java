package plus.mybatis.mybatistest.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author hgw
 */
@Data
@TableName(value = "dct_student")
public class Student {
    @TableId
    public String commonNo;
    public String name ;
    public String gender;
    public String teacher;

}
