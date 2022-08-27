package com.cydeo.bean_annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {
    //    @Bean(name = "p1")
    @Bean
    @Primary
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    //    @Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }


}
