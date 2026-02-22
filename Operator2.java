import java.util.Scanner;

class Operator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();
        int limit = sc.nextInt();
        if(amount <= balance  && amount <= limit){
                System.out.println("Transaction Aproved");
        }
        else{
                System.out.println("Transaction Declined");
        }
    }
}