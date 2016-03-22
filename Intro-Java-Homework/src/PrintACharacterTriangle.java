import java.util.Scanner;

public class PrintACharacterTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");

        int n = input.nextInt();
        char[] character = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int row = 0; row <= n - 1; row++) {
            for (int col = 0; col <= row; col++) {

                System.out.print(character[col] + " ");
            }
            System.out.println();
        }

        for (int row = n - 1; row >= 0; row--) {
            for (int col = 0; col < row; col++) {

                System.out.print(character[col] + " ");
            }
            System.out.println();
        }

    }
}
