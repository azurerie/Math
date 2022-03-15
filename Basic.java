package basic;

import java.util.Scanner;

public class Basic {    
    public static void main(String[] args) {
        double input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Uang: ");
        input= scan.nextDouble();
        double amount = input;    
System.out.println(String.format("%,.2f", amount));
    }
}
