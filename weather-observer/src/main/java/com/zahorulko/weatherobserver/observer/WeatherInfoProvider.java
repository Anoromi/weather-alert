package com.zahorulko.weatherobserver.observer;

import com.zahorulko.weatherobserver.dto.LocalWeatherDataDto;
import com.zahorulko.weatherobserver.dto.WeatherDataDto;

public interface WeatherInfoProvider {

    LocalWeatherDataDto measureWeather();
}
