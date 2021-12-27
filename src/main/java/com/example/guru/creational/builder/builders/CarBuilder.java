package com.example.guru.creational.builder.builders;

import com.example.guru.creational.builder.cars.Car;
import com.example.guru.creational.builder.cars.CarType;
import com.example.guru.creational.builder.components.Engine;
import com.example.guru.creational.builder.components.GPSNavigator;
import com.example.guru.creational.builder.components.Transmission;
import com.example.guru.creational.builder.components.TripComputer;

/**
 * 공통의 인터페이스에 정의된 단계를 구현하는 구체적인 Builder
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
