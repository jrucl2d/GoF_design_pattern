package com.example.guru.creational.singleton.threadsafe;

public final class Singleton {
    // 필드를 volatile로 선언하여 락에 대한 더블 체킹이 정확히 동작하도록 한다.
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    // Double-Checked Locking(DCL)이라고 불리는 작업.
    // 멀티 스레드 환경에서 여러 스레드가 동시에 싱글톤 인스턴스에 접근해 결과적으로 여러 인스턴스가 생성되는 race condition 방지용.

    // 'result'라는 변수를 왜 사용하는지 이해 안 될 수 있다.
    // 하지만 자바에서 이 로컬 변수를 사용해 더블 체킹을 구현하는 것은 매우 중요한 경고이다.
    // 자바 DCL 이슈에 대해서는 여기서 더 자세히 볼 수 있다 : https://refactoring.guru/java-dcl-issue
    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
