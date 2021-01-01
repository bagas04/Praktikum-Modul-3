package Model;
import Controller.DataMahasiswaController07157;
import DataMasuk.DataMahasiswa;
import DataMasuk.DataJurusan;
import java.util.ArrayList;
import java.util.Date;

public class MahasiswaModel {
    private ArrayList<DataMahasiswa> mahasiswaEntityArrayList;
    private DataMahasiswa mahasiswaEntity = new DataMahasiswa();
    
    public MahasiswaModel() {
        mahasiswaEntityArrayList = new ArrayList<DataMahasiswa>();
    }
    
    public DataMahasiswa getMahasiswa(int index) {
        return mahasiswaEntityArrayList.get(index);
    }
     
    public void insertMahasiswaModel(DataMahasiswa mahasiswa) {
        mahasiswaEntityArrayList.add(mahasiswa);
    }
    
  public void editNpmMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setNpm(data);
    }
    
   public void editNamaMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setNama(data);
    }
   public void editNoTelpMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setNo_telp(data);
    }
   public void editPasswordMahasiswaModel(int index, String data) {
        mahasiswaEntityArrayList.get(index).setPassword(data);
    }
   public void editMahasiswaModel(int index, Date data) {
        mahasiswaEntityArrayList.get(index).setTgl_lahir(data);
    }
   public void editMahasiswaModel(int index, int data) {
        mahasiswaEntityArrayList.get(index).setIndex_jurusan(data);
    }
    
    public void hapusMahasiswaModel(int index) {
        mahasiswaEntityArrayList.remove(mahasiswaEntityArrayList.get(index));
    }

   public ArrayList<DataMahasiswa> getAllMahasiswa() {
        return mahasiswaEntityArrayList;
    }
   

    
    }
 

