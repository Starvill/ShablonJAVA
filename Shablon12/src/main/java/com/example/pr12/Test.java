package com.example.pr12;

import org.springframework.context.annotation.*;

@Configuration
public class Test {
    @Bean
    public FileHasherApplication fileHasher() {
        String inputFilePath  = "input.txt";
        String outputFilePath = "output.txt";
        return new FileHasherApplication(inputFilePath, outputFilePath);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
        context.getBean(FileHasherApplication.class).start();
    }
}

