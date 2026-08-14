public class CountSpecificDigit {
    // Count how many times a specific digit appears in a given number.
    public static void main(String[] args) {
        CountSpecificDigit count = new CountSpecificDigit();
        System.out.println(count.digitCounter(122333, 3));
    }
    public int digitCounter(int num, int digit){
        int count = 0;
        while(num > 0){
            int temp = num%10;
            if(temp == digit){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
