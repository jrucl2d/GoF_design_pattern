package com.example.guru.creational.builder;

import com.example.guru.creational.builder.builders.CarBuilder;
import com.example.guru.creational.builder.builders.CarManualBuilder;
import com.example.guru.creational.builder.cars.Car;
import com.example.guru.creational.builder.cars.Manual;
import com.example.guru.creational.builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // director는 client 코드로부터 구체적인 builder를 받는다.
        // 특별한 Product를 받는 데 어떤 builder를 쓸지 어플리케이션이 더 잘 알기 때문이다.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // 최종 Product는 보통 builder 객체를 통해서 찾는다.
        // 따라서 director는 구체적인 builder, Product에 대해서 모르거나 의존하지 않는다.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // director는 몇몇 빌딩 레시피를 알고 있을 수 있다.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}