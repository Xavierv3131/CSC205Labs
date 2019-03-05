package LAB05;

class Sphere extends AbstractShape 

{ 

    private double radius; 

    public Sphere(double rad) //constructor 

    { 

       radius = rad; 

    } 

    public double area() 

    { 

  double area = 4.0 * Math.PI * radius * radius; 

        return area; 

    }  

    public double perimeter() 

    { 

    return 0.0; 

    } 

    public double volume() 

    { 

     double vol = (4.0/3) * Math.PI * radius * radius * radius; 

         return vol; 

    } 

} 
