package ShapeAndSo;

public class Demo {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.input(5,4);
        WhatShape.whatShape(shape);

        shape = new Circle();
        shape.input(1);
        WhatShape.whatShape(shape);

        shape = new Triangle();
        shape.input(2,2,2.828427);
        WhatShape.whatShape(shape);

        shape = new Ellipse();
        shape.input(2,3);
        WhatShape.whatShape(shape);

        shape = new Parallelogram();
        shape.input(2,1, 90);
        WhatShape.whatShape(shape);

        shape = new Trapezoid();
        shape.input(3.1,1, 1, 1);
        WhatShape.whatShape(shape);
    }
}
