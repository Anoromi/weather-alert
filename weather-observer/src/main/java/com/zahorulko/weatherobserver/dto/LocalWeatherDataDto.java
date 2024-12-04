package com.zahorulko.weatherobserver.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LocalWeatherDataDto {
    private double windDirectionX;
    private double windDirectionY;
    private double windSpeed;
    private double temperature;
}
