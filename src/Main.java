
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int calVar = ca(n);
        if (calVar == 2) {
            System.out.println( n+ " اول است ");
        } else {
            System.out.println( n+ " اول نیست ");
        }

    }
    private static int ca(int n) {
        int counter = 0 ;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}