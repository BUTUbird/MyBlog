package org.butu.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author BUTUbird
 */
@SpringBootApplication
@MapperScan("org.butu.blog.mapper")
public class SpringMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMainApplication.class, args);
    }
}
