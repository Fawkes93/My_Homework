//Create a class named Circle with fields named radius, diameter, and area.
//Include a constructor that sets the radius to 1 and calculates the other two values.Also
//include methods named setRadius()and getRadius(). The setRadius() method
//not only sets the radius, it also calculates the other two values. (The diameter of a circle
//is twice the radius, and the area of a circle is pi multiplied by the square of the radius.
//Use the Math class PI constant for this calculation.) Save the class as Circle.java.


public class Circle {
   private double radius, diameter, area;

    public Circle(){
        
        this.radius =1;
        this.diameter = (radius * 2);
        this.area = Math.pow(radius, 2) * Math.PI;
    }
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
        this.diameter = (getRadius() * 2);
        this.area = Math.pow(radius, 2) * Math.PI;
    }
    public double getDiameter(){
        return diameter;
    }
    public double getArea(){
        return area;
    }
}
