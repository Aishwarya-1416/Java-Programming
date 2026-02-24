import java.util.Scanner;

class Operator12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fileSize = sc.nextInt();
        int compressionCycles = sc.nextInt();
        int size = fileSize >> compressionCycles;
        System.out.println(size);
        
    }
}