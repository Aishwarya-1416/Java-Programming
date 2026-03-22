import java.util.Scanner;

public class nestedloop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int days = sc.nextInt();

        String[] names = new String[students];
        char[][] attendance = new char[students][days];

        for (int i = 0; i < students; i++) {
            names[i] = sc.next();
            for (int j = 0; j < days; j++) {
                attendance[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Attendance Matrix:");
        System.out.print("Student ");
        for (int i = 0; i < days; i++) {
            System.out.print("Day" + (i + 1) + " ");
        }
        System.out.println("Attendance%");

        int perfectCount = 0;

        for (int i = 0; i < students; i++) {
            System.out.print(names[i] + " ");
            int present = 0;

            for (int j = 0; j < days; j++) {
                System.out.print(attendance[i][j] + " ");
                if (attendance[i][j] == 'P') {
                    present++;
                }
            }

            double percent = (present * 100.0) / days;
            if (percent == 100.0) {
                perfectCount++;
            }

            System.out.printf("%.2f%%\n", percent);
        }

        System.out.println("Perfect Attendance: " + perfectCount + " students");
    }
}
