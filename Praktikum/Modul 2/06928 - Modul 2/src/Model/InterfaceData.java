package Model;

import Entity.DataEntity;

public interface InterfaceData {
    public void Tambah(DataEntity Data);
    public void Edit(int index, DataEntity Data);
    public void Delete(int index);
}
