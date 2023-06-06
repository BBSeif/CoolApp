package kz.my.firts.app.coolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoolappApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
		musicPlayer.playMusic();
		context.close();
		//SpringApplication.run(CoolappApplication.class, args);
	}

}
