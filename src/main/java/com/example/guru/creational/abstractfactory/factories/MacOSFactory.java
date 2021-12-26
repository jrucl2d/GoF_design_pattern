package com.example.guru.creational.abstractfactory.factories;

import com.example.guru.creational.abstractfactory.buttons.Button;
import com.example.guru.creational.abstractfactory.buttons.MacOSButton;
import com.example.guru.creational.abstractfactory.checkboxes.Checkbox;
import com.example.guru.creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * 각 구체적인 팩토리는 베이스 팩토리를 확장하고 한 변형에 해당하는 Product를 생성할 책임을 갖음
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
