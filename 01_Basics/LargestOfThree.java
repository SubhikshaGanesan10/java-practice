public class LargestOfThree {
    // Find the largest of three numbers.
    public static void main(String args[]) {
        int a = 25;
        int b = 42;
        int c = 17;

        if(a > b && a > c) {
            System.out.println(a);
        }
        else if(b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
