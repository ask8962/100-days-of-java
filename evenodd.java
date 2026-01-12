import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int a = sc.nextInt();
            System.out.println(evenodd(a));
        }
        
    }
    public static String evenodd(int a){
        if(a%2==0){
            return "even";
        }
        return "odd";
    }
}
