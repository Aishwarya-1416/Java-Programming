import java.util.Scanner;

class Basic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rods = sc.nextInt();
        int hours = sc.nextInt();
        int overtime = sc.nextInt();
        int rejected = sc.nextInt();

        int result = (rods * hours) + overtime - rejected;
        System.out.println(result);
    }
}