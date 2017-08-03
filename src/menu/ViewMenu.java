/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import factoryDAO.factoryDAO;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksidb;

/**
 *
 * @author USER
 */
public final class ViewMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewMenu
     */
    private List<menu> listmenu;
    private final String[] tabele;
    private DefaultTableModel tabelmodel;
    private boolean updSQLFlag = false;
    private int baris;
    ResultSet rs;
    factoryDAO facDAO = new factoryDAO();
    interfacemenu inmenu = facDAO.getMenuDAO();

    public ViewMenu() {

        initComponents();
        koneksidb konek = new koneksidb();
        tabele = new String[]{"Id Menu", "Nama Menu", "Harga"};
        tabelmodel = new DefaultTableModel(null, tabele);
        TDaftar.setModel(tabelmodel);
        TID.setEnabled(false);
        tampilmenu();
        no();
        
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
    }

    public void no() {

        try {

            koneksidb konek = new koneksidb();
            PreparedStatement pst = konek.getCon().prepareStatement(
                    "select Id_Menu as nt  from menu order by Id_Menu DESC limit 1");
            rs = pst.executeQuery();
            if (rs.next()) {
                int dmenu = Integer.parseInt(rs.getString("nt")) + 1;
                TID.setText(Integer.toString(dmenu));
            } else {
                int dmenu = 1;
                TID.setText(Integer.toString(dmenu));
            }
            rs.close();
        } catch (Exception e) {
        }
        TNMenu.requestFocusInWindow();
    }

    private void tampilmenu() {
        listmenu = inmenu.tampilmenu();
        tabelmodel = (DefaultTableModel) TDaftar.getModel();
        tabelmodel.setRowCount(0);

        for (menu dmenu : listmenu) {
            tabelmodel.addRow(new Object[]{dmenu.getIdmenu(), dmenu.getNamamenu(), dmenu.getHarga()});

        }
        int ambilbaris = TDaftar.getRowCount();
        if (ambilbaris > 0) {
            TDaftar.addRowSelectionInterval(0, 0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TID = new javax.swing.JTextField();
        TNMenu = new javax.swing.JTextField();
        THarga = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TDaftar = new javax.swing.JTable();
        BBatal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");

        jPanel1.setBackground(new java.awt.Color(195, 232, 251));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));

        jLabel2.setText("No");

        jLabel3.setText("Nama Menu");

        jLabel4.setText("Harga");

        TID.setBackground(new java.awt.Color(239, 253, 253));
        TID.setForeground(new java.awt.Color(239, 253, 253));
        TID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TID.setEnabled(false);

        TNMenu.setEnabled(false);
        TNMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TNMenuKeyPressed(evt);
            }
        });

        THarga.setEnabled(false);
        THarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                THargaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TNMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THarga, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TNMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(THarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BSimpan.setText("Simpan");
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });

        BEdit.setText("Edit");
        BEdit.setEnabled(false);
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        BHapus.setText("Hapus");
        BHapus.setEnabled(false);
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });

        TDaftar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No ", "Nama", "Harga"
            }
        ));
        TDaftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDaftarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TDaftar);

        BBatal.setText("Batal");
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAFTAR MENU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBatal)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BSimpan)
                    .addComponent(BEdit)
                    .addComponent(BHapus)
                    .addComponent(BBatal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    protected void aktif() {

        TNMenu.setEnabled(true);
        THarga.setEnabled(true);
    }

    protected void pasif() {

        TNMenu.setEnabled(false);
        THarga.setEnabled(false);
    }

    protected void bersih() {

        TNMenu.setText(null);
        THarga.setText(null);
    }


    private void TNMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNMenuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            THarga.requestFocusInWindow();
        }
    }//GEN-LAST:event_TNMenuKeyPressed

    private void THargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_THargaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            BSimpan.requestFocusInWindow();

        }
    }//GEN-LAST:event_THargaKeyPressed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed

        aktif();
        bersih();
        BSimpan.setEnabled(true);
        TNMenu.requestFocusInWindow();
        no();
    }//GEN-LAST:event_BTambahActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed

        menu me = new menu();
        int idMenu = Integer.parseInt(TID.getText());
        String namaMenu = TNMenu.getText();
        String hargaMenu = THarga.getText();
        me.setNamamenu(namaMenu);
        me.setHarga(hargaMenu);
        me.setIdmenu(idMenu);
        if (updSQLFlag == false) {
            if (namaMenu.equals("") && hargaMenu.equals("")) {
                JOptionPane.showMessageDialog(null, 
                        "Nama Menu Dan Harga Harus Diisi  !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                TNMenu.grabFocus();
            } else {
                inmenu.simpan(me);
            }
            tampilmenu();
        }
        bersih();
        pasif();
        BSimpan.setEnabled(false);
    }//GEN-LAST:event_BSimpanActionPerformed

    final public void tampiltext() {
        baris = TDaftar.getSelectedRow();
        if (baris >= 0) {
            TID.setText(tabelmodel.getValueAt(baris, 0).toString());
            TNMenu.setText(tabelmodel.getValueAt(baris, 1).toString());
            THarga.setText(tabelmodel.getValueAt(baris, 2).toString());
        }
    }
    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
        menu me = new menu();
        int idMenu = Integer.parseInt(TID.getText());
        String namaMenu = TNMenu.getText();
        String hargaMenu = THarga.getText();
        me.setNamamenu(namaMenu);
        me.setHarga(hargaMenu);
        me.setIdmenu(idMenu);
        if (TNMenu.isEnabled()) {
            if (updSQLFlag == false) {
                if (namaMenu.equals("") && hargaMenu.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nama Menu Dan Harga Harus Diisi  !", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    TNMenu.grabFocus();
                } else {
                    inmenu.edit(me);
                }
                tampilmenu();
                BEdit.setEnabled(false);
                pasif();
                bersih();
            }
        } else {
            aktif();
        }
        BSimpan.setEnabled(false);
        BHapus.setEnabled(false);
    }//GEN-LAST:event_BEditActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
     
        menu me = new menu();
        int idm = Integer.parseInt(TID.getText());
        me.setIdmenu(idm);
        if (TDaftar.getRowCount() >= 0) {
            int reply = JOptionPane.showConfirmDialog(null, "Apakah Anda Akan Menghapus Data ini ",
                    "konfirmasi", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                inmenu.hapus(me);
                int baris = TDaftar.getRowCount();
                if (baris > 0) {
                    tabelmodel.removeRow(TDaftar.getSelectedRow());
                }
                int row = TDaftar.getRowCount();
                if (row == 0) {

                }
            }
        }
        bersih();
        BEdit.setEnabled(false);
        BHapus.setEnabled(false);
    }//GEN-LAST:event_BHapusActionPerformed

    private void TDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDaftarMouseClicked
        // TODO add your handling code here:
        tampiltext();
        BEdit.setEnabled(true);
        BHapus.setEnabled(true);
        BSimpan.setEnabled(false);
    }//GEN-LAST:event_TDaftarMouseClicked

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
        pasif();
        bersih();
        BSimpan.setEnabled(false);
        BEdit.setEnabled(false);
        BHapus.setEnabled(false);
    }//GEN-LAST:event_BBatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JTable TDaftar;
    private javax.swing.JTextField THarga;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField TNMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
