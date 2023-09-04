package ShapeAndSo;

public class Rectangle extends Shape{
    private double w = 0, h = 0;
    @Override
    public String name() {
        return "Rectangle";
    }
    @Override
    public void input(double width, double height)
    {
        w = width;
        h = height;
    }
    public double area()
    {
        return  w * h;
    }
    @Override
    public double perimeter() {
        return (w + h)*2;
    }
    @Override
    public String toString() {
        return "Parameters: width=" + w + ", height=" + h;
    }
    @Override
    public double[] getParam() {
        return new double[]{w, h};
    }

}
