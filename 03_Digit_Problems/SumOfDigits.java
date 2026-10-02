public class SumOfDigits {
    // Calculate the sum of all digits in a given number.
    public static void main(String[] args) {
        SumOfDigits sum = new SumOfDigits();
        System.out.println(sum.sumOfDigits(12345));
    }
    public int sumOfDigits(int n){
        int sum = 0; 
        while (n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
