public class Factorial {
    // Calculate the factorial of a number using a method and a loop.
    public static void main(String args[]) {
        Factorial obj = new Factorial();

        System.out.println(obj.calculateFactorial(5));
    }

    public int calculateFactorial(int n) {
        int factorial = 1;

        if(n == 0) {
            return 1;
        }

        do {
            factorial *= n;
            n--;
        } while(n > 0);

        return factorial;
    }
}
