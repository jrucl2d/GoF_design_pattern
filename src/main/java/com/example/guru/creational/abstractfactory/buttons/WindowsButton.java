package com.example.guru.creational.abstractfactory.buttons;

/**
 * 모든 Product family는 같은 변형 종류를 갖음(MacOS/Windows)
 *
 * Button Product의 Windows 변형
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button 생성!");
    }
}
