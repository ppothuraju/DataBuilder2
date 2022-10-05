package com.mudra.DataBuilder.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class GenerateDates {

    @Autowired
    private final RandomInteger randomInteger;

    public GenerateDates(RandomInteger randomInteger) {
        this.randomInteger = randomInteger;
    }

    public LocalDate getARandomDOB(){
         int birthStartYear = LocalDate.now().getYear() - 67;
         int birthEndYear = LocalDate.now().getYear() - 16;

         return generateADate(birthStartYear,birthEndYear);
    }
    public LocalDate getARandomJoiningDate(){
        int startYear = LocalDate.now().getYear() - 40;
        int EndYear = LocalDate.now().getYear() ;

        return generateADate(startYear,EndYear);

    }

    public LocalDate generateADate(int startYear, int endYear) {
        int day = randomInteger.getRandomIntBetween(1,31);
        int month = randomInteger.getRandomIntBetween(1, 12);
        int year = randomInteger.getRandomIntBetween(startYear, endYear);
        if ((month == 4 || month == 6  || month == 9 || month == 11) && (day==31)) {
            day = day - 1;
        }
        if ((month == 2) && (day>=29)){
            if(year%4==0) { day = 29; }
            else { day = 28;}
        }

        return LocalDate.of(year, month, day);

    }

}
