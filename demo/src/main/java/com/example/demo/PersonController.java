package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.List;


@RestController
@RequestMapping("/api/people")
public class PersonController {
    // Inyectar el servicio de personas
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person person = personService.getPersonById(id);
        if (person != null) {
            return ResponseEntity.ok(person);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person savedPerson = personService.addPerson(person);
        return ResponseEntity.ok(savedPerson);
    }

    @GetMapping("/bornIn/{cityName}")
    public List<Person> getPeopleBornInCity(@PathVariable String cityName) {
        return personService.getPeopleBornInCity(cityName);
    }
}