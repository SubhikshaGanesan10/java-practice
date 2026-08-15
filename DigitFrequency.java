public class DigitFrequency {
    // Find the digit that occurs the most times in a number.
    public static void main(String[] args) {
        DigitFrequency frequency = new DigitFrequency();
        System.out.println("The digit that occurs the most times: " + frequency.getDigitFrequency(717567773));
    }

    public int getDigitFrequency(int num){
        int orgNum = num;
        int maxFrequency = 0;
        int highestFreqDigit = 0;
        for(int i = 0; i<= 9; i++){
            int frequency = 0;
            while(num>0){
                int temp = num%10;
                if(temp == i){
                    frequency++;
                }
                num/= 10;
            }
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                highestFreqDigit = i;
            }
            num = orgNum;
        }
        return highestFreqDigit;
    }
    
}
