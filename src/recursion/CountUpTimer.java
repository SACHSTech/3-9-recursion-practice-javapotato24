package recursion;

public class CountUpTimer {
    public static void countUp(int current, int n) {
        // solution here
        if(current <= n){
            System.out.println(current);
            countUp(current + 1, 5);
        }

    }

    public static void main(String[] args) {
        countUp(1, 5); // Output: 1 2 3 4 5
    }
}