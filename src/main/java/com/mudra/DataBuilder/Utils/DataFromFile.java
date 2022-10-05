package com.mudra.DataBuilder.Utils;

import com.mudra.DataBuilder.Services.ExcelReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DataFromFile {

    @Autowired
    private static ReadDataFiles readDataFiles = null;
    @Autowired
    private final RandomInteger randomInteger;



    public DataFromFile(ReadDataFiles readDataFiles, RandomInteger randomInteger) {
        DataFromFile.readDataFiles = readDataFiles;
        this.randomInteger = randomInteger;
       }

    public String getLastNames() throws IOException {
        List<String> surname = Arrays
                .stream(readDataFiles.readLastNames()
                        .split("(\\r\\n)"))
                .collect(Collectors.toList());

        int randomIndex = randomInteger.getRandomIntWithin(surname.size());

        if (randomIndex<=surname.size()){
            return surname.get(randomIndex);
        }
        else return surname.get(surname.size()-1);
    }
    public String getFirstNames() throws IOException {
        List<String> givenName = Arrays
                .stream(readDataFiles.readFirstNames()
                        .split("(\\r\\n)"))
                .collect(Collectors.toList());

        int randomIndex = randomInteger.getRandomIntWithin(givenName.size());

        if (randomIndex<=givenName.size()){
            return givenName.get(randomIndex);
        }
        else return givenName.get(givenName.size()-1);
    }

    public String getmiddleNames() throws IOException {
        List<String> middleNames = Arrays
                .stream(readDataFiles.readMiddleNames()
                        .split("(\\r\\n)"))
                .collect(Collectors.toList());
//return middleNames.toString();
        int randomIndex = randomInteger.getRandomIntWithin(middleNames.size());

        if (randomIndex<=middleNames.size()){
            return middleNames.get(randomIndex);
        }
        else return middleNames.get(1);

    }

    public String getGrade() throws IOException {
        List<String> grades = Arrays
                .stream(readDataFiles.readGrade()
                        .split("(\\r\\n)"))
                .collect(Collectors.toList());
        int randomIndex = randomInteger.getRandomIntWithin(grades.size());

        if (randomIndex<=grades.size()){
            return grades.get(randomIndex);
        }
        else return grades.get(1);

    }

    public String getPositionTitle() throws IOException {
        List<String> positionTitle = Arrays
                .stream(readDataFiles.readPositionTitle()
                        .split("(\\r\\n)"))
                .collect(Collectors.toList());
        int randomIndex = randomInteger.getRandomIntWithin(positionTitle.size());

        if (randomIndex<=positionTitle.size()){
            return positionTitle.get(randomIndex);
        }
        else return positionTitle.get(1);

    }

    public String getSalaryAdminPlan() throws IOException {
        List<String> salaryAdminPlan = Arrays
                .stream(readDataFiles.readSalaryAdminPlan()
                        .split("(\\r\\n)"))
                .collect(Collectors.toList());
        int randomIndex = randomInteger.getRandomIntWithin(salaryAdminPlan.size());

        if (randomIndex<=salaryAdminPlan.size()){
            return salaryAdminPlan.get(randomIndex);
        }
        else return salaryAdminPlan.get(1);

    }
}
