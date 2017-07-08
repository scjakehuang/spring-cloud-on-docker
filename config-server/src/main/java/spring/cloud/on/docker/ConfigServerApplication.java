package spring.cloud.on.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by viki on 17-7-4.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
