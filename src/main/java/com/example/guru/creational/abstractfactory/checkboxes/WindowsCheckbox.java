package com.example.guru.creational.abstractfactory.checkboxes;
/**
 * 모든 Product family는 같은 변형 종류를 갖음(MacOS/Windows)
 *
 * Checkbox Product의 Windows 변형
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows 체크박스 생성!");
    }
}
