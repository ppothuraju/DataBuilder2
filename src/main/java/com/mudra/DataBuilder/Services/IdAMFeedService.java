package com.mudra.DataBuilder.Services;

import com.mudra.DataBuilder.Entity.Persons;

import java.util.List;

public interface IdAMFeedService {


    void addPersons(Persons personsData);

    List<Persons> getPersons();
}
