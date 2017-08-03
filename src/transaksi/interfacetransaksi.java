/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.util.List;


/**
 *
 * @author USER
 */
public interface interfacetransaksi {

    void simpan(transaksi trans);
    public int totalbayar(int Bayar, int Total);
    public int hitung(int Jumlah, int Harga, int Subtotal);
    List<transaksi> tampilmenu();
}
