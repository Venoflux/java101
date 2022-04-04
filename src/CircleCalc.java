import java.util.Scanner;
import java.text.MessageFormat;

public class CircleCalc {
    public static void main(String[] args) {
        double r, pi = Math.PI, area, diameter, alphaArea;
        int degree;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the radius: ");
        r = input.nextDouble();

        System.out.print("Please enter the degree you want the area of (Enter 360 for the whole area): ");
        degree = input.nextInt();

        area = pi * Math.pow(r, 2);
        diameter = 2 * pi * r;

        alphaArea = (area * degree) / 360;

        System.out.println("Area of the circle: " + area);
        System.out.println("Diameter of the circle: " + diameter);
        System.out.println(MessageFormat.format("Area of the {0} degrees :{1}", degree, alphaArea));
    }
}
