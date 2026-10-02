public class SumRecursion {
    public static void main(String[] args) {
        SumRecursion sum = new SumRecursion();
        System.out.println(sum.getSum(2));
    }

    public int getSum(int n){
        if(n<0){
            return -1;
        }

        if(n==0){
            return 0;
        }

        return n + getSum(n - 1);
    }
}

//If the method keeps calling itself then Java would throw - StackOverflowError
