package com.zahorulko.weatherobserver.service;

import com.zahorulko.weatherobserver.dto.WeatherDataDto;

public interface MessageService {

    void postWeatherData(WeatherDataDto data);

}
