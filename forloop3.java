import java.util.Scanner;
public class forloop3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int low = 0;
        int critical = 0;
        int  total =0;
    
        for(int i = 0; i < N; i++){
            String product = sc.next();
            int current = sc.nextInt();
            int minimum = sc.nextInt();
            
            String status = "";
            int quantity = 0;
            if(current >= minimum){
                status = "Adeduate";
                quantity = 0;
            }
            else if(current < minimum && current >= minimum/2 ){
                status = "Low Stock";
                quantity = (minimum - current) + (minimum/2);
                low++;
            }
            else{
                status = "Critical";
                quantity = (minimum - current) + (int)(minimum*1.5);
                critical++;
            }
            
            total += quantity;
            System.out.println("Product : "+product);
            System.out.println("Current Stock : "+current);
            System.out.println("Minimum Stock: "+minimum);
            System.out.println("Status : "+status);
            System.out.println("Record Quantity : "+quantity);
        }
        System.out.println("Total Products: " + N);
        System.out.println("Low Stock Items: " + low);
        System.out.println("Critical Items: " + critical);
        System.out.println("Total Reorder Quantity: " + total);

    }
}