package com.mudra.DataBuilder.Utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class GenerateStrings {

    @Autowired
    private final RandomInteger randomInteger;

    public GenerateStrings(RandomInteger randomInteger) {
        this.randomInteger = randomInteger;
    }

    public List<String> alphabet = Arrays.asList(IntStream.rangeClosed('A','Z')
            .mapToObj(c -> (char) c+",")
            .collect(Collectors.joining()).split(","));

    /* NIN doesn't allow D, F, I, Q, U or V for the first two letters and
    doesn't allow O for the second letter;
    on top of this, the prefix letters can not be BG, GB, NK, KN, TN, NT and ZZ.
    Also the suffix letter is either A, B, C or D, but may be represented by a space if unknown.
    regular experssion can be:^(?!BG)(?!GB)(?!NK)(?!KN)(?!TN)(?!NT)(?!ZZ)(?:[A-CEGHJ-PR-TW-Z][A-CEGHJ-NPR-TW-Z])(?:\s*\d\s*){6}([A-D]|\s)$
    */

    public String getNINO() {

        List<String> firstL = new ArrayList<>(Arrays.asList("A","B","C","E","H","J","M","O"));
        List<String> secondL = new ArrayList<>(Arrays.asList("K","l","P","E","Q","J","N","T"));
        List<String> lastL= new ArrayList<>(Arrays.asList("A","B","C","D"));

        String NINO = firstL.get(randomInteger.getRandomIntWithin(firstL.size()));
        NINO = NINO + secondL.get(randomInteger.getRandomIntWithin(secondL.size()));
        NINO = NINO + randomInteger.getRandomIntBetween(100000,999999);
        NINO = NINO + lastL.get(randomInteger.getRandomIntWithin(lastL.size()));

        return NINO;
    }
    public String generateEmployeeId() {
        //return RandomStringUtils.randomAlphanumeric(5,10);


        String employeeId = String.valueOf(randomInteger.getRandomIntBetween(10000,99999999));
        employeeId = employeeId + alphabet.get(randomInteger.getRandomIntWithin(alphabet.size()));
        return employeeId;
    }

    public String getUIN() {

        String uin = alphabet.get(randomInteger.getRandomIntWithin(alphabet.size()));
        uin = uin + randomInteger.getRandomIntBetween(0, 9);
        uin = uin + randomInteger.getRandomIntBetween(100, 999);
        uin = uin + alphabet.get(randomInteger.getRandomIntWithin(alphabet.size()));
        return uin;

    }

}
