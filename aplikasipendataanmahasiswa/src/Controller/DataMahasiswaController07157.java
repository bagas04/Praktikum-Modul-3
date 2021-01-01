/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataMasuk.DataMahasiswa;
import DataMasuk.Manusia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
public class DataMahasiswaController07157 {
    int indexlogin;
    public DataMahasiswa DataMahasiswa(int index){
        return AllObjectModel07157.mahasiswaModel.getMahasiswa(index);
    }
    public DataMahasiswa mahasiswa(int index) {
        return AllObjectModel07157.mahasiswaModel.getMahasiswa(index);
    }

    public void insertDataMahasiswa(String npm, String nama, Date tanggal_lahir, int index_jurusan, String no_telp, String password) {
        DataMahasiswa mahasiswa = new DataMahasiswa(npm, nama, tanggal_lahir, index_jurusan, no_telp, password);
        AllObjectModel07157.mahasiswaModel.insertMahasiswaModel(mahasiswa);
    }

    public void deleteDataMahasiswa(int index) {
        AllObjectModel07157.mahasiswaModel.hapusMahasiswaModel(index);
    }

    public ArrayList<DataMahasiswa> getDataMahasiswa() {
        return AllObjectModel07157.mahasiswaModel.getAllMahasiswa();
    }

    public void updateDataMahasiswa(int index, String data, String ubah, String tipe) throws ParseException {
        switch(tipe) {
            case "string" :
                switch(ubah) {
                    case "npm":
                        AllObjectModel07157.mahasiswaModel.editNpmMahasiswaModel(index, data);
                        break;
                    case "nama":
                        AllObjectModel07157.mahasiswaModel.editNamaMahasiswaModel(index, data);
                        break;
                    case "noTelp":
                        AllObjectModel07157.mahasiswaModel.editNoTelpMahasiswaModel(index, data);
                        break;
                    case "password":
                        AllObjectModel07157.mahasiswaModel.editPasswordMahasiswaModel(index, data);
                        break;
                }
                break;
            case "date" :
               AllObjectModel07157.mahasiswaModel.editMahasiswaModel(index, new SimpleDateFormat("dd/MM/yyyy").parse(data));
                break;
            case "int":
                AllObjectModel07157.mahasiswaModel.editMahasiswaModel(index, Integer.parseInt(data));
                break;
        }
    }
}
    

