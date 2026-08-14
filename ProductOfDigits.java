public class ProductOfDigits {
    // Calculate the product of all digits in a given number.
    public static void main(String[] args) {
        ProductOfDigits prod = new ProductOfDigits();
        System.out.println(prod.digitsProduct(0));
    }
    public int digitsProduct(int n){
        if(n == 0){
            return 0;
        }
        int prod = 1;
        while(n > 0){
            int temp = n%10;
            prod *= temp;
            n /= 10;
        }
        return prod;
    }
}
