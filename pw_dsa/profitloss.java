package pw_dsa;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price of an item : ");
        int sp = sc.nextInt();
        System.out.print("Enter the cost price of an item : ");
        int cp = sc.nextInt();

        if(sp>cp){
            System.out.println("Profit : "+(sp-cp));
        }else if(sp==cp){
            System.out.println("Neither profit nor loss");
        }else{
            System.out.println("Loss : "+(cp-sp));
        }
    }
}
