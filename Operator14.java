import java.util.Scanner;

public class Operator14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int permissionA = sc.nextInt();
        int permissionB = sc.nextInt();

        int mergedPermission = permissionA | permissionB;

        System.out.println(mergedPermission);

        sc.close();
    }
}