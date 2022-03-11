import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        double jajan, butuh ;
        float hasil;
        float Index=100;
        float percentage;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan uang jajan selama sebulan: ");
        jajan = scan.nextDouble();
        System.out.print("Kebutuhan Sehari - hari: ");
        butuh = scan.nextDouble();
        if (jajan<butuh*30) {
            percentage = 0;
        }else{
        float awal=(float) (butuh*30);
        percentage= (float) (jajan-awal);
        
        percentage= (float) (percentage*100/jajan);
        }
        System.out.println("Percentasi Hemat: " + percentage+ "%");
        hasil=Index-percentage;
        System.out.println("Persentasi Boros: "+ hasil);
        }
        
}
    

