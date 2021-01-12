package Main;

import Model.ModelData;
import java.util.Scanner;
import Controller.DataController;
import Entity.DataEntity;

public class Main {

    static int no;
    static String nama, npm, matkul;
    static DataController Data = new DataController();

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
                    System.out.print(" No                   : ");
                    no = scan.nextInt();
                    System.out.print(" Masukkan Nama             : ");
                    nama = scan.next();
                    System.out.print(" Masukkan Npm             : ");
                    npm = scan.next();
                    System.out.print(" Masukkan Mata Kuliah : ");
                    matkul = scan.next();
                    Data.Tambah(no, nama, npm, matkul);
                    break;
                case 2:
                    System.out.println(" -Lihat Data-");
                    for (DataEntity entity : Data.getData()) {
                        System.out.println("=====================================");
                        System.out.println("No    = " + entity.GetNo());
                        System.out.println("Nama        = " + entity.GetNama());
                        System.out.println("Npm       = " + entity.GetNpm());
                        System.out.println("Matkul       = " + entity.GetMatkul());
                        System.out.println("=====================================\n");
                    }
                    break;
                case 3:
                    System.out.println(" -Hapus Data-");
                    System.out.print(" Index Ke                   : ");
                    x = scan.nextInt();
                    Data.Delete(x);
                    break;
                case 4:
                    System.out.println(" -Update Data-");
                    System.out.print(" Index Ke                   : ");
                    x = scan.nextInt();
                    System.out.print(" No Ke                   : ");
                    no = scan.nextInt();
                    System.out.print(" Masukkan Nama             : ");
                    nama = scan.next();
                    System.out.print(" Masukkan Npm             : ");
                    npm = scan.next();
                    System.out.print(" Masukkan Mata Kuliah : ");
                    matkul = scan.next();
                    Data.Update(x, no, nama, npm, matkul);
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
