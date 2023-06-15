package com.example.shablon11test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class DemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
        Control control = new Control();
        control.index();
		//RestTemplate restTemplate = new RestTemplate();
		//String status = restTemplate.getForObject("http://localhost:8080/actuator/health", String.class);
		//System.out.println(status);

    }
}
