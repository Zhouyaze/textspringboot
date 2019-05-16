package cn.zyz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println("springboot");
        System.out.println("springboot周亚泽");
        System.out.println("springboot周亚泽01");
        System.out.println("springboot周亚泽02");
        System.out.println("springboot DEV");

    }

}
