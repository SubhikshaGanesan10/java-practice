public class PerfectNumber {
    // Check whether a given number is a perfect number.
    //A perfect number is a number whose proper divisors add up to the number itself.
    public static void main(String[] args) {
        PerfectNumber num = new PerfectNumber();
        System.out.println(num.isPerfectNumber(14));
    }
    public boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
}
