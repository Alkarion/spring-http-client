package com.kmarkiewicz.springhttpclient.services;

import com.kmarkiewicz.springhttpclient.api.domain.Nationality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

        @Autowired
        ApiService apiService;

        @Test
        public void testGetNationalities() throws Exception{

            Nationality[] nationalities = apiService.getNationalities("jack");

            Assertions.assertEquals(3, nationalities.length);

        }


}
