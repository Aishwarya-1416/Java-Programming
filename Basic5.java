import java.util.Scanner;

class Basic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble();
        double service = sc.nextDouble();
        double gst = sc.nextDouble();
        int people = sc.nextInt();

        double amount = total + (total * service / 100) + (total * gst / 100);
        System.out.println((amount / people));
    }
}
