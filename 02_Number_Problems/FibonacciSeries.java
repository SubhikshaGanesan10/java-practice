public class FibonacciSeries {
    // Print the Fibonacci series for a given number of terms.
    // F(n) = F(n-1) + F(n-2)
    public static void main(String[] args) {
        FibonacciSeries obj = new FibonacciSeries();
        int[] arr = obj.getFibonacci(8); 
        for(int n : arr){
            System.out.print(n + " ");
        }
        
    }
    public int[] getFibonacci(int terms){
        int[] arr = new int[terms];
        if(terms >= 1){
            arr[0] = 0;
        }
        if(terms >= 2){
            arr[1] = 1;
        }
        for(int i = 2; i<terms; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }
}
