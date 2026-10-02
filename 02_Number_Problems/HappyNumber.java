public class HappyNumber {
    // Check whether a given number is a Happy number.
    //A Happy Number is a number that eventually reaches 1 when repeatedly replaced by the sum of the squares of its digits.
    //Non-Happy Numbers keep going on a loop and eventually repeating value and always a 4. 
    public static void main(String[] args) {
        HappyNumber num = new HappyNumber();
        System.out.println(num.checkHappyNumber(9));
    }
    
    public boolean checkHappyNumber(int n){
        int newNum = 0;
        while(true){
            int length = Integer.toString(n).length();
            newNum = 0;
            while(length > 0){
                int temp = n%10;
                newNum += temp*temp;
                n /= 10;
                length--;
            }
            
            if(newNum == 1){
                return true;
            }
            if(newNum == 4){
                return false;
            }
            n = newNum;
        }
    }
}
