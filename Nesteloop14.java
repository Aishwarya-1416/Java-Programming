import java.util.Scanner;

public class nestedloop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int totalStudents = sc.nextInt();

        String[][] seating = new String[rows][cols];

        int studentNum = 1;
        int occupied = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0 && studentNum <= totalStudents) {
                    seating[i][j] = "S" + String.format("%03d", studentNum++);
                    occupied++;
                } else {
                    seating[i][j] = "----";
                }
            }
        }

        int totalSeats = rows * cols;
        int empty = totalSeats - occupied;

        System.out.println("Exam Seating Plan:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Occupied Seats: " + occupied);
        System.out.println("Empty Seats: " + empty);

        sc.close();
    }
}
