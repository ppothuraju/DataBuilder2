package com.mudra.DataBuilder.Utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GetConstants {

    public String[] myhrEmpTypelist = new String[]{"Employee","Non-Employee"};
    public List<String> jpaEmpTypelist = new ArrayList<>();
    public List<String> rfaEmpTypelist = new ArrayList<>();
    public String unSpecifiedValue = "Unspecified";

    public GetConstants(RandomInteger randomInteger) {
    }

    public String getMyHREmpType(int index){

        return myhrEmpTypelist[index];

    }

}
