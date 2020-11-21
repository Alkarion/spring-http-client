package com.kmarkiewicz.springhttpclient.services;

import com.kmarkiewicz.springhttpclient.api.domain.Nationality;

public interface ApiService {

    Nationality[] getNationalities(String name);
}
