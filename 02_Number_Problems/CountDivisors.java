public class CountDivisors {
    //Count the number of divisors of a given number.
    public static void main(String[] args) {
        CountDivisors count = new CountDivisors();
        System.out.println(count.divisorCount(12));
    }
    public int divisorCount(int n){
        int count = 0;
        for(int i =1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }
}

