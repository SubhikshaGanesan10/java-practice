public class SumOfEvenDigits {
    // Calculate the sum of all even digits in a given number.
    public static void main(String[] args) {
        SumOfEvenDigits sum = new SumOfEvenDigits();
        System.out.println(sum.evenSum(13547));
    }
    public int evenSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                sum = sum + digit;
            }
            n /= 10;
        }
        return sum;
    }
}
