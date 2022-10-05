package com.mudra.DataBuilder.Utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomInteger {

    public int getRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public int getRandomIntWithin(int size)
    {
        return new Random().nextInt(size);
    }

    public Long getRandomLongIntBetween(int start, int end) {
        return start + Math.round(Math.random() * (end - start));
    }
}
