package org.vcs.biennd3.student;

import org.springframework.boot.SpringApplication;

public class StudentApplication_fixed {
    public static void main(String[] args) {
//        turn off this property by commenting or set to false
        System.setProperty("org.apache.commons.collections.enableUnsafeSerialization", "false");
        SpringApplication.run(StudentApplication.class, args);
    }
}
