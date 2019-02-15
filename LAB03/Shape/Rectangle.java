package LAB03.Shape;

public class Rectangle extends AbstractShape
{
    private double length;
    private double width;
    private int numRectanglesCreated = 0;

    public Rectangle(double len, double wid)
    {
        assert (len >= 0 && wid >= 0) :
                "Length and width must be positive";
        length = len;
        width = wid;
        incrementNumRectanglesCreated();
        incrementNumShapesCreated();
    }
    public double area()
    {
        double area = length * width;
        assert (area >= 0) : "Area must be positive";
        return area;
    }
    public double perimeter()
    {
        double perimeter = 2 * (length + width);
        assert (perimeter >= 0) : "Perimeter must be positive";
        return perimeter;
    }
    public double volume()
    {
        return 0.0;
    }
    public void incrementNumRectanglesCreated()
    {
        numRectanglesCreated++;
    }
}
