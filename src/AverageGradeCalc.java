import java.util.Scanner;

public class AverageGradeCalc {
    public static void main(String[] args) {
        int math, phys, chem, turk, hist, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = input.nextInt();

        System.out.print("Physics Grade: ");
        phys = input.nextInt();

        System.out.print("Chemistry Grade: ");
        chem = input.nextInt();

        System.out.print("Turkish Grade: ");
        turk = input.nextInt();

        System.out.print("History Grade: ");
        hist = input.nextInt();

        System.out.print("Music Grade: ");
        music = input.nextInt();

        double avgGrade = (math + phys + chem + turk + hist + music) / 6.0;

        System.out.println("Your average grade is: " + avgGrade);
        String message = (avgGrade > 60)? "Passed":"Failed";
        System.out.println(message);
    }
}