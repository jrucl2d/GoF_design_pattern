package com.example.guru.creational.builder.builders;

import com.example.guru.creational.builder.cars.CarType;
import com.example.guru.creational.builder.cars.Manual;
import com.example.guru.creational.builder.components.Engine;
import com.example.guru.creational.builder.components.GPSNavigator;
import com.example.guru.creational.builder.components.Transmission;
import com.example.guru.creational.builder.components.TripComputer;

/**
 * 다른 Creational 패턴과는 다르게 Builder 패턴은 서로 연관 없는 Product를 만들 수 있다.
 * 이들은 공통의 interface를 갖지 않는다.
 *
 * 이 경우에서 자동차의 유저 매뉴얼을 만드는데 자동차를 만들 때 사용했던 같은 단계를 사용한다.
 * 특정 자동차 모델에 대한 매뉴얼을 다른 특징을 갖도록 생성할 수 있다.
 */
public class CarManualBuilder implements Builder{
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}