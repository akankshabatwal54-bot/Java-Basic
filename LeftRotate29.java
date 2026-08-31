public class LeftRotate29{
    static int[] leftRotate(int[] number){
        int first = number[0];
        for(int i = 0; i < number.length - 1; i++){
            number[i] = number[i + 1];

        }
        number[number.length - 1] = first;
        return number;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int[] result = leftRotate(number);
        
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]  + " ");
        }
    }
}