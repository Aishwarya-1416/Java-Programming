import java.util.Scanner;

public class Operator15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int signalValue = sc.nextInt();
        int toggleMask = sc.nextInt();

        int toggledSignal = signalValue ^ toggleMask;

        System.out.println(toggledSignal);

        sc.close();
    }
}