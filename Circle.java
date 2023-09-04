package ShapeAndSo;
public class Circle extends Shape{
    double r = 0;

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public void input(double radius)
    {
        r = radius;
    }
    @Override
    public double area()
    {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return Math.PI * r * 2;
    }

    @Override
    public double[] getParam() {
        return new double[]{r};
    }

    @Override
    public String toString() {
        return "Parameter: radius=" + r;
    }
}
