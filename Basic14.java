import java.util.Scanner;

class Basic14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double sessions = sc.nextDouble();
        double pay = sc.nextDouble();
        double bonus = sc.nextDouble();
        double maintenance = sc.nextDouble();

        double salary = base + (sessions * pay) + bonus - maintenance;
        System.out.println(salary);
    }
}