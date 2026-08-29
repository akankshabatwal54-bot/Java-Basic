public class PalindromeArray27{
    static int isPalindrome(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            int num = number[i];
        int original = num;
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse){
            count++;
        }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] number = {121, 123, 131, 456, 111};
        int result = isPalindrome(number);
        System.out.println("Palindrome Number:" + result);

    }

}