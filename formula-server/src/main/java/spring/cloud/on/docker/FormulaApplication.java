package spring.cloud.on.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by viki on 17-7-7.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class FormulaApplication {
    public static void main(String[] args) {
        SpringApplication.run(FormulaApplication.class, args);
    }
}
