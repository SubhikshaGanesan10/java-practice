public class SecondSmallestDigit {
    // Find the second smallest digit in a given number.
    public static void main(String[] args) {
        SecondSmallestDigit obj = new SecondSmallestDigit();
        int secondMin = obj.secondSmallest(4256);
        if(secondMin == 10){
            System.out.println("There is no second minimum digit");
        }
        else{
            System.out.println(secondMin);
        }
    }
    public int secondSmallest(int n){
        int min = 10;
        int secondMin = 10; 
        while(n>0){
            int temp = n%10;
            if(temp < min){
                secondMin = min;
                min = temp;
            }
            if(temp < secondMin && temp > min){
                secondMin = temp;
            }
            n/= 10;
        }
        return secondMin;
    }
}
