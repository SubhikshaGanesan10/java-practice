public class FactorialRecursion {
    // Calculate the factorial of a given number using recursion.
    //FORMULA = factorial(n) = n × factorial(n - 1)
    public static void main(String[] args) {
        FactorialRecursion obj = new FactorialRecursion();
        System.out.println(obj.getFactorial(5));
    }

    public int getFactorial(int n){
        if(n < 0){
            return -1;
        }

        if(n == 0){
            return 1;
        }

        return n * getFactorial(n - 1);
    }
    
}
