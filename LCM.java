public class LCM {
    // Find the least common multiple (LCM) of two numbers.
    public static void main(String[] args) {
        LCM obj = new LCM();
        System.out.println(obj.findLCM(12,18));
    }
    public int findLCM(int a, int b){
        int max = a>b ? a : b;
        for(int i = max; i<=(a*b); i++){
            if(i % a == 0 && i % b == 0){
                return i;
            }
        }
        return a*b;
    }
}
