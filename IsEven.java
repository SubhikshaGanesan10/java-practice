public class IsEven {
    // Create a method that returns true if a number is even and false otherwise.
    public static void main(String args[]) {
        System.out.println(isEven(11));
    }

    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}