import java.util.Scanner;
public class LargestSmallestSum17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  number = new int[5];
        int largest = number[0];
       
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a Number:");
            number[i] = sc.nextInt();
        }   
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }

        int smallest = number[0];
        for(int i = 0; i < number.length; i++){
             if(number[i] < smallest){
                smallest = number[i];
            }
        }
            
        for(int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: "+ smallest);
        System.out.println("Sum: " + sum);

    }
}