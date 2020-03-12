package com.kevin.task;


import com.kevin.task.annotation.EnableElasticJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@EnableElasticJob
@SpringBootApplication
public class EsJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsJobApplication.class, args);
    }

}
