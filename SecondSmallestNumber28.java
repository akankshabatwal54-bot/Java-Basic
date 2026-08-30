public class SecondSmallestNumber28{
    static int sort(int[] number){
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                if(number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        int secondSmallest = number[1];
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] number = {10, 40, 20, 30, 50 };
        int result = sort(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println("SecondSmallest:" + result);
    }
}