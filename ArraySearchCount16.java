import java.util.Scanner;
public class ArraySearchCount16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0; i < num.length; i++){
            System.out.println("Enter a number:");
            num[i] = sc.nextInt();

        }
        System.out.println("Search a number:");
        int search = sc.nextInt();
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == search){
                count++;
            }

           
        }
         if(count>0){
                System.out.println("Number is Found");
            }else{
                System.out.println("Number is not Found");
            }

        
        System.out.println(search + " " + "found" + " " + " " + count + " " + "times");
    }
}