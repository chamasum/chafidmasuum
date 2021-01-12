package View;

import Entity.Induk;
import Entity.DataEntity;
import Model.ModelData;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {

    public Scanner input = new Scanner(System.in);
    public int Index, Pilihan, No;
    public String Nama, Npm, Matkul;
    public ModelData model = new ModelData();
    public Induk data = new Induk();
    public DataEntity array;

    public void Insert() {
        System.out.print("No   = ");
        No = input.nextInt();
        System.out.print("Nama = ");
        Nama = input.next();
        System.out.print("NPM  = ");
        Npm = input.next();
        System.out.print("Mata Kuliah = ");
        Matkul = input.next();
        DataEntity dataEntity = new DataEntity();
        dataEntity.SetNo(No);
        dataEntity.SetNama(Nama);
        dataEntity.SetNpm(Npm);
        dataEntity.SetMatkul(Matkul);
        model.Tambah(dataEntity);
    }

    public void Edit() {
        System.out.print("Input Index = ");
        Index = input.nextInt();
        System.out.print("No   = ");
        No = input.nextInt();
        System.out.print("Nama = ");
        Nama = input.next();
        System.out.print("NPM  = ");
        Npm = input.next();
        System.out.print("Mata Kuliah = ");
        Matkul = input.next();
        DataEntity dataEntity = new DataEntity();
        dataEntity.SetNo(No);
        dataEntity.SetNama(Nama);
        dataEntity.SetNpm(Npm);
        dataEntity.SetMatkul(Matkul);
        model.Edit(Index, dataEntity);
    }

    public void Delete() {
        System.out.print("Input Index = ");
        Index = input.nextInt();
        model.Delete(Index);
    }

    public void Lihat() {
        for (DataEntity entity : getData()) {
            System.out.println("=====================================");
            System.out.println("No    = " + entity.GetNo());
            System.out.println("Nama        = " + entity.GetNama());
            System.out.println("Npm       = " + entity.GetNpm());
            System.out.println("Matkul       = " + entity.GetMatkul());
            System.out.println("=====================================\n");
        }
    }
    
    public ArrayList<DataEntity> getData() {
        return model.getArrayData();
    }
}
