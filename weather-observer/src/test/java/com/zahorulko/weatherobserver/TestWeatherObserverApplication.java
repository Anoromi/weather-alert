package com.zahorulko.weatherobserver;

import org.springframework.boot.SpringApplication;

public class TestWeatherObserverApplication {

    public static void main(String[] args) {
        SpringApplication.from(WeatherObserverApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
