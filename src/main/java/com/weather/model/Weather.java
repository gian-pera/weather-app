package com.weather.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains weather data.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "WeatherLog")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Weather implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private long id;
	
	@Column
	@NotBlank
	@JsonProperty
	private String responseId;

	@Column
	@NotBlank
	@JsonProperty
	private String location;

	@Column
	@NotBlank
	@JsonProperty
	private String actualWeather;

	@Column
	@NotBlank
	@JsonProperty
	private String temperature;

	@Column(nullable = false)
	@JsonProperty
	private Date timestamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActualWeather() {
		return actualWeather;
	}

	public void setActualWeather(String actualWeather) {
		this.actualWeather = actualWeather;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
