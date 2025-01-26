package recursion;

public class EvenNumbersInRange {
    public static void printEvens(int start, int end) {
        if(start <= end){
            if(start %2 == 0){
                System.out.println(start);
            }
            printEvens(start + 1, end);
        }
    }

    public static void main(String[] args) {
        printEvens(1, 8);
    }
}
