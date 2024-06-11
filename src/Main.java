import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        Scanner reader=new Scanner(System.in);
        System.out.println("لطفا عدد یونانی مورد نیاز را وارد کنید ");

        String x = reader.nextLine();

        int sum = 0;
        for (char ch : x.toCharArray()) {

            int num;
            switch (ch) {
                case 'I' :
                    num=1 ;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X' :
                    num=10 ;
                    break;
                case 'L' :
                    num=50 ;
                    break;
                case 'C' :
                    num=100 ;
                    break;
                case 'D' :
                    num=500 ;
                    break;
                case 'M' :
                    num=1000 ;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }


            sum += num;

        }

        System.out.println("Your Number is " + sum);


    }
}
