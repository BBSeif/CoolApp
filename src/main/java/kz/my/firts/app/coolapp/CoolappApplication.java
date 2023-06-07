package kz.my.firts.app.coolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoolappApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(
				SpringConfig.class
		);
//		Music music = context.getBean("classicalMusic", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);
//
//		musicPlayer.playMusic();
//
//		Music music1 = context.getBean("rockMusic", Music.class);
//		MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//
//		System.out.println(musicPlayer1.toString());
//		musicPlayer1.playMusic();


		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());

		ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
		ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

		System.out.println(classicalMusic == classicalMusic1);
		//System.out.println(classicalMusic1.getSong());
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic(musicGenre.ROCK);
//		musicPlayer.playMusic(musicGenre.CLASSICAL);
		context.close();
		//SpringApplication.run(CoolappApplication.class, args);
	}

}
