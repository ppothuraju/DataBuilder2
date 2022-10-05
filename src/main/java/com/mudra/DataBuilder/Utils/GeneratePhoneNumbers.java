package com.mudra.DataBuilder.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeneratePhoneNumbers {

    @Autowired
    private final RandomInteger randomInteger;

    public String[] geoPrefix = new String[]{"020","023","024","028","029","0121","0131","0141","0151","0161","01224","01473","01792","01854","01947"};
    public String[] mobilePrefix = new String[] {"073","074","075","077","078","079"};

    public GeneratePhoneNumbers(RandomInteger randomInteger) {
        this.randomInteger = randomInteger;
    }


    public String getWorkPhone()
    {
        String number = geoPrefix[randomInteger.getRandomIntWithin(14)];
        number = "(" + number + ")" + " "+randomInteger.getRandomIntBetween(3000,9999) + " " + randomInteger.getRandomIntBetween(1000,9999);
        return number;
    }
    public String getMobile()
    {
        String number = mobilePrefix[randomInteger.getRandomIntWithin(6)];
        number = number + randomInteger.getRandomIntBetween(10,99)+" "+randomInteger.getRandomIntBetween(100,999) +" "+randomInteger.getRandomIntBetween(100,999);
        return number;
    }

}
