package am.itspace.springcloudeurekafeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudEurekaFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaFeignClientApplication.class, args);
    }

}
