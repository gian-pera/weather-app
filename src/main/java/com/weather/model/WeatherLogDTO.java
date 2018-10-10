package com.weather.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains weather and temperature data from an external source.
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherLogDTO implements Serializable {

	@JsonProperty("name")
	private String location;
	
	@JsonProperty("main")
	private TemperatureDTO temperature;
	
	@JsonProperty
	private List<WeatherDTO> weather;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public TemperatureDTO getTemperature() {
		return temperature;
	}

	public void setTemperature(TemperatureDTO temperature) {
		this.temperature = temperature;
	}

	public List<WeatherDTO> getWeather() {
		return ObjectUtils.defaultIfNull(weather, new ArrayList<WeatherDTO>());
	}

	public void setWeather(List<WeatherDTO> weather) {
		this.weather = ObjectUtils.defaultIfNull(weather, new ArrayList<WeatherDTO>());
	}
}
