public class LargestNumber21{
    static int largestNumber(int[] number){
        int largest = number[0];
        for(int i = 1; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] number = {10, 50, 68, 100, 96};
        int result = largestNumber(number);
        System.out.println("Largest Number:" + result);
    }
}