package Model;

import Entity.DataEntity;
import Entity.Induk;
import java.util.ArrayList;

public class ModelData implements InterfaceData{
    
    public Induk array = new Induk();
    
    @Override
    public void Tambah(DataEntity Data){
        array.ArrayData.add(Data);
    }

    @Override
    public void Edit(int index, DataEntity Data) {
        array.ArrayData.set(index, Data);
    }

    @Override
    public void Delete(int index) {
        array.ArrayData.remove(index);
    }
    
    public ArrayList<DataEntity> getArrayData(){
        return array.ArrayData;
    }
    
}
