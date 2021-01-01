
package aplikasipendataanmahasiswa;

import DataMasuk.DataMahasiswa;
import DataMasuk.DataJurusan;
import Model.MahasiswaModel;
import Controller.DataMahasiswaController07157;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
public class Aplikasipendataanmahasiswa {
public DataMahasiswaController07157 mahasiswa = new DataMahasiswaController07157();
    public Scanner input = new Scanner(System.in);
    public String npm, nama, no_telp, password;
    public Date tgl_lahir;
    public int pil, index_jurusan, index_mhs;

   
    public static void main(String[] args) throws ParseException {
      Aplikasipendataanmahasiswa global = new Aplikasipendataanmahasiswa();
        System.out.println("Selamat Datang di Aplikasi Pendataan Mahasiswa !!");
        do {
            System.out.println("1. Pendaftaran Mahasiswa");
            System.out.println("2. Lihat data Mahasiswa");
            System.out.println("3. Edit data Mahasiswa");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");
            global.pil = global.input.nextInt();
            switch (global.pil) {
                case 1:
                    global.viewPendaftaran();
                    break;
                case 2:
                    global.viewDataMahasiswa();
                    break;
                case 3:
                    global.viewEditDataMahasiswa();
                    break;
                case 4:
                    global.viewHapusDataMahasiswa();
                    break;
            }
        } while (global.pil != 5);
    }

    public void viewPendaftaran() {
        System.out.print("Input NPM = ");
        npm = input.next();
        System.out.print("Input Nama = ");
        nama = input.next();
        System.out.print("Input Tanggal Lahir = ");
        tgl_lahir = new Date(input.next());
        System.out.print("Input No. Telp = ");
        no_telp = input.next();
        System.out.print("Input Password = ");
        password = input.next();
        for (int i = 0; i < DataJurusan.jurusan.length; i++) {
            System.out.println(i + ". " + DataJurusan.jurusan[i]);
        }
        System.out.print("Pilih Jurusan = ");
        index_jurusan = input.nextInt();
        mahasiswa.insertDataMahasiswa(npm, nama, tgl_lahir, index_jurusan, no_telp, password);
        System.out.println("Data Berhasil DiTambahkan");
    }

    public void viewDataMahasiswa() {
         int i=0;
        for (DataMahasiswa mahasiswa : mahasiswa.getDataMahasiswa()) {
            System.out.println(i+". NPM : " + mahasiswa.getNpm() +
                                "\n   Nama : " + mahasiswa.getNama() +
                                "\n   Jurusan : " + DataJurusan.jurusan[mahasiswa.getIndex_jurusan()] +
                                "\n   Tanggal Lahir : " + mahasiswa.getTgl_lahir() +
                                "\n   No. Telp : " + mahasiswa.getNo_telp() +
                                "\n   Password : " + mahasiswa.getPassword());
            i++;
        }
    }

    public void viewEditDataMahasiswa() throws ParseException {
        String jawab;
        viewDataMahasiswa();
        System.out.print("Pilih Nomor : ");
        index_mhs = input.nextInt();
        do {
            System.out.println("1. Npm : " + mahasiswa.DataMahasiswa(index_mhs).getNpm());
            System.out.println("2. Nama : " + mahasiswa.DataMahasiswa(index_mhs).getNama());
            System.out.println("3. Jurusan : " + DataJurusan.jurusan[mahasiswa.DataMahasiswa(index_mhs).getIndex_jurusan()]);
            System.out.println("4. Tanggal Lahir : " + mahasiswa.DataMahasiswa(index_mhs).getTgl_lahir());
            System.out.println("5. No. Telp : " + mahasiswa.DataMahasiswa(index_mhs).getNo_telp());
            System.out.println("6. PasswordS : " + mahasiswa.DataMahasiswa(index_mhs).getPassword());
            System.out.print("Pilih Angka Untuk Edit : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("NPM Sekarang : " + mahasiswa.DataMahasiswa(index_mhs).getNpm());
                    System.out.print("Input NPM Baru : ");
                    npm = input.next();
                    mahasiswa.updateDataMahasiswa(index_mhs, npm, "npm", "string");
                    break;
                case 2:
                    System.out.println("Nama Sekarang : " + mahasiswa.DataMahasiswa(index_mhs).getNama());
                    System.out.print("Input Nama Baru : ");
                    nama = input.next();
                    mahasiswa.updateDataMahasiswa(index_mhs, nama, "nama", "string");
                    break;
                case 3:
                    for (int i = 0; i < DataJurusan.jurusan.length; i++) {
                        System.out.println(i + ". " + DataJurusan.jurusan[i]);
                    }
                    System.out.println("Jurusan Sekarang : " + DataJurusan.jurusan[mahasiswa.DataMahasiswa(index_mhs).getIndex_jurusan()]);
                    System.out.print("Pilih Jurusan Baru : ");
                    String str_index_jurusan = input.next();
                    mahasiswa.updateDataMahasiswa(index_mhs, str_index_jurusan, "index_jurusan", "int");
                    break;
                case 4:
                    System.out.println("Tanggal Lahir Sekarang : " + mahasiswa.DataMahasiswa(index_mhs).getTgl_lahir());
                    System.out.print("Input Tgl. Lahir Baru : ");
                   String Str_tgl_lahir = input.next();
                    mahasiswa.updateDataMahasiswa(index_mhs, Str_tgl_lahir, "tanggal", "date");
                    break;
                case 5:
                    System.out.println("No. Telp Sekarang : " + mahasiswa.DataMahasiswa(index_mhs).getNo_telp());
                    System.out.print("Input No. Telp Baru : ");
                    no_telp = input.next();
                   mahasiswa.updateDataMahasiswa(index_mhs, no_telp, "noTelp", "string");
                    break;
                case 6:
                    System.out.println("Password Sekarang : " + mahasiswa.DataMahasiswa(index_mhs).getPassword());
                    System.out.print("Input Password Baru : ");
                    password = input.next();
                    mahasiswa.updateDataMahasiswa(index_mhs, password, "password", "string");
                    break;
            }
            System.out.println("Data Berhasil DiEdit");
            System.out.println("Apakah Ingin Edit Lagi ? (y/t)");
            jawab = input.next();
        } while (jawab == "y");
    }

    public void viewHapusDataMahasiswa() {
        viewDataMahasiswa();
        System.out.print("Pilih Nomor : ");
        index_mhs = input.nextInt();
        mahasiswa.deleteDataMahasiswa(index_mhs);
        System.out.println("Data Berhasil Dihapus");
    }
}
    
    

