package com.example.guru.creational.builder.builders;

import com.example.guru.creational.builder.cars.CarType;
import com.example.guru.creational.builder.components.Engine;
import com.example.guru.creational.builder.components.GPSNavigator;
import com.example.guru.creational.builder.components.Transmission;
import com.example.guru.creational.builder.components.TripComputer;

/**
 * Builder 인터페이스는 모든 가능한 Product 설정을 정의한다.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
