public class ArmstrongNumber {
    // Check whether a given number is an Armstrong number.
    public static void main(String[] args) {
        ArmstrongNumber num = new ArmstrongNumber();
        System.out.println(num.isArmstrongNumber(9474));
    }

    public boolean isArmstrongNumber(int num){
        int sum = 0;
        int digitPower = 1;
        int orgNum = num;
        int digitsCount = 0;
        while(num >0){
            digitsCount++;
            num /= 10;
        }
        num = orgNum;
        while(num>0){
            int temp = num%10;
            for(int i = 0; i < digitsCount; i++){
                digitPower *= temp;
            }
            sum += digitPower;
            num /= 10;
            digitPower = 1;
        }
        return sum == orgNum;
    }
}
