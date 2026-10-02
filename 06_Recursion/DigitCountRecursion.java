public class DigitCountRecursion {
    public static void main(String[] args) {
        DigitCountRecursion obj = new DigitCountRecursion();
        System.out.println(obj.getDigitCount(765486));
    }

    public int getDigitCount(int n){
        if(n == 0){
            return 0;
        }
        return 1 + getDigitCount(n / 10);
    }
}
