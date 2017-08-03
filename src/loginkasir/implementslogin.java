/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginkasir;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import koneksi.koneksidb;
import transaksi.transaksi;

/**
 *
 * @author USER
 */
public class implementslogin implements interfacelogin {

    login log = new login();
    private ResultSet res;
    public static String kode = "";
    public static String user;

    @Override
    public boolean validate_login(String User, String Pass) {

        try {
//         
            koneksidb konek = new koneksidb();
            PreparedStatement pst = konek.getCon().prepareStatement("Select * from pegawai where User=? and Password=? ");

            pst.setString(1, User);
            pst.setString(2, String.valueOf(Pass.hashCode()));
            System.out.println(Pass.hashCode());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                this.log.setUser(User);
                this.log.setIdpegawai(rs.getInt(1));
                return true;
            } else {
                return false;
            }
                        
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public int masuk(int idpegawai) {
        try {
            transaksi tran = new transaksi();
            koneksidb konek = new koneksidb();
            PreparedStatement pst = konek.getCon().prepareStatement(
                    "select `Id_Pegawai` from pegawai where `User` = ?"+tran.getUser());

            pst.setInt(1, idpegawai);
            tran.setIdpegawai(idpegawai);

            res = pst.executeQuery();
            int u = idpegawai;
            while (res.next()) {
                u = res.getInt(1);
            }
            return u;

        } catch (Exception e) {
            return e.getMessage().length();
        }
    }

}
