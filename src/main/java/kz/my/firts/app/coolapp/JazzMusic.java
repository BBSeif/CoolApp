package kz.my.firts.app.coolapp;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music{



    @Override
    public List<String> getSong() {
        List<String> song = new ArrayList<>();
        song.add("JazzMusic - 1");
        song.add("JazzMusic - 2");
        song.add("JazzMusic - 3");

        return song;
    }
}
