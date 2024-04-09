package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonService {

    // Simulación de una base de datos en memoria para almacenar las personas
    private final Map<Long, Person> personMap = new HashMap<Long,Person>();
    private long currentId = 1;

    public Person getPersonById(Long id) {
        return personMap.get(id);
    }

    public List<Person> getAllPeople() {
        return new ArrayList<>(personMap.values());
    }

    public Person addPerson(Person person) {
        person.setId(currentId++);
        personMap.put(person.getId(), person);
        return person;
    }

    public List<Person> getPeopleBornInCity(String cityName) {
        List<Person> peopleInCity = new ArrayList<Person>();
        for (Person person : personMap.values()) {
            if (person.getBornIn().getName().equalsIgnoreCase(cityName)) {
                peopleInCity.add(person);
            }
        }
        return peopleInCity;
    }
}