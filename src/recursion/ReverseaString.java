package recursion;

public class ReverseaString {
    public static void reverse(String s) {
        if(s.length() == 1){
            System.out.println(s);
        }else{
            System.out.println(s.charAt(s.length() - 1));
            reverse(s.substring(0, s.length()-1));
        }
    }

    public static void main(String[] args) {
        reverse("hello");
    }
}
