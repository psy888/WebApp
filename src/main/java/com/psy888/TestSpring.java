package com.psy888;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        //        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println("comparison = " + comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        firstMusicPlayer.playMusic();
////        System.out.println(musicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
