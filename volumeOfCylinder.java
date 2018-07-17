import java.util.Scanner; // Scanner is in the java.util package

public class volumeOfCylinder{
    /** Main method */
    public static void main(String[] args){
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // Compute the area
        double area = Math.pow(radius, 2) * PI;

        // Calculate volume
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}