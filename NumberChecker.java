import java.util.Scanner;
public class NumberChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("No is Positive");
        }
        else if(num < 0){
            System.out.println("No is Negative.");
        }else{
            System.out.println("No is Zero");
        }
    }
}