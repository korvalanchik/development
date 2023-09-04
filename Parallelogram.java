package ShapeAndSo;

public class Parallelogram extends Shape{
    private double a, b, angle;
    @Override
    public String name() {
        return "Parallelogram";
    }

    @Override
    public void input(double sideA, double sideB, double angleA) {
        a = sideA;
        b = sideB;
        angle = angleA;
    }

    @Override
    public double area() {
        return a * b * Math.sin(Math.toRadians(angle));
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double[] getParam() {
        return new double[]{a, b, angle};
    }

    @Override
    public String toString() {
        return "Parameter: Side down=" + a +  ", side left=" + b + ", angle=" + angle;
    }
}
