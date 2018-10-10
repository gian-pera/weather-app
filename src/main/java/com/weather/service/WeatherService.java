package com.weather.service;

import java.util.List;

import com.weather.model.WeatherLog;

/**
 * Provides logic for processing {@link WeatherLog} objects.
 */
public interface WeatherService {

	/**
	 * Retrieves the current {@link WeatherLog} of a city.
	 * @param location the city to retrieve the {@link WeatherLog} from
	 * @return current {@link WeatherLog} of the city.
	 */
	WeatherLog getWeather(String location);
	
	/**
	 * Retrieves a list of recently requested {@link WeatherLog} data.
	 * @return the list of recently requested {@link WeatherLog} data.
	 */
	List<WeatherLog> getRecentRequests();
}
