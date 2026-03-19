import java.util.Scanner;

public class nestedloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int seatsPerRow = sc.nextInt();

        System.out.println("Seating Arrangement:");

        for (int i = 1; i <= rows; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 1; j <= seatsPerRow; j++) {
                System.out.print("Seat-" + j + " ");
            }
            System.out.println();
        }

        System.out.println("Total Seats: " + (rows * seatsPerRow));
    }
}
