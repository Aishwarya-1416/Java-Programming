import java.util.Scanner;

public class conditional10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        double consumption = sc.nextDouble();
        double renewable = sc.nextDouble();
        sc.nextLine();
        String tier = sc.nextLine();

        double baseRate = 0;
        double multiplier = 1;
        String recommendation = "";
        double savings = 0;

        if (tier.equals("Basic")) baseRate = 0.18;
        else if (tier.equals("Time-of-Use")) baseRate = 0.15;
        else baseRate = 0.12;

        if (time.equals("Peak")) {
            multiplier = 1.8;
        } else if (time.equals("Off-Peak")) {
            multiplier = 0.8;
        } else {
            multiplier = 0.6;
        }

        double renewableCredit = (consumption * renewable / 100) * baseRate;
        double totalCost = (consumption * baseRate * multiplier) - renewableCredit;
        if (totalCost < 0) totalCost = 0;

        if (time.equals("Peak") && renewable < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
            savings = consumption * baseRate * (multiplier - 0.8);
        } 
        else if (renewable > 60) {
            recommendation = "Excellent! Maximize appliance use during this period";
        } 
        else if (tier.equals("Basic") && consumption > 20) {
            recommendation = "Consider upgrading to Time-of-Use plan";
            savings = consumption * 0.03;
        } 
        else {
            recommendation = "Good timing! Consider increasing renewable capacity";
        }

        System.out.println("Time of Day: " + time);
        System.out.println("Power Consumption: " + consumption + " kWh");
        System.out.println("Renewable Energy: " + renewable + "%");
        System.out.println("Rate Tier: " + tier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.println("Renewable Credit: $" + renewableCredit);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + savings);
    }
}