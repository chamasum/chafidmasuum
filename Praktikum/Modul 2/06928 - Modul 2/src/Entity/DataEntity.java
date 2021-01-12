package Entity;

public class DataEntity extends Induk {

    public String Nama;
    public String Npm;
    public String Matakuliah;

    public DataEntity() {
        
    }
    
    public int GetNo() {
        return super.no;
    }

    public void SetNo(int no) {
        super.no = no;
    }

    public String GetNama() {
        return Nama;
    }

    public void SetNama(String Nama) {
        this.Nama = Nama;
    }

    public String GetNpm() {
        return Npm;
    }

    public void SetNpm(String npm) {
        this.Npm = npm;
    }

    public String GetMatkul() {
        return Matakuliah;
    }

    public void SetMatkul(String Matkul) {
        this.Matakuliah = Matkul;
    }
}
