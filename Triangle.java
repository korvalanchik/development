package ShapeAndSo;

public class Triangle extends Shape{
    private double b = 0, a = 0, c = 0;
    @Override
    public String name() {
        return "Triangle";
    }

    @Override
    public void input(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area()
    {
        double p = perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
    @Override
    public String toString() {
        return "Parameters: side 1=" + a + ", side 2=" + b + ", side 3=" + c;
    }
    @Override
    public double[] getParam() {
        return new double[]{a, b, c};
    }
}
