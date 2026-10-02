public class PowerRecursion {
//Power of a Number Using Recursion
    public static void main(String[] args) {
        PowerRecursion obj = new PowerRecursion();
        System.out.println(obj.getPowerRecursion(2,3));
    }

    public int getPowerRecursion(int n, int exp){
        if ( exp < 0){
            return -1;
        }
        if(exp == 0){
            return 1;
        }

        return n * getPowerRecursion(n, exp -1);
    }
}
