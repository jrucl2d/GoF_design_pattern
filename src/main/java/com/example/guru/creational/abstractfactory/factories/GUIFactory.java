package com.example.guru.creational.abstractfactory.factories;

import com.example.guru.creational.abstractfactory.buttons.Button;
import com.example.guru.creational.abstractfactory.checkboxes.Checkbox;

/**
 * 모든 추상 Product 타입을 알고 있는 추상 팩토리
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
