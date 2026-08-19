import java.util.Scanner;
public class LargestUsingMethod18{
    static void largest(){
        int[] numbers = new int[3];
        for(int i = 0; i < numbers.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number:");
            numbers[i] = sc.nextInt();

        }
        int largest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest:" + largest);
    }
    public static void main(String[] args) {
        largest();
    }
}