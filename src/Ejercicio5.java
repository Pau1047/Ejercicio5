import java.awt.print.PrinterIOException;
import java.util.Scanner;

public class Ejercicio5 {

    public static final double PI= 3.1415;

    public static void main(String[] args) {

        double n1, length, area;


        Scanner introducir = new Scanner(System.in);
        System.out.println("Please enter the radius os a circle");
        n1 = introducir.nextInt();

        length = 2 * PI * n1;
        area = PI * (n1*n1);

        System.out.println("The length of your circle is " + length);
        System.out.println("The area of your circle is " + area);
    }
}
