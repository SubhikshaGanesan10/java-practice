public class CountEvenDigit {
    // Count the number of even digits in a given number.
    public static void main(String[] args) {
        CountEvenDigit sum = new CountEvenDigit();
        System.out.println(sum.evenDigitCounter(126423));
    }
    public int evenDigitCounter(int n){
        int counter = 0;
        while(n>0){
            int temp = n%10;
            if(temp % 2 == 0){
                counter++;
            }
            n/=10;
        }
        return counter;
    }   
}



