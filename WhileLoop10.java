import java.util.Scanner;
public class WhileLoop10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int  i = 1;
        int total = 0;

        while( i <= 10){
            int result = num * i;
            System.out.println(num + "x" + i + " = " + result);
             total = (total + result);
            i++;
        }
            System.out.println("Sum:" + total);
    }
}