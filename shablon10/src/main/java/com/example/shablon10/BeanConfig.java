package com.example.shablon10;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeanConfig {
    @Bean
    @Scope("prototype")
    public Politician politic() {
        return new Trump();
    }

    @Bean
    public NamePolitian namepolotic(Politician politic) {
        NamePolitian namepolotic = new NamePolitian();
        namepolotic.setPolitic(politic);
        return namepolotic;
    }
}
