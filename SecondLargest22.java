public class SecondLargest22{
    static int secondLargest(int[] number){
        int largest = number[0];
        int secondlargest = number[0];
        for(int i = 1; i < number.length; i++){
            if(number[i] > largest){
                secondlargest = largest;
                largest = number[i];
            }
            else if(number[i] > secondlargest){
                secondlargest = number[i];
            }
        }
        return secondlargest;


    }
    public static void main(String[] args) {
        int[] number = {10, 52, 74, 100, 22};
        int result = secondLargest(number);
        
        System.out.println("Second Largest:" + result);
    }
}