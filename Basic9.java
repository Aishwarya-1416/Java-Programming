import java.util.Scanner;

class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double room = sc.nextDouble();
        int days = sc.nextInt();
        double medicine = sc.nextDouble();
        double lab = sc.nextDouble();
        double insurance = sc.nextDouble();

        double bill = (room * days) + medicine + lab - insurance;
        System.out.println(+ bill);
    }
}