package kz.my.firts.app.coolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CoolappApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer2 = new MusicPlayer(music);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();

		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());

		musicPlayer2.playMusic();


		context.close();
		//SpringApplication.run(CoolappApplication.class, args);
	}

}
