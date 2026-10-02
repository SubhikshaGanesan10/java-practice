public class FindLargestArray {
    // Find the largest number in an array.
    public static void main(String args[]) {
        int[] numbers = {12, 45, 7, 89, 23, 56};
        int max = numbers[0];

        for(int num : numbers) {
            if(num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}