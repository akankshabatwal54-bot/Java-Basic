public class PositiveSum30{
    static int sum(int[] number){
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] >= 0){
                sum = sum + number[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] number = {10, -20, 30, -40, 50};
        int result = sum(number);
        System.out.println("Sum of Positive Numbers:" + result);
    }
}