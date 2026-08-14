public class Palindrome {
    // Check whether a given number is a palindrome.
    public static void main(String arge[]){
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(1331));
    }
    public boolean isPalindrome(int n){
        int reversed = 0;
        int temp = n;
        while(temp > 0){
            reversed = reversed * 10 + temp%10;
            temp /= 10;
        }

        return n == reversed;
    }
}
