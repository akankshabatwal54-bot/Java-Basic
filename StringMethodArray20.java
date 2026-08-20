public class StringMethodArray20{
    static String searchNumber(int[] number, int search){
        boolean found = false;
        for(int i = 0; i < number.length; i++){
            if(number[i] == search){
                found = true;
                break;
            }
        }
        if(found){
            return "Found";
        }else{
            return "Not found";
        }
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int search = 30;
        String result = searchNumber(number, search);
        System.out.println(result);
    }
}