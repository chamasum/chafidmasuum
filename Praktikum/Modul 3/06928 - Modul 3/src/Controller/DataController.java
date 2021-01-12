package Controller;

import Entity.DataEntity;
import Model.ModelData;
import java.util.*;

public class DataController {

    private ModelData Data = new ModelData();

    public void Tambah(int No, String Nama, String Npm, String Matkul){
        DataEntity dataEntity = new DataEntity();
        dataEntity.SetNo(No);
        dataEntity.SetNama(Nama);
        dataEntity.SetNpm(Npm);
        dataEntity.SetMatkul(Matkul);
        Data.Tambah(dataEntity);
    }
    
    public void Update(int index, int No, String Nama, String Npm, String Matkul){
        DataEntity dataEntity = new DataEntity();
        dataEntity.SetNo(No);
        dataEntity.SetNama(Nama);
        dataEntity.SetNpm(Npm);
        dataEntity.SetMatkul(Matkul);
        Data.Edit(index, dataEntity);
    }
    
    public void Delete(int index){
        Data.Delete(index);
    }

    public ArrayList<DataEntity> getData() {
        return Data.getArrayData();
    }
}
