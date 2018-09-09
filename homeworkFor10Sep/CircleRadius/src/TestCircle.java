//Create a class named TestCircle whose main() method declares several Circle
//objects. Using the setRadius() method, assign one Circle a small radius value,
//and assign another a larger radius value. Do not assign a value to the radius of the
//third circle; instead, retain the value assigned at construction. Display all the
//values for all the Circle objects. Save the application as TestCircle.java.
public class TestCircle {
    
    public static void main(String[] args) {
        Circle o1 = new Circle();
        Circle o2 = new Circle();
        Circle o3 = new Circle();
        
        o1.setRadius(3);
        o2.setRadius(35);
        
        System.out.println("Circle1   Radius   Diameter   Area");
        System.out.printf("           " + o1.getRadius() + "         " + o1.getDiameter() + "      " + "'%.3f'", o1.getArea());
        System.out.println("");
        System.out.println("Circle2 ");
        System.out.printf("           " + o2.getRadius() + "         " + o2.getDiameter() + "      " + "'%.3f'", o2.getArea());
        System.out.println("");
        System.out.println("Circle3 ");
        System.out.printf("           " + o3.getRadius() + "         " + o3.getDiameter() + "      " + "'%.3f'", o3.getArea());
        System.out.println("");
    }
}
