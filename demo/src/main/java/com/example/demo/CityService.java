package com.example.demo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityService {

    // Simulación de una base de datos en memoria para almacenar las ciudades
    private final Map<String, City> cityMap = new HashMap<>();

    public CityService() {
        // Agregar algunas ciudades de ejemplo
        City city1 = new City("001", "Bogotá");
        City city2 = new City("002", "Medellín");
        City city3 = new City("003", "Cali");

        cityMap.put(city1.getDaneCode(), city1);
        cityMap.put(city2.getDaneCode(), city2);
        cityMap.put(city3.getDaneCode(), city3);
    }

    public City getCityByDaneCode(String daneCode) {
        return cityMap.get(daneCode);
    }

    public List<City> getAllCities() {
        return new ArrayList<>(cityMap.values());
    }

    public City addCity(City city) {
        cityMap.put(city.getDaneCode(), city);
        return city;
    }
}