package kz.my.firts.app.coolapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music{

    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("ClassicalMusic - 1");
        musicList.add("ClassicalMusic - 2");
        musicList.add("ClassicalMusic - 3");
        return musicList;
    }

    @PostConstruct
    public void myInit() {
        System.out.println("Bean  Initialisation");
    }
    @PreDestroy
    public void myDestroy() {
        System.out.println("Bean  Destuction");
    }
}
