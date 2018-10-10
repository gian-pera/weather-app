package com.weather.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weather.model.WeatherLog;
import com.weather.service.WeatherService;

/**
 * Default implementation of {@link WeatherRestController}.
 */
@RestController
@RequestMapping("/rest/1/weather")
public class DefaultWeatherRestController implements WeatherRestController {
	
	@Autowired
	private WeatherService weatherService;
	
	@Autowired
	private HttpHeaders httpHeaders;

	/**
	 * {@inheritDoc}
	 */
	@RequestMapping(value = "/{location}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WeatherLog> getWeather(@PathVariable String location) {
		
		WeatherLog weather = weatherService.getWeather(location);
		
		HttpStatus status = HttpStatus.OK;
		if (Objects.isNull(weather)) {
			status = HttpStatus.NOT_FOUND;
		}
		
		return new ResponseEntity<WeatherLog>(weather, httpHeaders, status);
	}

	/**
	 * {@inheritDoc}
	 */
	@RequestMapping(value = "/recent", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<WeatherLog>> getRecentRequests() {
		// TODO get recent data from service
		return null;
	}
}
