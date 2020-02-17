package com.example.weather.service;

import com.example.weather.domain.Weather;


public interface WeatherService {
	public Weather getWeather(String city);
}
