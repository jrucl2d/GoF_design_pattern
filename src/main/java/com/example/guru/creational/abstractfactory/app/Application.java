package com.example.guru.creational.abstractfactory.app;

import com.example.guru.creational.abstractfactory.buttons.Button;
import com.example.guru.creational.abstractfactory.checkboxes.Checkbox;
import com.example.guru.creational.abstractfactory.factories.GUIFactory;

/**
 * 팩토리 사용자는 추상화된 인터페이스로 팩토리와 Product를 사용함르ㅗ 어떤 구체적인 팩토리인지 신경을 쓰지 않는다.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
