public class SearchPosition24{
    static int position(int[] number){
        int largest = number[0];
        int position = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
                position = i;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int result = position(number);
        System.out.println("Position:" + result);
    }
}