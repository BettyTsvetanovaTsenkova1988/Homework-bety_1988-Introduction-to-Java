import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        System.out.println("Average: ");
        System.out.printf("%.2f", AverageOfThreeNumbers(a, b, c));
    }

    public static double AverageOfThreeNumbers(double a, double b, double c) {

        double average = (a + b + c) / 3;
        return average;

    }

}


