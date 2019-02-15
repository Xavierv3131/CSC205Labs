package LAB03.Shape;

public class Circle extends AbstractShape
{
    private double radius;
    private int numCirclesCreated = 0;

    public Circle(double rad)
    {
        assert (rad >= 0) :
                "Radius must be positive";
        radius = rad;
        incrementNumCirclesCreated();
        incrementNumShapesCreated();
    }
    public double area()
    {
        double area = Math.pow((radius), 2) * Math.PI;
        assert (area >= 0) : "Area must be positive";
        return area;
    }
    public double perimeter()
    {
        double perimeter = 2 * (radius * Math.PI);
        assert (perimeter >= 0) : "Perimeter must be positive";
        return perimeter;
    }
    public double volume()
    {
        return 0.0;
    }
    public void incrementNumCirclesCreated()
    {
        numCirclesCreated++;
    }
}
