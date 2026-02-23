import java.util.Scanner;

class Operator7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cartValue = sc.nextInt();
        int premium = sc.nextInt();
        if( cartValue > 999 || premium ==  1){
                System.out.println("Free Shipping");
        }
        else{
                System.out.println("Charges Applied");
        }
    }
}