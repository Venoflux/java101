import java.util.Scanner;

public class AverageGradeCalc {
    public static void main(String[] args) {

        // Define subjects as integer
        int math, phys, chem, turk, hist, music;

        Scanner input = new Scanner(System.in);

        // Take subject grade inputs
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

        // Calculate the average
        double avgGrade = (math + phys + chem + turk + hist + music) / 6.0;

        // Print the final average and pass decision depending on the grade
        System.out.println("Your average grade is: " + avgGrade);
        String message = (avgGrade > 60)? "Passed":"Failed";
        System.out.println(message);
    }
}