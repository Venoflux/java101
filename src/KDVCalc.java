import java.util.Scanner;

public class KDVCalc {
    public static void main(String[] args) {
        double corePrice, kdv, kdvPrice, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the price: ");
        corePrice = input.nextDouble();
        kdv = (corePrice > 999)? 0.08 : 0.18;
        kdvPrice = corePrice * kdv;
        totalPrice = corePrice + kdvPrice;

        System.out.println("Core Price: " + corePrice);
        System.out.println("KDV Percentage: " + kdv);
        System.out.println("KDV Cost: " + kdvPrice);
        System.out.println("KDV Included Price: " + totalPrice);
    }
}
