package kz.my.firts.app.coolapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicMusic;
    private Music rockMusic;

//    private String name;
//    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }




    public void playMusic( musicGenre music) {
        Random random = new Random();
        if (music == musicGenre.ROCK) {
            System.out.println(rockMusic.getSong().get(random.nextInt(3)));
        } else if (music == musicGenre.CLASSICAL) {
            System.out.println(classicMusic.getSong().get(random.nextInt(3)));
        }
    }
}
