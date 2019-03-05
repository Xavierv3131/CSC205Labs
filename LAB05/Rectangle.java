package LAB05;

class Rectangle extends AbstractShape 
{ 
    private double length; 
    private double width;  

    public Rectangle(double len, double wid) //constructor 
    {   

       length = len; 
       width  = wid; 
    } 

    public double area() 
    { 

    double area = length * width; 
       return area; 
    }  

    public double perimeter() 
    { 

    double perimeter = 2 * (length + width);    
       return perimeter; 
 } 

    public double volume() 
    { 
  return 0.0; 

 } 

} 