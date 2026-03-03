import java.util.Scanner;

public class conditional8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        int sqft = sc.nextInt();
        int age = sc.nextInt();
        int score = sc.nextInt();

        double pricePerSqft = 0;
        double agePercent = 0;
        double amenityPercent = 0;

        if (tier.equals("Prime")) pricePerSqft = 400;
        else if (tier.equals("Urban")) pricePerSqft = 300;
        else if (tier.equals("Suburban")) pricePerSqft = 180;
        else pricePerSqft = 100;

        if (age <= 5) agePercent = 0;
        else if (age <= 15) agePercent = -10;
        else if (age <= 30) agePercent = -15;
        else agePercent = -25;

        if (score >= 80) amenityPercent = 10;
        else if (score >= 60) amenityPercent = 5;
        else if (score >= 40) amenityPercent = 2;
        else amenityPercent = 0;

        double baseValue = sqft * pricePerSqft;
        double adjustedValue = baseValue * (1 + agePercent / 100);
        double amenityBonus = baseValue * (amenityPercent / 100);
        double finalValue = adjustedValue + amenityBonus;

        String market = "Stable";
        if ((tier.equals("Prime") || tier.equals("Urban")) && age < 15)
            market = "Hot";
        else if (tier.equals("Rural") || age > 30)
            market = "Slow";

        System.out.println("Location Tier: " + tier);
        System.out.println("Square Footage: " + sqft + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + score);
        System.out.println("Base Price Per Sq Ft: $" + pricePerSqft);
        System.out.println("Age Adjustment: " + agePercent + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + market);
    }
}