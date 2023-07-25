/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2_2101092058;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import zaki.dao.Koneksi;


/**
 *
 * @author ASUS
 */
public class PBO2_2101092058 {
    public static void main(String[]args) {
        try {
            koneksi koneksi = new koneksi();
            Connection con = koneksi.getKoneksi();
            JOptionPane.showMessageDialog(null, "Koneksi Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error :" + ex.getMessage());
            Logger.getLogger(PBO2_2101092058.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static class koneksi {

        public koneksi() {
        }

        private Connection getKoneksi() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}