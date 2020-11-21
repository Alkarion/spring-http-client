
package com.kmarkiewicz.springhttpclient.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Nationality implements Serializable
{

    public String name;
    public List<Country> country = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2959196891586036676L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
