import java.util.Scanner;

class Basic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deliveries = sc.nextInt();
        double payout = sc.nextDouble();
        double incentive = sc.nextDouble();
        double fuel = sc.nextDouble();

        double earnings = (deliveries * payout) + incentive - fuel;
        System.out.println(earnings);
    }
}