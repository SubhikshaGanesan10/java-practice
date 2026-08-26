public class AutomorphicNumber {
    // Check whether a given number is an Automorphic number.
    // A number is automorphic if its square ends with the number itself.
    public static void main(String[] args) {
        AutomorphicNumber obj = new AutomorphicNumber();
        boolean result = obj.isAutomorphic(100);
        System.out.println(result);
    }
    public boolean isAutomorphic(int n){
        int orgNum = n;
        int sqNum = n*n;
        int length = Integer.toString(n).length();

        int tempNum = 0;

        while(length > 0){
            int temp = 0;
            temp = sqNum%10;
            tempNum = tempNum*10 + temp;
            sqNum/= 10;
            length--;
        }

        int lastDigits = 0;
        while(tempNum > 0){
            int temp = 0;
            temp = tempNum%10;
            lastDigits = lastDigits*10 + temp;
            tempNum/= 10;
        }

        return lastDigits == orgNum;
    }
    
}
