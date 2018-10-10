package com.weather.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.model.WeatherLog;
import com.weather.model.WeatherLogDTO;
import com.weather.orm.WeatherORM;

/**
 * Default implementation of {@link WeatherService}.
 */
@Service
public class DefaultWeatherService implements WeatherService {

	@Autowired
	private WeatherORM weatherORM;
	
	/**
	 * {@inheritDoc}
	 */
	public WeatherLog getWeather(String location) {
		
		WeatherLogDTO weatherLogDTO = weatherORM.requestWeather(location);
		if (Objects.isNull(weatherLogDTO)) {
			return null;
		}
		
		WeatherLog weatherLog = new WeatherLog(weatherLogDTO.getLocation(),
				weatherLogDTO.getTemperature().getValue(),
				weatherLogDTO.getWeather().get(0).getValue());
		
		//TODO: save results to DB
		
		return weatherLog;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<WeatherLog> getRecentRequests() {
		// TODO get recent data from DAO
		return null;
	}

}
