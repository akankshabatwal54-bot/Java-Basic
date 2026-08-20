public class ArrayMethod19{
    static int sumArray(int[] number){
         int sum = 0;
         for(int i = 0; i < number.length; i++){
            sum = sum + number[i];
         }
         return sum;


    }
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int result = sumArray(num);
        System.out.println("Sum: " + result);
    }
}