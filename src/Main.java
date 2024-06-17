import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        int a = factorial(5);
        System.out.println( " نتبجه فاکتوریل " + a);

    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}