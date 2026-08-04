import java.util.Scanner;
public class UserInput4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Your age is:" + age);
        sc.close();

    }
}