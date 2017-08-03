/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import koneksi.koneksidb;

/**
 *
 * @author USER
 */
public class implementspembelian implements interfacetransaksi{
    koneksidb konek = new koneksidb();
    private String query;
    ResultSet rs;

    @Override
    public void simpan(transaksi trans) {
    konek.getCon();
        JOptionPane.showMessageDialog(null, "Tambah data pembelian");
        try {
            Statement st = konek.getCon().createStatement();
            int tambahBeli = st.executeUpdate("insert into pembelian"
                    + "(notabeli, tglbeli, waktubeli, keterangan, totalbeli, bayar, jenis, Id_Pegawai)"
                    + "values ( '" + trans.getNota() + "', '" + trans.getTgl() + "' , '"
                    + trans.getWaktu()  + "' , '" + trans.getKeterangan()+"','"
                    + trans.getTotal() + "', '" + trans.getBayar() + "' , '"
                    + trans.getJenis() + "' , '" + trans.getIdpegawai() + " ') ");
            if (tambahBeli == 1) {
                JOptionPane.showMessageDialog(null,
                        "Tambah Penjualan Berhasil Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                        "Tambah Pembelian Gagal Disimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(ex.getMessage());
            }    
    }

    @Override
    public int totalbayar(int Bayar, int Total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hitung(int Jumlah, int Harga, int Subtotal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<transaksi> tampilmenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
