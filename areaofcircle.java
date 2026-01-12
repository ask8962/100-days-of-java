import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        //input from user
        Scanner sc = new Scanner(System.in);
        // creating varible 
        double a = sc.nextDouble();
        //formula a = pi*r*r
        double area = 3.14 * a * a;
        System.out.println("Area of circle is : " + area);
        sc.close();
    }
}
