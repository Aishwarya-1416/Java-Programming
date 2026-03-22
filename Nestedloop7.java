import java.util.Scanner;

public class nestedloop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Diamond Pattern:");

        int middle = size / 2;

        for (int i = 0; i <= middle; i++) {
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = middle - 1; i >= 0; i--) {
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
