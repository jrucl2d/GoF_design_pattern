package com.example.guru.creational.singleton.multithread;

// Thread safe하지 않은 경우를 위한 Singleton
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // 늦은 초기화를 묘사한다.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}