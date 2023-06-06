package kz.my.firts.app.coolapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> musicList = new ArrayList<>();
        musicList.add("RockMusic - 1");
        musicList.add("RockMusic - 2");
        musicList.add("RockMusic - 3");
        return musicList;
    }
}
