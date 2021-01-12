package Main;

import Entity.Induk;
import View.Crud;
import java.util.Scanner;

public class Main {

    static Crud dt = new Crud();
    static Induk data = new Induk();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int statusNext = 0;
        int pil;
        int x;
        
        do {
            System.out.println("====================");
            System.out.println(" 1. Input");
            System.out.println(" 2. Lihat");
            System.out.println(" 3. Hapus Data");
            System.out.println(" 4. Edit Data");
            System.out.println("====================");
            System.out.print(" Masukkan Pilihan : ");
            pil = scan.nextInt();
            switch (pil) {
                case 1:
                    System.out.println(" -Tambah Data-");
                    dt.Insert();
                    
                    break;
                case 2:
                    System.out.println(" -Lihat Data-");
                    dt.Lihat();
                    break;
                case 3:
                    System.out.println(" -Delete Data-");
                    dt.Delete();
                    break;
                case 4:
                    System.out.println(" -Edit Data-");
                    dt.Edit();
                    break;
                default:
                    System.out.println(" System.ERRor");
                    break;
            }
            System.out.print("Lanjut Input (masukkan Y/T) : ");
            String next = scan.next();
            if (next.equals("Y") || next.equals("y")) {
                statusNext = 1;
            }
            if (next.equals("T") || next.equals("t")) {
                statusNext = 0;
            }
        } while (statusNext != 0);
    }

}