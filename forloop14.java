import java.util.Scanner;

public class forloop14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalFines = 0;
        int overdue = 0;

        for(int i = 1; i <= n; i++) {

            String type = sc.next();
            int daysLate = sc.nextInt();

            double rate = 0;
            double cap = 0;

            if(type.equals("Regular")) {
                rate = 0.5;
                cap = 10;
            }
            else if(type.equals("Reference")) {
                rate = 1.0;
                cap = 20;
            }
            else if(type.equals("Magazine")) {
                rate = 0.25;
                cap = 5;
            }

            double calculatedFine = daysLate * rate;
            double actualFine = calculatedFine;
            boolean capApplied = false;

            if(actualFine > cap) {
                actualFine = cap;
                capApplied = true;
            }

            if(daysLate > 0)
                overdue++;

            totalFines += actualFine;

            System.out.println("Book " + i + ": " + type);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + rate);
            System.out.println("Calculated Fine: $" + calculatedFine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
        }

        double average = totalFines / n;

        System.out.println("Total Books: " + n);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdue);
        System.out.println("Average Fine: $" + average);
    }
}