package com.example.guru.creational.abstractfactory.buttons;

/**
 * Abstract 팩토리는 몇몇의 Product family가 있음을 추정하고 별도의 계층 구조로 구성됨(Button/Checkbox)
 * 같은 family의 모든 Product 객체들은 같은 인터페이스를 구현한다.
 *
 * Button family의 공통 인터페이스
 */
public interface Button {
    void paint();
}
