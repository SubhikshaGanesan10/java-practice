public class CountEvenOddDigits {
    // Count the number of even and odd digits in a given number.
    public static void main(String[] args) {
        int num = 12345;
        CountEvenOddDigits count = new CountEvenOddDigits();
        //CountEvenOddDigits odd = new CountEvenOddDigits();

        System.out.println("Even digit: " + count.evenDigits(num) + " and Odd digits: " + count.oddDigits(num));
        
    }

    public int evenDigits(int n){
        int count = 0;
        while(n > 0){
            int temp = n%10;
            if(temp % 2 == 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }
    
    public int oddDigits(int n){
        int count = 0;
        while(n > 0){
            int temp = n%10;
            if(temp % 2 != 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
