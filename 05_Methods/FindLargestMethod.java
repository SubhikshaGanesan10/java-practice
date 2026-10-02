public class FindLargestMethod {
    // Create a method to find the largest number in an array and call it using an object.
    public static void main(String args[]) {
        int[] numbers = {12, 45, 7, 90, 23, 56};

        FindLargestMethod obj = new FindLargestMethod();

        System.out.println(obj.findLargest(numbers));
    }

    public int findLargest(int[] nums) {
        int n = nums[0];

        for(int num : nums) {
            if(num > n) {
                n = num;
            }
        }

        return n;
    }
}