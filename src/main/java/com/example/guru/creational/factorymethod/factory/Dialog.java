package com.example.guru.creational.factorymethod.factory;

import com.example.guru.creational.factorymethod.buttons.Button;

/**
 * 베이스 Factory 클래스. 다양한 Product 객체들이 필요한 코어 비즈니스 로직을 포함한다.
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... 다른 코드 ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 서브 클래스에서 이 메소드를 오버라이딩 해서 구체적인 버튼 객체를 생성할 것.
     */
    public abstract Button createButton();
}
