public class DigitCounter {
    // Count the number of digits in a given number.
    public static void main(String[] args) {
        DigitCounter count = new DigitCounter();
        System.out.println(count.countDigits(102));
    }
    public int countDigits(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        while (n > 0){
            count++;
            n/=10;
        }
        return count;
    }
}
