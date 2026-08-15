public class StrongNumber {
    // Check whether a given number is a Strong number.
    //A Strong Number is a number where the sum of the factorials of its digits equals the original number.
    public static void main(String[] args) {
        StrongNumber num = new StrongNumber();
        System.out.println(num.isStrongNumber(0));
    }
    public boolean isStrongNumber(int n){
        int sum = 0;
        int orgNum = n;
        // 0! = 1
        // 0 is not considered a Strong Number.
        if(n == 0){
            return false;
        }        
        while(n > 0){
            int temp = n%10;
            int factorial = 1;
            while(temp > 0){
                factorial *= temp;
                temp--;
            }
            sum += factorial;
            n /= 10;
        }
        return sum == orgNum;
    }
    
}
