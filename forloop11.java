import java.util.Scanner;

public class forloop11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double originalTotal = 0;
        double finalTotal = 0;
        double totalDiscount = 0;

        for(int i = 1; i <= n; i++) {

            String seat = sc.next();
            String customer = sc.next();

            double basePrice = 0;
            int discount = 0;

            // seat base price
            if(seat.equals("Regular"))
                basePrice = 12;
            else if(seat.equals("Premium"))
                basePrice = 18;
            else if(seat.equals("Recliner"))
                basePrice = 25;

            // customer discount
            if(customer.equals("Child"))
                discount = 30;
            else if(customer.equals("Senior"))
                discount = 25;
            else
                discount = 0;

            double finalPrice = basePrice * (1 - discount / 100.0);
            double discountAmount = basePrice - finalPrice;

            originalTotal += basePrice;
            finalTotal += finalPrice;
            totalDiscount += discountAmount;

            System.out.println("Ticket " + i + ": " + seat + " - " + customer);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + finalPrice);
        }

        boolean groupDiscount = false;

        if(n >= 5) {
            finalTotal = finalTotal * 0.90;  // 10% extra discount
            groupDiscount = true;
        }

        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (groupDiscount ? "Yes" : "No"));
    }
}