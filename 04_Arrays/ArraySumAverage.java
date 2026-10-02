public class ArraySumAverage {
    // Calculate the sum and average of the numbers in an array.
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println(sum);
        System.out.println(average);
    }
}
