/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

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
public class implementspenjualan implements interfacetransaksi {

    koneksidb konek = new koneksidb();
    private String query;
    ResultSet rs;

    @Override
    public void simpan(transaksi trans) {
        konek.getCon();
        JOptionPane.showMessageDialog(null, "Tambah data penjualan");
        try {
            Statement st = konek.getCon().createStatement();
            int tambahJualan = st.executeUpdate("insert into penjualan"
                    + "(notajual, tgljual, waktujual, totaljual, bayar, kembali, Id_Pegawai)"
                    + "values ( '" + trans.getNota() + "', '" + trans.getTgl() + "' , '"
                    + trans.getWaktu()  + "' , '"
                    + trans.getTotal() + "', '" + trans.getBayar() + "' , '"
                    + trans.getKembalian() + "' , '" + trans.getIdpegawai() + " ') ");
            if (tambahJualan == 1) {
                JOptionPane.showMessageDialog(null,
                        "Tambah Penjualan Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                        "Tambah Penjualan Gagal Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
    }

    @Override
    public int totalbayar(int Bayar, int Total) {
        transaksi trans = new transaksi();
        if (Bayar >= Total) {
            int kembali = Bayar - Total;
            trans.setKembalian(kembali);
        } else {
            int kurang = Total - Bayar;
            JOptionPane.showMessageDialog(null, "Jumlah Uang Anda Kurang " + kurang);
        }
        return Total;

    }

    /**
     *
     * @param Jumlah
     * @param Harga
     * @param Subtotals
     * @return
     */
    @Override
    public int hitung(int Jumlah, int Harga, int Subtotals) {

        int totsub = Jumlah * Harga;
        int tot = 0;
        int totall = tot + totsub;
        Subtotals = totall;
        return totall;
    }
    @Override
    public List<transaksi> tampilmenu() {
        konek.getCon();
        List<transaksi> daftarmenu;
        daftarmenu = new ArrayList<>();
        try {
            query = "select Id_Menu, Nama_Menu , Harga from menu";
            Statement st = konek.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                transaksi menuu = new transaksi();
                menuu.setIdmenu(rs.getInt(1));
                menuu.setNamabarang(rs.getString(2));
                menuu.setHarga(rs.getInt(3));

                daftarmenu.add(menuu);
            }
            rs.close();
            return daftarmenu;
        } catch (SQLException e) {
            System.out.println("Data gagal ditampilkan " + e.getMessage());
        }
        return daftarmenu;
    }
}