/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author USER
 */
public class transaksi {

    private int nota;
    private String tgl;
    private String waktu;
    private String user;
    private String namauser;
    private int idpegawai;
    private int total;
    private int bayar;
    private int kembalian;
    private String jenis;
    private String keterangan;
    private String namabarang;
    private int jumlah;
    private int harga;
    private int subtot;
    private int iddetail;
    private int idmenu;

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the tgl
     */
    public String getTgl() {
        return tgl;
    }

    /**
     * @param tgl the tgl to set
     */
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    /**
     * @return the waktu
     */
    public String getWaktu() {
        return waktu;
    }

    /**
     * @param waktu the waktu to set
     */
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the namauser
     */
    public String getNamauser() {
        return namauser;
    }

    /**
     * @param namauser the namauser to set
     */
    public void setNamauser(String namauser) {
        this.namauser = namauser;
    }

    /**
     * @return the idpegawai
     */
    public int getIdpegawai() {
        return idpegawai;
    }

    /**
     * @param idpegawai the idpegawai to set
     */
    public void setIdpegawai(int idpegawai) {
        this.idpegawai = idpegawai;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the bayar
     */
    public int getBayar() {
        return bayar;
    }

    /**
     * @param bayar the bayar to set
     */
    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    /**
     * @return the kembalian
     */
    public int getKembalian() {
        return kembalian;
    }

    /**
     * @param kembalian the kembalian to set
     */
    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the jumlah
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * @param jumlah the jumlah to set
     */
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * @return the subtot
     */
    public int getSubtot() {
        return subtot;
    }

    /**
     * @param subtot the subtot to set
     */
    public void setSubtot(int subtot) {
        this.subtot = subtot;
    }
    public int hitung(int Jumlah, int Harga, int Subtotal){
        implementspenjualan imjual = new implementspenjualan();
        return imjual.hitung(this.jumlah, this.harga, this.subtot);
    }

    /**
     * @return the namabarang
     */
    public String getNamabarang() {
        return namabarang;
    }

    /**
     * @param namabarang the namabarang to set
     */
    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    /**
     * @return the iddetail
     */
    public int getIddetail() {
        return iddetail;
    }

    /**
     * @param iddetail the iddetail to set
     */
    public void setIddetail(int iddetail) {
        this.iddetail = iddetail;
    }

    /**
     * @return the idmenu
     */
    public int getIdmenu() {
        return idmenu;
    }

    /**
     * @param idmenu the idmenu to set
     */
    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }
}
