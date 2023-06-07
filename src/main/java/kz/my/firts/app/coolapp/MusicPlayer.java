package kz.my.firts.app.coolapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> music;
    private Music rockMusic;
    private Music jazzMusic;
    private Music classicMusic;
    //List<Music> musicList = new ArrayList<>();


    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer(@Qualifier("classicalMusic") Music classicMusic, @Qualifier("rockMusic") Music rockMusic, @Qualifier("jazzMusic") Music jazzMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;

    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void playMusic(musicGenre music) {
        Random random = new Random();
        if (music == musicGenre.ROCK) {
            System.out.println(rockMusic.getSong().get(random.nextInt(3)));
        } else if (music == musicGenre.CLASSICAL) {
            System.out.println(classicMusic.getSong().get(random.nextInt(3)));
        }
    }
}
