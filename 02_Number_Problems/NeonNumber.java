public class NeonNumber {
    // Check whether a given number is a Neon number.
    //A Neon Number is a number where the sum of the digits of its square equals the original number.
    public static void main(String[] args) {
        NeonNumber obj = new NeonNumber();
        System.out.println(obj.checkNeonNumber(8));
    }

    public boolean checkNeonNumber(int n){

        int sqNum = n*n;
        int orgNum = n;
        int sqDigitSum = 0;
        while(sqNum > 0){
            int temp = 0;
            temp = sqNum%10;
            sqDigitSum += temp;
            sqNum/=10;
        }
        return orgNum == sqDigitSum;
    }
    
}
