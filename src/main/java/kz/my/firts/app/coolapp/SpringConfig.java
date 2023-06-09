package kz.my.firts.app.coolapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
@Bean
    public ClassicalMusic classicalMusic() {
    return new ClassicalMusic();
}
@Bean
    public RockMusic rockMusic() {
    return new RockMusic();
}

@Bean
public JazzMusic jazzMusic() {
    return new JazzMusic();
}


@Bean
    public MusicPlayer musicPlayer() {
    return new MusicPlayer(rockMusic(),classicalMusic(),jazzMusic());
}
}
