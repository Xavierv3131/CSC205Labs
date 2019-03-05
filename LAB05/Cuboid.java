package LAB05;

class Cuboid extends AbstractShape 

{ 

    private double length; 

    private double width; 

    private double height; 

     

    public Cuboid(double len, double wid, double ht) //constructor 

    {        

       length = len; 

       width  = wid; 

       height = ht; 

    } 

    public double area() 

    { 

    double area = 2 * (length * width + width * height + length * height); 

 

       return area; 

    }  

    public double perimeter() 

    { 

       return 0.0; 

 } 

    public double volume() 

    { 

  return length * width * height; 

    }  

} 
