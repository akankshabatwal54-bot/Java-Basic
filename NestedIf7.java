import java.util.Scanner;
public class NestedIf7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
         if(a>b){
            if(a>c){
                System.out.println("Largest no is:" + a);
            }else{
                System.out.println("Largest no is:" + b);
            }
         } else{
                if(b>c){
                    System.out.println("Largest no is:" + b);
                } else{
                    System.out.println("Largest no is:" + c);
                }
         }
         sc.close();
    }
}