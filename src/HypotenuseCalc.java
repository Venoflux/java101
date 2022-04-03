import java.util.Scanner;

public class HypotenuseCalc {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Insert side lengths of the triangle: ");
        a = input.nextDouble();
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hypotenuse of the triangle: " + c);

        double u = (a + b + c) / 2;

        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Area of the triangle given by the lengths: " + area);
    }
}
