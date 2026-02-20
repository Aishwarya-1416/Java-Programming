import java.util.Scanner;

class Basic19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double days = sc.nextDouble();
        double rent = sc.nextDouble();
        double late = sc.nextDouble();
        double fuel = sc.nextDouble();
        double maintenance = sc.nextDouble();

        double profit = (days * rent) + late - fuel - maintenance;
        System.out.println(profit);
    }
}