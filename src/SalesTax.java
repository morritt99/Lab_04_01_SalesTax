import java.util.Scanner;

public class SalesTax {
    public static <Scanner> void main(String[] args) {
        System.out.println("Enter the price of the purchase");
        double price = 55;
        double salesTax = price * 0.05;
        System.out.println("The price of the purchase is: " + price);
        System.out.println("The computed sales tax is: " + salesTax);

    }
}

        