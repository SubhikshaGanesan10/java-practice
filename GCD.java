public class GCD {
    // Find the greatest common divisor (GCD) of two numbers.
    //GCD OR HCF (Highest Common Factor)
    public static void main(String[] args) {
        GCD obj = new GCD();
        System.out.println(obj.maxCommonDivisor(10,20));
    }
    public int maxCommonDivisor(int a, int b){
        int length = a<b ? a : b;
        int maxFactor = 1;
        for(int i = 1; i<=length; i++){
            if(a % i == 0 && b % i == 0 && i>maxFactor){
                maxFactor = i;
            }
        }
        return maxFactor;
    }
    
}
