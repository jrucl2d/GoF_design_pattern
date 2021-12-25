package com.example.guru.creational.factorymethod.factory;

import com.example.guru.creational.factorymethod.buttons.Button;
import com.example.guru.creational.factorymethod.buttons.HtmlButton;

/**
 * HTML 버튼을 생성할 HTML Dialog
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
