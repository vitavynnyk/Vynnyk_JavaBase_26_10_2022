package com.hillel.vynnyk.homeworks.homework16;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new RockMusic(),
                new PopMusic(),
                new ClassicMusic()
        };
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
