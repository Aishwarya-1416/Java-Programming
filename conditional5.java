import java.util.Scanner;

public class conditional5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int score = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();

        double amount = 0;
        String eligibility = "Not Eligible";
        String category = "None";

        if (gpa >= 2.5) {

            if (type.equals("Merit")) {

                if (gpa >= 3.8 && score >= 80) {
                    amount = 25000;
                    category = "Full";
                } else if (gpa >= 3.5 && score >= 70) {
                    amount = 15000;
                    category = "Partial";
                } else if (gpa >= 3.0 && score >= 60) {
                    amount = 8000;
                    category = "Minimal";
                }

            } else if (type.equals("Need-Based")) {

                if (income <= 30000 && gpa >= 3.5) {
                    amount = 30000;
                    category = "Full";
                } else if (income <= 50000 && gpa >= 3.0) {
                    amount = 18000;
                    category = "Partial";
                } else if (income <= 70000 && gpa >= 2.8) {
                    amount = 10000;
                    category = "Minimal";
                }

            } else if (type.equals("Sports")) {

                if (score >= 85 && gpa >= 3.0) {
                    amount = 22000;
                    category = "Full";
                } else if (score >= 75 && gpa >= 2.8) {
                    amount = 20000;
                    category = "Partial";
                } else if (score >= 65 && gpa >= 2.5) {
                    amount = 12000;
                    category = "Minimal";
                }
            }

            if (amount > 0) {
                eligibility = "Eligible";
            }
        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + income);
        System.out.println("Extracurricular Score: " + score);
        System.out.println("Scholarship Type: " + type);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + amount);
        System.out.println("Award Category: " + category);
    }
}