public class MultiplicationTable {
    // Print the multiplication table of a given number from 1 to 10.
    public static void main(String args[]) {
        int n = 7;

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}