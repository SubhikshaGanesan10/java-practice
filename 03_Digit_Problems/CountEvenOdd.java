public class CountEvenOdd {
    // Count the number of even and odd elements in an array.
    public static void main(String args[]) {
        int[] numbers = {2, 7, 4, 9, 12, 15, 18};
        int evenCount = 0;
        int oddCount = 0;

        for(int num : numbers) {
            if(num % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}