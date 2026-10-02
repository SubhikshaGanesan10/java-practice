public class SumEvenPositionDigits {
    // Calculate the sum of digits at even positions in a given number.
    public static void main(String[] args) {
        SumEvenPositionDigits sum = new SumEvenPositionDigits();
        System.out.println(sum.evenPositionSum(12672));
    }
    public int evenPositionSum(int n){
        int index = 1;
        int evenDigitSum = 0;
        while(n>0){
            int temp = n%10;
            if(index % 2 == 0){
                evenDigitSum += temp;
            }
            n/=10;
            index++;
        }
        return evenDigitSum;
    }
}
