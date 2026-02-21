import java.util.Scanner;

class Basic25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double resUsage = sc.nextDouble();
        double resRate = sc.nextDouble();
        double comUsage = sc.nextDouble();
        double comRate = sc.nextDouble();
        double connection = sc.nextDouble();
        double penalty = sc.nextDouble();
        double maintenance = sc.nextDouble();
        double treatment = sc.nextDouble();

        double revenue = (resUsage * resRate)+ (comUsage * comRate) + connection + penalty - maintenance - treatment;

        System.out.println(revenue);
    }
}