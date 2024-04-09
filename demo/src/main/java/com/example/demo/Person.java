package com.example.demo;

import java.time.LocalDate;

public class Person {
    private Long id;
    private String name;
    private String lastName;
    private LocalDate dateBirth;
    private City bornIn;
    private int randomNumber;
    private String nameClient;

    public Person() {
        // Constructor por defecto necesario para deserialización JSON
    }

    public Person(Long id, String name, String lastName, LocalDate dateBirth, City bornIn, int randomNumber, String nameClient) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.bornIn = bornIn;
        this.randomNumber = randomNumber;
        this.nameClient = nameClient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public City getBornIn() {
        return bornIn;
    }

    public void setBornIn(City bornIn) {
        this.bornIn = bornIn;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }


}
