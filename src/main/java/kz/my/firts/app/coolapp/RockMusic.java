package kz.my.firts.app.coolapp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "New Devide";
    }
}
