import java.util.Scanner;

public class poundsToKilos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // Calculate kilos
        double kilos = .454 * pounds;

        System.out.println(pounds + " pounds is " + kilos + " kilograms.");

    }
}