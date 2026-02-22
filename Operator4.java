import java.util.Scanner;

class Operator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();
        int block = sc.nextInt();
        if(amount <= balance  && block <= 0){
                System.out.println("Aproved");
        }
        else{
                System.out.println("Declined");
        }
    }
}