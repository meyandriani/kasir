/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import koneksi.koneksidb;

/**
 *
 * @author USER
 */
public class implementspegawai implements interfacepegawai {

    koneksidb konek = new koneksidb();
    private String query;
    ResultSet rs;

    public implementspegawai() {

    }

    @Override
    public List<pegawai> tampilpegawai() {
        konek.getCon();
        List<pegawai> datapegawai;
        datapegawai = new ArrayList<>();
        try {
            query = "select Id_Pegawai, User, Nama, Hak_Akses, No_Hp, Alamat from pegawai";
            Statement st = konek.getCon().createStatement();
            System.out.println("Data coba ditampilkan ");
            ResultSet rs = st.executeQuery(query);
            System.out.println("Data coba ditampilkan ");

            while (rs.next()) {
                pegawai pga = new pegawai();
                pga.setIdpegawai(rs.getInt(1));
                pga.setUser(rs.getString(2));
                pga.setNama(rs.getString(3));
                pga.setAkses(rs.getString(4));
                pga.setNohp(rs.getString(5));
                pga.setAlamat(rs.getString(6));

                datapegawai.add(pga);
            }
            rs.close();
            return datapegawai;
        } catch (Exception e) {
            System.out.println("Data gagal ditampilkan " + e.getMessage());
        }
        return datapegawai;
    }

    @Override
    public void simpan(pegawai pg) {
      konek.getCon();
        JOptionPane.showMessageDialog(null, "Tambah data pagawai");
        try {
            Statement st = konek.getCon().createStatement();
            int tambahMenu = st.executeUpdate("insert into pegawai"
                    + "(User, Nama, Hak_Akses, No_Hp, Password, Alamat)"
                    + "values ( '" + pg.getUser() + "', '" + pg.getNama() + "' , '"
                    + pg.getAkses() + "', '"+ pg.getNohp()+ "' , '" 
                    + pg.getPassword()+"', '"+ pg.getAlamat()+"') ");
            if (tambahMenu == 1) {
                JOptionPane.showMessageDialog(null, 
                        "Tambah Daftar Pegawai Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Gagal Tambah Pegawai : " + ex.getMessage().toString());
        }  
    }

    @Override
    public void edit(pegawai pg) {
    konek.getCon();
        try {
            Statement st = konek.getCon().createStatement();
            int editpegawai = st.executeUpdate("update pegawai set No_Hp='" + pg.getNohp()
                    + "' , Hak_Akses ='" + pg.getAkses() + "' , Alamat ='" + pg.getAlamat()+
                    "' where Id_Pegawai= '"
                    + pg.getIdpegawai() + "'");
            if (editpegawai == 1) {
                JOptionPane.showMessageDialog(null, "Data Pegawai Berhasil Diedit", 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println("Gagal Edit Pegawai : " + ex.getMessage().toString());
        }    
    }

    @Override
    public void hapus(pegawai pg) {
        konek.getCon();
        try {
            Statement st = konek.getCon().createStatement();
            int hapuspegawai = st.executeUpdate("delete from pegawai where User= '"
                    + pg.getUser() + "'");
            if (hapuspegawai == 1) {
                JOptionPane.showMessageDialog(null, "Data Pegawai Berhasil Dihapus", 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Gagal Hapus Pegawai : " + ex.getMessage().toString());
        }
    }

}
