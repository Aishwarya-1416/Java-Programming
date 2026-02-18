import java.util.Scanner;
public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();
        double discount = sc.nextDouble();
        double gst = sc.nextDouble();
        double total = sales - sales * discount / 100;
        total = total + total * gst / 100;
        System.out.println("Final Revenue = " + total);
    }
}
