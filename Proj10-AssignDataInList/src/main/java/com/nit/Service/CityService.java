package com.nit.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.config.AppProperties;

@Service
public class CityService {

    @Autowired
    private AppProperties appProperties;

    public void printCities() {
        appProperties.getCities().forEach(System.out::println);
        appProperties.getPincode().forEach(System.out::println);
    }
}