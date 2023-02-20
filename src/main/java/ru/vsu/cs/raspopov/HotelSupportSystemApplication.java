package ru.vsu.cs.raspopov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelSupportSystemApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HotelSupportSystemApplication.class);
    }
}