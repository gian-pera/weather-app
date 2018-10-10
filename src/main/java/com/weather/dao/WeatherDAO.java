package com.weather.dao;

import java.util.List;

import com.weather.model.WeatherLog;

/**
 * Provides logic for accessing {@link WeatherLog} objects from the DB.
 */
public interface WeatherDAO {

	/**
	 * Retrieves a list of recently requested {@link WeatherLog} data.
	 * @return the list of recently requested {@link WeatherLog} data.
	 */
	public List<WeatherLog> getRecentRequests();
	
	/**
	 * Persists a {@link WeatherLog} object to the DB.
	 */
	public void persist(WeatherLog weatherLog);
}
