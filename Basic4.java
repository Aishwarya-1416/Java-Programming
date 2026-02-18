import java.util.Scanner;
public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tuition = sc.nextDouble();
        double scholarship = sc.nextDouble();
        double exam = sc.nextDouble();
        double library = sc.nextDouble();
        double total = tuition - tuition * scholarship / 100 + exam + library;
        System.out.println("Final Payable Fee = " + total);
    }
}
