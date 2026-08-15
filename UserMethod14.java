import java.util.Scanner;

public class UserMethod14{
    static void User(int a, int b){
        System.out.println("Addition:" + (a + b) );
        System.out.println("Substraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        System.out.println("Enter a NUmber:");
        int b = sc.nextInt();
        User(a, b);
        
    }
}