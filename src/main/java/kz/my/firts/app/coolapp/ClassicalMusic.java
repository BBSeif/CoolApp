package kz.my.firts.app.coolapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("ClassicalMusic - 1");
        musicList.add("ClassicalMusic - 2");
        musicList.add("ClassicalMusic - 3");
        return musicList;
    }

    public void myInit() {
        System.out.println("Bean  Initialisation");
    }

    public void myDestroy() {
        System.out.println("Bean  Destuction");
    }
}
