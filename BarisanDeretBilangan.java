
package mathmoduls;
import java.util.Scanner;
import static mathmoduls.aritmatika.input;


public class BarisanDeretBilangan {   
    
    public static void main(String[] args) {
        looping();
              
    
    }
    
    public static void looping(){
        Geometri g = new Geometri();
        aritmatika a = new aritmatika();
        Scanner s = new Scanner(System.in);
    
        System.out.println("Barisan dan deret bilangan \n 1. Aritmatika \n 2. Geometri");
        System.out.print("masukkan pilihanmu : ");
        int choice = s.nextInt();
        
        switch(choice){
            case 1 : 
               a.loop();
                break;
            case 2:
                g.loop();
                break;
            default :
                System.out.println("error");
                
         choice();
        }
    }
    
    public static void choice(){
        Scanner s = new Scanner(System.in);
        System.out.println("mau ulang lagi ? ");
        System.out.print("y/n : ");
        String choice = s.next();
        switch(choice){
            case "y":
                looping();
                break;
            case "n":
                System.out.println("baiklah terima kasih, telah menggunakan kami");
                break;
            default:
                System.out.println("coba lagi");
                break;
    }
    }
    
    public static void loong(){
        Geometri g = new Geometri();
        aritmatika a = new aritmatika();
        Scanner s = new Scanner(System.in);
    
        System.out.println("Barisan dan deret bilangan \n 1. Aritmatika \n 2. Geometri \n 3. Menyelesaikan Operasi");
        System.out.print("masukkan pilihanmu : ");
        int choice = s.nextInt();
        
        switch(choice){
            case 1 : 
               a.loop();
                break;
            case 2:
                g.loop();
                break;
            case 3:
                System.out.println("Terima kasih telan menggunakan opersai kami");
                break;
            default :
                System.out.println("error");
                
         choice();
        }
    }
    
}
