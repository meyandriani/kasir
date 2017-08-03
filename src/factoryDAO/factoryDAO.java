/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryDAO;

import menu.interfacemenu;
import menu.implementsmenu;
import pegawai.implementspegawai;
import pegawai.interfacepegawai;
import transaksi.implementspembelian;
import transaksi.implementspenjualan;
import transaksi.interfacetransaksi;
public class factoryDAO {

    private menu.interfacemenu intermenu;
    private loginkasir.interfacelogin interlogin;
    private pegawai.interfacepegawai interpegawai;
    private transaksi.interfacetransaksi interpenjualan;
    private transaksi.interfacetransaksi interpembelian;
    public interfacemenu getMenuDAO() {
        if (intermenu == null) {
            intermenu = new implementsmenu();
        }
        return intermenu;
    }
    public interfacepegawai getPegawaiDAO() {
        if (interpegawai == null) {
            interpegawai = (interfacepegawai) new implementspegawai();
        }
        return interpegawai;
    }
    public interfacetransaksi getPenjualanDAO() {
        if (interpenjualan == null) {
            interpenjualan =  new implementspenjualan();
        }
        return interpenjualan;
    }
    public interfacetransaksi getPembelianDAO(){
        if (interpembelian == null){
            interpembelian =  new implementspembelian();
        }
        return interpembelian;
    }
}
    
   