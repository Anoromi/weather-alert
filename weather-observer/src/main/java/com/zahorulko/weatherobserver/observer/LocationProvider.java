package com.zahorulko.weatherobserver.observer;

import com.zahorulko.weatherobserver.types.Location;

public interface LocationProvider {

    Location getLocation();
}
