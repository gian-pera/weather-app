package com.weather.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
* Contains weather data from an external source.
*/
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherDTO implements Serializable {

	@JsonProperty("main")
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
