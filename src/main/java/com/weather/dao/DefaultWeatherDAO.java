package com.weather.dao;

import java.util.List;

import com.weather.model.WeatherLog;

/**
 * Default implementation of {@link WeatherDAO}.
 */
public class DefaultWeatherDAO implements WeatherDAO {

	@Override
	public List<WeatherLog> getRecentRequests() {
		// TODO retrieve recent requests from the DB
		return null;
	}

	@Override
	public void persist(WeatherLog weatherLog) {
		// TODO persist a weather log to the DB

	}

}
