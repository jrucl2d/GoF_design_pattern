package com.example.guru.creational.builder.director;

import com.example.guru.creational.builder.builders.Builder;
import com.example.guru.creational.builder.cars.CarType;
import com.example.guru.creational.builder.components.Engine;
import com.example.guru.creational.builder.components.GPSNavigator;
import com.example.guru.creational.builder.components.Transmission;
import com.example.guru.creational.builder.components.TripComputer;

/**
 * Director 클래스는 빌딩 단계의 순서를 정의한다. 공통의 Builder 인터페이스를 통해서 작동한다.
 * 따라서 생성될 Product에 대해서 알지 못할수도 있다.
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}