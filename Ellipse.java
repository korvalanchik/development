package ShapeAndSo;

public class Ellipse extends Shape{
    private double r1 = 0, r2 = 0;
    @Override
    public String name() {
        return "Ellipse";
    }

    @Override
    public void input(double radiusOne, double radiusTwo)
    {
        r1 = radiusOne;
        r2 = radiusTwo;
    }
    @Override
    public double area()
    {
        return Math.PI * r1 * r2;
    }

    @Override
    public double perimeter() {
        return  2 * Math.PI * Math.sqrt((r1*r1+r2*r2)/2);
    }

    @Override
    public double[] getParam() {
        return new double[]{r1, r2};
    }

    @Override
    public String toString() {
        return "Parameter: radius 1=" + r1 +  ", radius 2=" + r2;
    }
}
