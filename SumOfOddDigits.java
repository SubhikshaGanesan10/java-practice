public class SumOfOddDigits {
    // Calculate the sum of all odd digits in a given number.
    public static void main(String[] args) {
        SumOfOddDigits sum = new SumOfOddDigits();
        System.out.println(sum.oddSum(1242));
    }
    public int oddSum(int n){
        int sum = 0;
        while(n > 0){
            int temp = n%10;
            if (temp % 2 != 0){
                sum  += temp;
            }
            n /= 10;
        }
        return sum;
    }
}
