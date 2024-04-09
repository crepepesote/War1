package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    // Inyectar el servicio de ciudades
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/{daneCode}")
    public ResponseEntity<City> getCityByDaneCode(@PathVariable String daneCode) {
        City city = cityService.getCityByDaneCode(daneCode);
        if (city != null) {
            return ResponseEntity.ok(city);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @PostMapping
    public ResponseEntity<City> addCity(@RequestBody City city) {
        City savedCity = cityService.addCity(city);
        return ResponseEntity.ok(savedCity);
    }
}
