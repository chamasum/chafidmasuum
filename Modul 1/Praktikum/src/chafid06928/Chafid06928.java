/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chafid06928;

import java.util.Scanner;

/**
 *
 * @author chafid06928
 */
public class Chafid06928 {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Daftar Mahasiwa");
        int Pilihan;

        menumahasiswa MenuMahasiswa = new menumahasiswa();

        do{
            System.out.println("1. List Mahasiwa");
            System.out.println("2. Exit");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    MenuMahasiswa.TampilanMenu();
                    break;
                case 2:
                    System.out.println("Terima Gaji!!");
                    break;
                default:
                    System.out.println("Input tidak dikenal");
                    break;
            }
        }while(Pilihan!=2);
   }

}
