import java.util.Scanner;

class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int avg = (mark1 + mark2)/2;
        int result;
        if(mark1 >= 50 && mark2 >= 50){
            if(avg >= 50){
                System.out.println("PASS");
            }
        }
        else{
                System.out.println("FAIL");
        }
    }
}