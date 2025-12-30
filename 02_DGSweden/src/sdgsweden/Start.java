/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author winte
 */
public class Start {
    
    private InfDB idb;
    
    public Start(){
    }
    
    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(() -> new HuvudFonster().setVisible(true)); 
    }
}
