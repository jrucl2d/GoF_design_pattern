package com.example.guru.structural.adapter.square;

/**
 * 사각형 못은 둥근 구멍과 맞지 않는다. (이전의 개발팀이 개발한 코드이다)
 * 하지만 이 프로그램에 이 클래스를 통합해야 한다.
 */
public class SquarePeg
{
    private double width;

    public SquarePeg() {}

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
