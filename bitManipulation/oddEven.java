package bitManipulation;

public class oddEven {
    public static void isEven(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        isEven(35);
    }
}
