package com.mudra.DataBuilder.Utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class GeneratePersonNumber implements IdentifierGenerator {

    @Autowired
    private final RandomInteger randomInteger;

    public GeneratePersonNumber(RandomInteger randomInteger) {
        this.randomInteger = randomInteger;
    }

    public long generatePersonNumber() {
        return randomInteger.getRandomIntBetween(10001,99999);
    }


    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return this.generatePersonNumber();
    }


}
