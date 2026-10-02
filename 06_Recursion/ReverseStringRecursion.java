public class ReverseStringRecursion {
    //Reverse a String Using Recursion
    //For Recursion problems always write a base case and a recursive case
    public  static void main(String args[]){
        ReverseStringRecursion obj = new ReverseStringRecursion();
        System.out.println(obj.getReverseString("abcd"));
    }

    public String getReverseString(String s){
        if(s == ""){
            return "";
        }
        return s.charAt(0) + getReverseString(s);

    }
}
