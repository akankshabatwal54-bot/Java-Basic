public class OddEven25{
    static int evenOdd(int[] number){
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0){
                 evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even Count: " + evenCount);
        return oddCount;
    }
    public static void main(String[] args) {
        int[] number = {10, 43, 56, 23, 17};
        int result = evenOdd(number);
        System.out.println("Odd Count:" + result);

    }
}