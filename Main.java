import java.util.Scanner;
import java.lang.*;

public class Main {

    private static int b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("First number");
        int a = in.nextInt();
        System.out.println("Second number");
        int b = in.nextInt();
        System.out.println("Third number");
        int c = in.nextInt();
            if (a==13)
            {System.out.println("Sum = 0 ");}
            else if (b==13)
            {System.out.println("Sum = "+a);}
            else if (c==13)
            {int sum2= a+b;
            System.out.println("Sum = "+sum2);}
            else {int sum3 = a + b + c;
            System.out.println("Sum = " + sum3);}

    }
}
