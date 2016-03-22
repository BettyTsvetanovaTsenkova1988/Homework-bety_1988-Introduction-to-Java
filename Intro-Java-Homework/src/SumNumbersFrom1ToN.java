import java.util.Scanner;

public class SumNumbersFrom1ToN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.printf("Output: %d", sum);
    }
}
