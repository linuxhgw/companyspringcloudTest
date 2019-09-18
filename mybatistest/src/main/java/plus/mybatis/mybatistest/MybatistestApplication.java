package plus.mybatis.mybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hgw
 */
@SpringBootApplication
@MapperScan("plus.mybatis.mybatistest.mapper")
@EnableEurekaClient
public class MybatistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatistestApplication.class, args);
    }

}
