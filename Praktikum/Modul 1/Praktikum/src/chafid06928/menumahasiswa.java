/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chafid06928;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cendy
 */
public class menumahasiswa {
    ArrayList <mahasiswaentity> ArrayMahasiswa = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    public void TampilanMenu(){
        String nama, npm;
        int Pilihan, Index;
                
        do{
            System.out.println("Menu Mahasiswa");
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. Edit Mahasiswa");
            System.out.println("3. Delete Mahasiswa");
            System.out.println("4. Tampilkan Mahasiswa");
            System.out.println("5. Kembali");
            System.out.print("Pilihan = "); Pilihan = input.nextInt();
            switch(Pilihan){
                case 1:
                    //CREATE
                    System.out.print("Nama          = "); 
                        nama = input.next();
                    System.out.print("NPM          = "); 
                        npm = input.next();
                    ArrayMahasiswa.add(new mahasiswaentity(nama, npm));
                    break;
                case 2:
                    //EDIT
                    System.out.print("Input Index = "); 
                        Index = input.nextInt();
                    System.out.print("Nama          = "); 
                        nama = input.next();
                        input.nextLine();
                    System.out.print("NPM          = "); 
                        npm = input.next();
                    ArrayMahasiswa.set(Index, new mahasiswaentity(nama, npm));
                    
                    break;
                case 3:
                    //DELETE
                    System.out.print("Input Index = "); Index = input.nextInt();
                    ArrayMahasiswa.remove(Index);
                    break;
                case 4:
                    //VIEW
                    for(int i=0;i<ArrayMahasiswa.size();i++){
                        System.out.println("Index "+i);
                        System.out.println("Nama          = "+ArrayMahasiswa.get(i).getNama());
                        System.out.println("NPM        = "+ArrayMahasiswa.get(i).getNpm());
                        System.out.println("");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak dikenali !");
                    
            }
        }while(Pilihan!=5);
    }
    
}
