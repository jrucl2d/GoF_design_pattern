package com.example.guru.creational.abstractfactory.buttons;

/**
 * 모든 Product family는 같은 변형 종류를 갖음(MacOS/Windows)
 *
 * Button Product의 MacOS 변형
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS Button 생성!");
    }
}
