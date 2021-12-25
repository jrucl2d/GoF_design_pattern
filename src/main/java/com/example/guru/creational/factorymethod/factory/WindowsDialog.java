package com.example.guru.creational.factorymethod.factory;

import com.example.guru.creational.factorymethod.buttons.Button;
import com.example.guru.creational.factorymethod.buttons.WindowsButton;

/**
 * Windows 버튼을 생성할 Windows Dialog
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
