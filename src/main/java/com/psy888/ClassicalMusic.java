package com.psy888;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> list = new ArrayList<>();
    {
        list.add("Hungarian Rapsody");
        list.add("Hungarian Rapsody2");
        list.add("Hungarian Rapsody3");

    }
    @PostConstruct
    private void doInit(){
        System.out.println("my init Method");
        System.out.println("list = " + list.toString());
    }

    @PreDestroy
    private void doDestroy(){
        System.out.println("my Destroy Method");
        System.out.println("list = " + list.toString());

    }
    @Override
    public String getSong() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }


}
