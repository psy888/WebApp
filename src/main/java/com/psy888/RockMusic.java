package com.psy888;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    List<String> list = new ArrayList<>();

    {
        list.add("Rock Song");
        list.add("Rock Song2");
        list.add("Rock Song3");

    }

    @Override
    public String getSong() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
