package com.nit.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "myapp")
public class AppProperties {

    private List<String> cities;
    
    private List<Integer> pincode;

}