import java.util.Scanner;

public class nestedloop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();

        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int currentDate = 1;
        int totalCells = (startDay - 1) + daysInMonth;
        int weeks = (totalCells + 6) / 7;

        for (int i = 0; i < weeks; i++) {
            for (int j = 1; j <= 7; j++) {
                int cellNumber = i * 7 + j;

                if (cellNumber < startDay || currentDate > daysInMonth) {
                    System.out.print("   ");
                } else {
                    System.out.print(currentDate + " ");
                    currentDate++;
                }
            }
            System.out.println();
        }
    }
}
