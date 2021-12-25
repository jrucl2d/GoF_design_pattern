package com.example.guru.creational.factorymethod;

import com.example.guru.creational.factorymethod.factory.Dialog;
import com.example.guru.creational.factorymethod.factory.HtmlDialog;
import com.example.guru.creational.factorymethod.factory.WindowsDialog;

/**
 * client 코드
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * 설정 혹은 환경 옵션에 따라 Concrete Factory가 선택된다.
     */
    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * 모든 client 코드는 추상화된 인터페이스를 통해서만 Factory 혹은 Product 객체와 상호작용한다.
     * 어떤 Product 객체를 리턴받든지 상관 없이 Factory 객체를 사용한다.
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
