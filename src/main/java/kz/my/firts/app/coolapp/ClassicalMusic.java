package kz.my.firts.app.coolapp;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void myInit() {
        System.out.println("Bean  Initialisation");
    }

    public void myDestroy() {
        System.out.println("Bean  Destuction");
    }
}
