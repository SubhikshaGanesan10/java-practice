public class PrimeNumber {
    // Check whether a given number is a prime number.
    public static void main(String[] args) {
        PrimeNumber num = new PrimeNumber();
        System.out.println(num.isPrime(23));
    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
