package com.weather.orm;

import com.weather.model.WeatherLogDTO;

/**
 * Provides ORM capabilities to connect to the open weather the datasource. 
 */
public interface WeatherORM {
	
	/**
	 * Requests a {@link WeatherLogDTO} of a city.
	 * @param location the city to retrieve the {@link WeatherLogDTO} from.
	 * @return the current {@link WeatherLogDTO} of the city.
	 */
	WeatherLogDTO requestWeather(String location);
}
