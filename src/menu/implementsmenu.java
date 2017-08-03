/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

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
public class implementsmenu implements interfacemenu {

    koneksidb konek = new koneksidb();
    private String query;
    ResultSet rs;

    @Override
    public List<menu> tampilmenu() {
        konek.getCon();
        List<menu> datamenu;
        datamenu = new ArrayList<>();
        try {
            query = "select * from menu";
            Statement st = konek.getCon().createStatement();
            System.out.println("Data coba ditampilkan ");
            ResultSet rs = st.executeQuery(query);
            System.out.println("Data coba ditampilkan ");

            while (rs.next()) {
                menu menuu = new menu();
                menuu.setIdmenu(rs.getInt(1));
                menuu.setNamamenu(rs.getString(2));
                menuu.setHarga(rs.getString(3));

                datamenu.add(menuu);
            }
            rs.close();
            return datamenu;
        } catch (Exception e) {
            System.out.println("Data gagal ditampilkan " + e.getMessage());
        }
        return datamenu;
    }

    @Override
    public void simpan(menu mn) {
        konek.getCon();
        JOptionPane.showMessageDialog(null, "Tambah daftar menu");
        try {
            Statement st = konek.getCon().createStatement();
            int tambahMenu = st.executeUpdate("insert into menu(Id_Menu, Nama_Menu, Harga)"
                    + "values (" + mn.getIdmenu() + ", "
                    + "'" + mn.getNamamenu() + "' , '" + mn.getHarga() + "') ");
            if (tambahMenu == 1) {
                JOptionPane.showMessageDialog(null, "Tambah Daftar Menu Berhasil Disimpan", 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Gagal Tambah Menu : " + ex.getMessage().toString());
        }
    }

    @Override
    public void edit(menu mn) {
        konek.getCon();
        try {
            Statement st = konek.getCon().createStatement();
            int editmenu = st.executeUpdate("update menu set Nama_Menu='" + mn.getNamamenu() + "' ,"
                    + "Harga ='" + mn.getHarga() + "' where Id_Menu= '"
                    + mn.getIdmenu() + "'");
            if (editmenu == 1) {
                JOptionPane.showMessageDialog(null, "Data Menu Berhasil Diedit",
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println("Gagal Edit Menu : " + ex.getMessage().toString());
        }
    }

    @Override
    public void hapus(menu mn) {
        konek.getCon();
        try {
            Statement st = konek.getCon().createStatement();
            int hapusmenu = st.executeUpdate("delete from menu where Id_Menu= '"
                    + mn.getIdmenu() + "'");
            if (hapusmenu == 1) {
                JOptionPane.showMessageDialog(null, "Data Menu Berhasil Dihapus", 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Gagal Hapus Menu : " + ex.getMessage().toString());
        }
    }

}
