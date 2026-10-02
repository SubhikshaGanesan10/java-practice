public class LargestDigit {
    // Find the largest digit in a given number.
    public static void main(String[] args) {
        LargestDigit max = new LargestDigit();
        System.out.println(max.largestDigit(1042));
    }
    public int largestDigit(int n){
        int max = 0;
        while (n > 0){
            int temp = n%10;
            if(temp > max){
                max = temp;
            }
            n/=10;
        }
        return max;
    }
}
