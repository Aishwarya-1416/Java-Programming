import java.util.Scanner;

class Basic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        double wage = sc.nextDouble();
        double bonus = sc.nextDouble();
        double charge = sc.nextDouble();

        double finalWage = (days * wage) + bonus - charge;
        System.out.println(finalWage);
    }
}
