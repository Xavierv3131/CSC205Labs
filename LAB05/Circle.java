package LAB05;

class Circle extends AbstractShape 

{ 

    private double radius; 

   

    public Circle(double rad) //constructor 

    {              

       radius = rad;       

    } 

    public double area() 

    { 

    double area = Math.PI * radius * radius; 

        return area; 

    }  

    public double perimeter() 

    { 

    double perimeter = 2 * Math.PI * radius; 

 

       return perimeter; 

 

 } 

    public double volume() 

    { 

  return 0.0; 

    } 

} 
