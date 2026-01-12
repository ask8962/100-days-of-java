package lab_code;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n =20;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "); //for prinitng space 
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");//for printing *
            }
            System.out.println();
        }
        sc.close();
    }
}
