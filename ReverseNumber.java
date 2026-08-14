class ReverseNumber{
    public static void main(String args[]){
        ReverseNumber obj = new ReverseNumber();
        System.out.println(obj.reverseNumber(12345));
    }
     public int reverseNumber(int n){
        int reversed = 0; 
        while(n != 0){ 
            reversed = reversed*10 + n%10;
            n = n / 10;         
        }
        return reversed;
        
     }
}