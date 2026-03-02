import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        sc.nextLine();
        String smokingstaus = sc.nextLine();
        String preExistingCondition = sc.nextLine();
        String coverageTier = sc.nextLine();
        double a=0;
        double surcharge =0;
        double total=0;

        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+smokingstaus);
        System.out.println("Pre-existing: "+preExistingCondition);
        System.out.println("Coverage Tier: "+ coverageTier);

        if( coverageTier.equalsIgnoreCase("Basic")){
            if((age>=18 && age<=30)){
                a=200;
            }
            else if(age>=31 && age<=50){
                a=250;
            }
            else if(age>=51 && age<=65){
                a=350;
            }
            else if(age>=66){
                a=400;
            }
        }
        else if( coverageTier.equalsIgnoreCase("Standard")){
            if((age>=18 && age<=30)){
                a=300;
            }
            else if(age>=31 && age<=50){
                a=350;
            }
            else if(age>=51 && age<=65){
                a=450;
            }
            else if(age>=66){
                a=550;
            }
        }
        else if( coverageTier.equalsIgnoreCase("Premium")){
            if((age>=18 && age<=30)){
                a=500;
            }
            else if(age>=31 && age<=50){
                a=600;
            }
            else if(age>=51 && age<=65){
                a=700;
            }
            else if(age>=66){
                a=800;
            }
        }
        System.out.printf("Base Premium:$%.1f\n",a);

        if((smokingstaus.equalsIgnoreCase("Smoker")) && (preExistingCondition.equalsIgnoreCase("Yes"))){
            surcharge = a*0.70;
        }
        else if(smokingstaus.equalsIgnoreCase("Smoker")){
            surcharge = a*0.40;
        }
        else if(preExistingCondition.equalsIgnoreCase("Yes")){
            surcharge = a*0.30;
        }
        else{
            surcharge =0;
        }
        System.out.printf("Risk Surcharge: $%.1f\n",surcharge);
        
        total = a+surcharge;
        System.out.printf("Total Monthyly Premium: $%.1f\n",total);
    }
}