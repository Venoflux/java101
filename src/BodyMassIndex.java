import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int weight;
        double height, bmi;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        weight = input.nextInt();

        System.out.print("Enter your height in meter: ");
        height = input.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.println("Your Body Mass Index is: " + bmi);
    }
}
