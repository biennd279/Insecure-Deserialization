package org.vcs.biennd3.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        System.setProperty("org.apache.commons.collections.enableUnsafeSerialization", "false");
        SpringApplication.run(StudentApplication.class, args);
    }

}
