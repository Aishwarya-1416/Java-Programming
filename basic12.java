import java.util.Scanner;

class Basic12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ticket = sc.nextDouble();
        double snack = sc.nextDouble();
        double maintenance = sc.nextDouble();
        double electricity = sc.nextDouble();

        double profit = ticket + snack - maintenance - electricity;
        System.out.println(profit);
    }
}