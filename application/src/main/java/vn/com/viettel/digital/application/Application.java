package vn.com.viettel.digital.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.printf("Hello");
        SpringApplication.run(Application.class, args);
    }

}
