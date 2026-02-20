import java.util.Scanner;

class Basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double rate = sc.nextDouble();
        double maintenance = sc.nextDouble();
        double allowance = sc.nextDouble();
        double subsidy = sc.nextDouble();

        double fee = (distance * rate) + maintenance + allowance - subsidy;
        System.out.println(fee);
    }
}