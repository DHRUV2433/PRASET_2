//This program is run by Dhruv Vekariya(21CE152)
public class circle {
    final double pi = 3.14;
    public double radius;
    public double area,parimeter;
    circle()
    {
        radius=1;
    }
    circle(double radius)
    {
        this.radius=radius;
    }
    double getArea()
    {
        area = pi*radius*radius;
        return area;
    }
    double getParimeter()
    {
        parimeter = 2*pi*radius;
        return parimeter;
    }
}



















