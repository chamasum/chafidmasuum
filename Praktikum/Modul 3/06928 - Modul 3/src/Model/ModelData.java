package Model;

import Entity.DataEntity;
import java.util.ArrayList;

public class ModelData{

    public ArrayList<DataEntity> ArrayData;
    
    public ModelData(){
        this.ArrayData = new ArrayList<>();
    }
    
    public void Tambah(DataEntity Data){
        ArrayData.add(Data);
    }

    public void Edit(int index, DataEntity Data) {
        ArrayData.set(index, Data);
    }

    public void Delete(int index) {
        ArrayData.remove(index);
    }

    public ArrayList<DataEntity> getArrayData(){
        return ArrayData;
    }
    
}
