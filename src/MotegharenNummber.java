public class MotegharenNummber {
    public static void main(String[] args) {
        int b, y = 0, x = 0, k;
        b = 212;
        k = b;
        while (b > 0) {
            x = b % 10;
            y = y * 10 + x;
            b = b / 10;
        }
        if (k == y)
            System.out.println("متقارن است");
        else
            System.out.println("متقارن نیست ");
    }
}
