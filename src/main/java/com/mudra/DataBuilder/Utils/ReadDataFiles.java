package com.mudra.DataBuilder.Utils;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;

@Component
public class ReadDataFiles {

    public String readFirstNames() throws IOException {
        return new String(Files
                .readAllBytes(ResourceUtils
                        .getFile("classpath:firstName.data")
                            .toPath()));
    }

    public String readLastNames() throws IOException {
        return new String(Files
                .readAllBytes(ResourceUtils
                        .getFile("classpath:lastName.data")
                            .toPath()));
    }

    public String readMiddleNames() throws IOException {
        return new String(Files
                .readAllBytes(ResourceUtils
                        .getFile("classpath:middleName.data")
                            .toPath()));
    }
    public String readGrade() throws IOException {
        return new String(Files
                .readAllBytes(ResourceUtils
                        .getFile("classpath:grades.data")
                        .toPath()));
    }
    public String readPositionTitle() throws IOException {
        return new String(Files
                .readAllBytes(ResourceUtils
                        .getFile("classpath:positionTitle.data")
                        .toPath()));
    }

    public String readSalaryAdminPlan() throws IOException {
        return new String(Files
                .readAllBytes(ResourceUtils
                        .getFile("classpath:salaryAdminPlan.data")
                        .toPath()));
    }
}
