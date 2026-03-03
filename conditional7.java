import java.util.Scanner;

public class conditional7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int heartRate = sc.nextInt();
        String bp = sc.next();
        double temp = sc.nextDouble();
        sc.nextLine();
        String severity = sc.nextLine();

        String[] parts = bp.split("/");
        int systolic = Integer.parseInt(parts[0]);

        String priority = "";
        int wait = 0;
        String action = "";

        if (heartRate < 50 || heartRate > 130 ||
            systolic < 90 || systolic > 180 ||
            temp < 96 || temp > 103 ||
            severity.equals("Life-Threatening")) {

            priority = "Critical";
            wait = 0;
            action = "Immediate Emergency Care";

        } else if ((heartRate >= 50 && heartRate <= 60) ||
                   (heartRate >= 110 && heartRate <= 130) ||
                   (systolic >= 160 && systolic <= 180) ||
                   (systolic >= 90 && systolic <= 100) ||
                   (temp >= 101 && temp <= 103) ||
                   (temp >= 96 && temp <= 97) ||
                   severity.equals("Severe")) {

            priority = "Urgent";
            wait = 15;
            action = "Priority Medical Attention";

        } else if (severity.equals("Moderate")) {

            priority = "Standard";
            wait = 45;
            action = "Standard Examination";

        } else {

            priority = "Non-Urgent";
            wait = 90;
            action = "Routine Check-up";
        }

        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temp + "°F");
        System.out.println("Symptom Severity: " + severity);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + wait + " minutes");
        System.out.println("Recommended Action: " + action);
    }
}