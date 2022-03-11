/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

public class aritmatika {
    
    
    public static void main(String[] args) {
        loop();
    }
    
    private  static void loop(){
        Scanner s = new Scanner(System.in); 
        System.out.println("=== mari coba rumus aritmatika ===");    
        input();
        
    }
    
    public static void input(){
        Scanner s = new Scanner(System.in);    
        double a=0, b=0, n=0;
        
        System.out.println("apa yang kamu cari ? \n 1.Un \n 2.Sn ");
        System.out.print("pilihanmu : ");
        int choice = s.nextInt();
        
        
        // Un = a + (n + 1)b
        
        System.out.println("masukkan angka suku pertama (a)");  
        System.out.print("a : ");
        a = s.nextDouble();
        System.out.println("masukkan selisih angka antara suku kedua");
        System.out.print("b : ");
        b = s.nextDouble();
        System.out.println("masukkan suku keberapa yang ingin kalian ketahui ");
        System.out.print("n : ");
        n = s.nextDouble();    
        
        switch(choice){
            case 1:
                rumusUn(a,b, n);
                break;
            case 2:
                rumusSn(a,b, n);
                break;
            default:                
                System.out.println("coba lagi");
        }
                               
    }
    
    private static void rumusUn(double h , double i, double j){
        Scanner s = new Scanner(System.in);    
        int a = (int) (h);
        int b = (int) (i);
        int n = (int) (j);
        double un = a+(n-1)*b;
        
        
        System.out.println("rumus : Un = a + (n - 1)b");
        System.out.println("menjadi : U"+n +" = "+a+" + ("+n+" - 1) "+b);
        System.out.println("        : U"+n +" = "+a+" + ("+(n-1)+") "+b);
        System.out.println("        : U"+n +" = "+a+" + ("+(n-1)*b+")");
        System.out.println("        : U"+n +" = "+(a+(n-1)*b));
        
        System.out.println("Jadi, jumlah suku ke "+ n + " adalah "+un);
        
        System.out.println("mau ulang lagi ? ");
        System.out.print("y/n : ");
        String choice = s.next();
        switch(choice){
            case "y":
                input();
                break;
            case "n":
                System.out.println("baiklah terima kasih, telah menggunakan kami");
                break;
            default:
                System.out.println("coba lagi");
                break;
        }
    }
   
    private static void rumusSn(double h , double i, double j){
        Scanner s = new Scanner(System.in);    
        int a = (int) (h);
        int b = (int) (i);
        int n = (int) (j);
        int sn = n/2*(2*a+(n-1)*b);
        System.out.println("rumus : Sn = 1/2n(2a+(n-1)b)");
        System.out.println("menjadi : S"+n +" = 1/2"+n+"(2"+a+" + ("+n+" - 1) "+b+")");
        System.out.println("        : S"+n +" = 1/2"+n+"(2"+a+" + ("+(n-1)+") "+b+")");
        System.out.println("        : S"+n +" = 1/2"+n+"(2"+a+" + ("+(n-1)*b+") )");
        System.out.println("        : S"+n +" = "+(2*a+(n-1)*b));
        System.out.println("        : S"+n +" = "+sn);
        
        System.out.println("Jadi, jumlah suku ke "+ n + " adalah "+sn);
        
        System.out.println("mau ulang lagi ? ");
        System.out.print("y/n : ");
        String choice = s.next();
        switch(choice){
            case "y":
                input();
                break;
            case "n":
                System.out.println("baiklah terima kasih, telah menggunakan kami");
                break;
            default:
                System.out.println("coba lagi");
                break;
    }
    }
             
}


