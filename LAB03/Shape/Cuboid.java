package LAB03.Shape;

public class Cuboid extends AbstractShape
{
    private double length;
    private double width;
    private double height;
    private int numCuboidsCreated = 0;

    public Cuboid(double len, double wid, double hei)
    {
        assert (len >= 0 && wid >= 0 && hei >= 0) :
                "Length and width must be positive";
        length = len;
        width = wid;
        height = hei;
        incrementNumCuboidsCreated();
        incrementNumShapesCreated();
    }
    public double area()
    {
        double area = 2 * (length * width + width * height + height * length);
        assert (area >= 0) : "Area must be positive";
        return area;
    }
    public double perimeter()
    {
        return 0.0;
    }
    public double volume()
    {
        double volume = length * width * height;
        assert (volume >= 0) : "Volume must be positive";
        return volume;
    }
    public void incrementNumCuboidsCreated()
    {
        numCuboidsCreated++;
    }
}
