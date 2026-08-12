import java.util.Scanner;
public class DoWhile11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
         int i = 1;
         do { 
            System.out.println(i);
             i++;
         } while(i <= num);
    }
}