import java.util.*;

class Basic18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double reg = sc.nextDouble();
        double sponsor = sc.nextDouble();
        double stall = sc.nextDouble();
        double stage = sc.nextDouble();
        double celeb = sc.nextDouble();
        double marketing = sc.nextDouble();

        double fund = reg + sponsor + stall - stage - celeb - marketing;
        System.out.println(fund);
    }
}