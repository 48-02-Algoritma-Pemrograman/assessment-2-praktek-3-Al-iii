import java.util.Scanner;

public class Nomor2 {
    static double hampers (int hampers){
        double harga=0;
        switch (hampers) {
            case 1:
                harga = 150000;
                break;
            case 2 :
                harga =175000;
                break;
            case 3:
                harga = 200000;
                break;
            default:
                break;
        }
        return harga;
    }
    static double packing (int packing){
        double harga=0;
        switch (packing) {
            case 1:
                harga = 50000;
                break;
            case 2 :
                harga = 75000;
                break;
            case 3:
                harga = 125000;
                break;
            default:
                break;
        }
        return harga;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jawab;
        double totalBayar=0;
        int i=0;
        do {
            //System.out.print("Masukan pilihan hampers [1/2/3]: ");
            int hampers = input.nextInt();
            double hargaHampers = hampers(hampers);
            //System.out.print("Masukan pilihan packing [1/2/3]: ");
            int packing = input.nextInt();
            double hargaPacking = packing(packing);
            //System.out.print("Input lagi (Y/N)?: ");
            jawab = input.next().trim().toUpperCase();
            while (!jawab.equals("Y") && !jawab.equals("N")) {
                jawab = input.next().trim().toUpperCase();
            }
            i++;
            
            totalBayar+=hargaHampers+hargaPacking;
        } while (jawab.equals("Y"));
        /* Pekerjaan anda mulai dari sini */
        totalBayar+=(totalBayar*0.1);
        System.out.println("Total hamper yang dipesan = "+ i);
        System.out.println("Total yang harus dibayar = "+ totalBayar);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
