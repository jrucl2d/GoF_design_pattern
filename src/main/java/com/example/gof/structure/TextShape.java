package com.example.gof.structure;

/**
 * adapter 패턴으로 구현
 * 외부의 라이브러리 TextView를 Shape에 맞게 제공
 */
public class TextShape extends Shape {
    private TextView textView;

    public TextShape(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void boundingBox(Shape.Point bottomLeft, Shape.Point topRight) {
        TextView.Coord bottom = new TextView.Coord();
        TextView.Coord left = new TextView.Coord();
        TextView.Coord width = new TextView.Coord();
        TextView.Coord height = new TextView.Coord();

        this.textView.getOrigin(bottom, left);
        this.textView.getExtent(width, height);
    }

    public boolean isEmpty() {
        return this.textView.isEmpty();
    }

    @Override
    public Shape.Manipulator createManipulator() {
        return new TextManipulator(this);
    }

    public static class TextManipulator extends  Manipulator {

        public TextManipulator(TextShape textShape) {
            super();
        }
    }
}
