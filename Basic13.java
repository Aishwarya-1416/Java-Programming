import java.util.Scanner;

class Basic13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double yield = sc.nextDouble();
        double acres = sc.nextDouble();
        double extra = sc.nextDouble();
        double damaged = sc.nextDouble();

        double finalYield = (yield * acres) + extra - damaged;
        System.out.println(finalYield);
    }
}