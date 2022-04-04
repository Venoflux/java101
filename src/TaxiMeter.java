import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        double price, km, pricePerKm = 2.20;
        int opening = 10, min = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the total km travelled: ");
        km = input.nextDouble();

        price =  (km * pricePerKm) + opening;
        price = (price > 20)? price : min;

        System.out.println("Amount to pay: " + price);

    }
}
