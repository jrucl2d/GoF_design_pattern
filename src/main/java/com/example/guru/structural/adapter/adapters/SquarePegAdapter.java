package com.example.guru.structural.adapter.adapters;

import com.example.guru.structural.adapter.round.RoundPeg;
import com.example.guru.structural.adapter.square.SquarePeg;

/**
 * 어댑터는 사각형 못을 둥근 구멍에 맞게 해준다.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // 이 못에 들어맞는 최소의 둥근 반지름을 계산한다.
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
