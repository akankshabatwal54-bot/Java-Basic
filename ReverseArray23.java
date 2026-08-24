public class ReverseArray23{
    static int[] reverseArray(int[] number){
        int[] reverse = new int[number.length];
        for(int i = 0; i < number.length; i++){
            reverse[number.length - 1 - i] = number[i];
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int[] result = reverseArray(number);
        System.out.println("Reversed Array:" );
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }


    }
}