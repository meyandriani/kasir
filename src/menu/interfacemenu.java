/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.List;


/**
 *
 * @author USER
 */
public interface interfacemenu {

    List<menu> tampilmenu();
    void simpan(menu mn);
    void edit (menu mn);
    void hapus (menu mn);
}
