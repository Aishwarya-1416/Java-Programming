import java.util.Scanner;

public class nestedloop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Pascal's Triangle:");

        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
