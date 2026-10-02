public class SumDigitsRecursion {
    //Sum of Digits Using Recursion
    public static void main(String[] args) {
        SumDigitsRecursion obj = new SumDigitsRecursion();
        System.out.println(obj.getSumDigit(1234));
    }

    public int getSumDigit(int num){
        if(num == 0){
            return 0;
        }
        return num%10 + getSumDigit(num/10);
    }
}
