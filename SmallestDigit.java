public class SmallestDigit {
    // Find the smallest digit in a given number.
    public static void main(String[] args) {
        SmallestDigit min = new SmallestDigit();
        System.out.println(min.smallestDigit(3942));
    }
    public int smallestDigit(int n){
        int min = 9;
        while (n > 0){
            int temp = n%10;
            if(temp < min){
                min = temp;
            }
            n/=10;
        }
        return min;
    }
}
