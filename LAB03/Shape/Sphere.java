package LAB03.Shape;

public class Sphere extends AbstractShape
{
    private double radius;
    private int numSpheresCreated = 0;

    public Sphere(double rad)
    {
        assert (rad >= 0) :
                "Radius must be positive";
        radius = rad;
        incrementNumSpheresCreated();
        incrementNumShapesCreated();
    }
    public double area()
    {
        double area = 4* Math.pow((radius), 2) * Math.PI;
        assert (area >= 0) : "Area must be positive";
        return area;
    }
    public double perimeter()
    {
        return 0.0;
    }
    public double volume()
    {
        double volume = (4 * Math.pow((radius), 3) * Math.PI)/3.0;
        assert (volume >= 0) : "Volume must be positive";
        return volume;
    }
    public void incrementNumSpheresCreated()
    {
        numSpheresCreated++;
    }
}
