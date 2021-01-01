/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMasuk;

import java.util.Date;
public class DataMahasiswa extends Manusia{
   private String npm,password;
    private int index_jurusan;

    public DataMahasiswa(String npm, String nama, Date tgl_lahir, String no_telp, String password, int index_jurusan) {
        
    }
    
    public DataMahasiswa() {
    }

    public DataMahasiswa(String npm, String nama, Date tanggal_lahir, int index_jurusan, String no_telp, String password) {
        this.npm = npm;
        super.nama = nama;
        super.tgllahir = tanggal_lahir;
        super.no_telp = no_telp;
        this.password = password;
        this.index_jurusan = index_jurusan;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

   public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTgl_lahir() {
        return tgllahir;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        super.tgllahir = tgllahir;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIndex_jurusan() {
        return index_jurusan;
    }

    public void setIndex_jurusan(int index_jurusan) {
        this.index_jurusan = index_jurusan;
    }

  
  
    }
  

