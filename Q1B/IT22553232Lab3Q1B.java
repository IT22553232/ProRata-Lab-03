import java.util.Scanner;

public class  IT22553232Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = input.nextDouble();

        double amount = price * kilograms;

        double discount = amount * 10 / 100;

        double finalAmount = amount - discount;

        System.out.println("The total amount with 10% discount is: " + finalAmount);
    }
}