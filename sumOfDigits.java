import java.util.Scanner;

public class sumOfDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int toBeAdded = number % 10;
        int numberBank = number / 10;
        total += toBeAdded;

        toBeAdded = numberBank % 10;
        numberBank /= 10;
        total += toBeAdded;

        toBeAdded = numberBank % 10;
        numberBank /= 10;
        total += toBeAdded;

        System.out.println("The sum of the digits is " + total);
    }
}