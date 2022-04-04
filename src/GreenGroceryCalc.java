import java.util.Scanner;
import java.util.StringTokenizer;

public class GreenGroceryCalc {
    public static void main(String[] args) {
        int pear, apple, tomato, banana, eggplant;
        double pearCost = 2.14, appleCost = 3.67, tomatoCost = 1.11, bananaCost = 0.95, eggplantCost = 5.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Pear kg: ");
        pear = input.nextInt();
        System.out.print("Apple kg: ");
        apple = input.nextInt();
        System.out.print("Tomato kg: ");
        tomato = input.nextInt();
        System.out.print("Banana kg: ");
        banana = input.nextInt();
        System.out.print("Eggplant kg: ");
        eggplant = input.nextInt();

        double totalCost = (pear * pearCost) + (apple * appleCost) + (tomato * tomatoCost) + (banana * bananaCost)
                + (eggplant * eggplantCost);

        System.out.println("Total cost: " + totalCost + " TL");
    }
}
