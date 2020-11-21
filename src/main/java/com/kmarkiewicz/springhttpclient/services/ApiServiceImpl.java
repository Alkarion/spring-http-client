package com.kmarkiewicz.springhttpclient.services;

import com.kmarkiewicz.springhttpclient.api.domain.Nationality;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiServiceImpl  implements  ApiService{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Nationality[] getNationalities(String name){

        Nationality[] nationalities = restTemplate.getForObject("https://api.nationalize.io?name=" + name, Nationality[].class);
        return nationalities;
    }
}
