package com.weather.controller;

import org.springframework.http.ResponseEntity;

/**
 * Provides REST-API functionalities for the {@link Weather} object.
 */
public interface WeatherRestController {
	
	/**
	 * Retrieves the current {@link Weather} of a city.
	 * @param location the city to retrieve the {@link Weather} from
	 * @return current {@link Weather} of the city.
	 */
	ResponseEntity<?> getWeather(String location);
	
	/**
	 * Retrieves the recently requested {@link Weather} information.
	 * @return the list of recently requested {@link Weather} information.
	 */
	ResponseEntity<?> getRecentRequests();
}
