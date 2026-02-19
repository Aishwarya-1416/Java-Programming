import java.util.Scanner;

class Basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double mileage = sc.nextDouble();
        double fuelPrice = sc.nextDouble();
        double toll = sc.nextDouble();

        double cost = (distance / mileage) * fuelPrice + toll;
        System.out.println(cost);
    }
}
