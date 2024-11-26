package recursion;

public class IsaPalindrome {
    public static boolean isPalindrome(String s){

        if(s.length() <= 1){
           return true;
        }else if(s.substring(0, 1).equals(s.substring(s.length() - 1 , s.length()))){
            return isPalindrome(s.substring(s.length() - (s.length() - 1), s.length() - 1));
        }else{
            return false;
        }
    }
        
    

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
