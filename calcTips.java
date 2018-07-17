import java.util.Scanner;

public class calcTips{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        // Calculate total
        double total = subtotal + subtotal * gratuity * .01;

        System.out.println("The gratuity is $" + subtotal * gratuity * .01 + " and the total is $" + total);
    }
}