package com.example.guru.structural.adapter;

import com.example.guru.structural.adapter.adapters.SquarePegAdapter;
import com.example.guru.structural.adapter.round.RoundHole;
import com.example.guru.structural.adapter.round.RoundPeg;
import com.example.guru.structural.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("둥근 못은 둥근 구멍에 맞는다.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // 컴파일 되지 않는 코드!

        // 어댑터를 사용해서 문제를 해결한다.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("작은 사각형 못은 둥근 구멍에 맞는다.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("큰 사각형 못은 둥근 구멍에 들어갈 수 없다.");
        }
    }
}
