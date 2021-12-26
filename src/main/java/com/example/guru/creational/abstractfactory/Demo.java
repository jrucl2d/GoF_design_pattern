package com.example.guru.creational.abstractfactory;

import com.example.guru.creational.abstractfactory.app.Application;
import com.example.guru.creational.abstractfactory.factories.GUIFactory;
import com.example.guru.creational.abstractfactory.factories.MacOSFactory;
import com.example.guru.creational.abstractfactory.factories.WindowsFactory;

import java.util.Locale;

/**
 * 데모 클래스.
 */
public class Demo {

    // 어플리케이션은 런타임(보통 초기화 단계)에 설정 및 환경 변수에 따라 팩토리의 타입을 선택하고 생성한다.
    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
