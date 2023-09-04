package ShapeAndSo;

public class Trapezoid extends Shape{
    private double a, b, c, d;
    @Override
    public String name() {
        return "Trapezoid";
    }

    @Override
    public void input(double SideA, double SideB, double SideC, double sideD) {
        a = SideA; b = SideB; c = SideC; d = sideD;
    }

    @Override
    public double area() {
        if ((a != c) && (a <= (b + d))) {
            double temp = ((a - c) * (a - c) + b * b - d * d) / (2 * (a - c));
            return (a + c) / 2 * Math.sqrt(b * b - temp * temp);
        } else return -1;

    }

    @Override
    public double perimeter() {
        return a+b+c+d;
    }

    @Override
    public double[] getParam() {
        return new double[]{a, b, c, d};
    }

    @Override
    public String toString() {
        return "Parameter: Side A=" + a + ", side B=" + b + ", side C=" + c + ", side D=" + d;
    }
}
