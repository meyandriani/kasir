/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

import java.util.List;

/**
 *
 * @author USER
 */
public interface interfacepegawai {
     List<pegawai> tampilpegawai();
    void simpan(pegawai pg);
    void edit (pegawai pg);
    void hapus (pegawai pg);
}
