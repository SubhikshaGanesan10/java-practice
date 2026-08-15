public class SecondLargestDigit {
    // Find the second largest digit in a given number.
    public static void main(String[] args) {
        SecondLargestDigit obj = new SecondLargestDigit();
        int secondMax = obj.secondLargest(1111);
        if(secondMax == -1){
            System.out.println("There is no second largest digit");
        }
        else{
            System.out.println(secondMax);
        }
    }
    public int secondLargest(int n){
        int max = -1;
        int secondMax = -1; 
        while(n>0){
            int temp = n%10;
            if(temp > max){
                secondMax = max;
                max = temp;
            }
            if(temp > secondMax && temp < max){
                secondMax = temp;
            }
            n/= 10;
        }
        return secondMax;
    }
}
