package com.example.gof.structure;

import java.io.InputStream;

// 문자 스트림을 받아서 토큰을 생성
public class Scanner {
    private InputStream inputStream;

    public Scanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Token scan() {
        return null;
    }

    public static class Token {}
}
