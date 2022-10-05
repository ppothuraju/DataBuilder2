package com.mudra.DataBuilder.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(name="first_name")
    public String firstName;
    @Column(name="last_name")
    public String lastName;
    @Column(name="email")
    public String email;
    @Column(name="department")
    public String department;

//    public Employee(String firstName, String lastName, String email, String department) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email=email;
//        this.department=department;
//    }

    public Employee() {

    }

//    @Override
//    public String toString() {
//        return String.format("Employee[id=%d, firstName='%s', lastName='%s',email='%s',department='%s']", id, firstName, lastName,email,department);
//    }
}
