import java.util.Scanner;
public class Evensum{
    public static int sumEven(int n){
        int sum = 0;
        
        for(int i =1; i<= n; i++){
            if(n % i == 0){
                if( i % 2 == 0){
                sum = sum + i;
               
            }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int result = sumEven(n);
        System.out.println("Sum is:" + result);
    }
}