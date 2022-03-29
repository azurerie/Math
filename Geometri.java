
package mathmoduls;
import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import java.util.Scanner;

public class Geometri {
    
    public static void main(String[] args) {
        loop();
    }
    
    public  static void loop(){
        Scanner s = new Scanner(System.in); 
        System.out.println("=== mari coba rumus aritmatika ===");    
        input();
        
    }
    
    public static void input(){
        Scanner s = new Scanner(System.in);    
        double a=0, r=0, n=0;
        
        System.out.println("apa yang kamu cari ? \n 1.Un \n 2.Sn ");
        System.out.print("pilihanmu : ");
        int choice = s.nextInt();
        
        
        // Un = a.r^n-1
        // Sn = a.(r^n -1/r-1)
        
        System.out.println("masukkan angka suku pertama (a)");  
        System.out.print("a : ");
        a = s.nextDouble();
        System.out.println("masukkan rasio : ");
        System.out.print("r : ");
        r = s.nextDouble();
        System.out.println("masukkan suku keberapa yang ingin kalian ketahui ");
        System.out.print("n : ");
        n = s.nextDouble();    
        
        switch(choice){
            case 1:
                rumusUn(a,r, n);
                break;
            case 2:
                rumusSn(a,r, n);
                break;
            default:                
                System.out.println("coba lagi");
        }
                               
    }
    
    public static void rumusUn(double h , double i, double j){
        BarisanDeretBilangan bdb = new BarisanDeretBilangan();
        
        Scanner s = new Scanner(System.in);    
        int a = (int) (h);
        int r = (int) (i);
        int n = (int) (j);
        double un = Math.pow(r,n-1);
        
        
        System.out.println("rumus : Un = a.r^n-1");
        System.out.println("menjadi : U"+n +" = "+a+"."+un);
        System.out.println("        : U"+n +" = "+a*un);
        System.out.println("Jadi, suku ke "+ n + " adalah "+a*un);
        
        System.out.println("mau ulang lagi ? ");
        System.out.print("y/n : ");
        String choice = s.next();
        switch(choice){
            case "y":
                input();
                break;
            case "n":
                bdb.loong();
                break;
            default:
                System.out.println("coba lagi");
                break;
        }
    }
   
    public static void rumusSn(double h , double i, double j){
        BarisanDeretBilangan bdb = new BarisanDeretBilangan();
        Scanner s = new Scanner(System.in);    
        
        double a = (double) (h);
        double r = (double) (i);
        double n = (double) (j);
        double sn = 0;
        double pembilang = Math.pow(r,n)-1;
        double penyebut = r -1;
        System.out.println("rumus : Sn = a.(r^n - 1 / r - 1)");
        System.out.println("menjadi : pembilang = r^n - 1");
        System.out.println("        : pembilang = "+ pembilang);
        System.out.println("        : penyebut = r - 1");
        System.out.println("        : penyebut = "+ penyebut);
        System.out.println("        : S"+n +" = a."+"("+pembilang+"/"+penyebut+")");
        System.out.println("        : S"+n +" = a."+"("+pembilang/penyebut+")");
        System.out.println("        : S"+n +" = "+a+"."+"("+pembilang/penyebut+")");
         System.out.println("        : S"+n +" = "+a*(pembilang/penyebut));
        
        
        System.out.println("Jadi, jumlah suku ke "+ n + " adalah "+a*(pembilang/penyebut));
        
        System.out.println("mau ulang lagi ? ");
        System.out.print("y/n : ");
        String choice = s.next();
        switch(choice){
            case "y":
                input();
                break;
            case "n":
                bdb.loong();
                break;
            default:
                System.out.println("coba lagi");
                break;
    }
    }
}
