package com.weather.service;

import com.weather.model.Weather;

/**
 * Provides logic for processing {@link Weather} objects.
 */
public interface WeatherService {

	/**
	 * Retrieves the current {@link Weather} of a city.
	 * @param location the city to retrieve the {@link Weather} from
	 * @return current {@link Weather} of the city.
	 */
	Weather getWeather(String location);
	
}
