import java.util.Scanner;

public class conditional15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userCount = sc.nextInt();
        sc.nextLine();
        String licenseType = sc.nextLine();
        String supportLevel = sc.nextLine();
        int contractYears = sc.nextInt();

        double basePrice = 0;
        if (licenseType.equals("Standard")) basePrice = 60;
        else if (licenseType.equals("Professional")) basePrice = 120;
        else basePrice = 200;

        double volumeDiscount = 0;
        if (userCount <= 50) volumeDiscount = 0;
        else if (userCount <= 200) volumeDiscount = 15;
        else if (userCount <= 500) volumeDiscount = 20;
        else if (userCount <= 1000) volumeDiscount = 25;
        else volumeDiscount = 35;

        double supportFee = 0;
        if (supportLevel.equals("Basic")) supportFee = 10;
        else if (supportLevel.equals("Priority")) supportFee = 30;
        else supportFee = 80;

        double multiYearDiscount = 0;
        if (contractYears == 2) multiYearDiscount = 5;
        else if (contractYears == 3) multiYearDiscount = 10;
        else if (contractYears == 5) multiYearDiscount = 20;

        double discountedBase = basePrice * (1 - volumeDiscount / 100);
        double annualPerUser = (discountedBase + supportFee) * (1 - multiYearDiscount / 100);
        double totalAnnual = annualPerUser * userCount;
        double contractValue = totalAnnual * contractYears;

        String pricingTier = "";
        if (userCount < 200) pricingTier = "Small Business";
        else if (userCount <= 1000) pricingTier = "Mid-Market";
        else pricingTier = "Enterprise";

        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + (int)volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + (int)multiYearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + Math.round(annualPerUser * 100.0) / 100.0);
        System.out.println("Total Annual Cost: $" + Math.round(totalAnnual * 100.0) / 100.0);
        System.out.println("Total Contract Value: $" + Math.round(contractValue * 100.0) / 100.0);
        System.out.println("Pricing Tier: " + pricingTier);
    }
}