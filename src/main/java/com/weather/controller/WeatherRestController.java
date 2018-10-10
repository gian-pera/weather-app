package com.weather.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.weather.model.WeatherLog;

/**
 * Provides REST-API functionalities for the {@link WeatherLog} object.
 */
public interface WeatherRestController {
	
	/**
	 * Retrieves the current {@link WeatherLog} of a city.
	 * @param location the city to retrieve the {@link WeatherLog} from
	 * @return current {@link WeatherLog} of the city.
	 */
	ResponseEntity<WeatherLog> getWeather(String location);
	
	/**
	 * Retrieves a list of recently requested {@link WeatherLog} data.
	 * @return the list of recently requested {@link WeatherLog} data.
	 */
	ResponseEntity<List<WeatherLog>> getRecentRequests();
}
