package com.weather.orm;

import com.weather.model.Weather;

/**
 * Provides ORM capabilities to connect to the weather the datasource. 
 */
public interface WeatherORM {
	
	/**
	 * Retrieves the current {@link Weather} of a city.
	 * @param location the city to retrieve the {@link Weather} from
	 * @return current {@link Weather} of the city.
	 */
	Weather getWeather(String location);
}
