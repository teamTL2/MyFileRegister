
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STRATOS
 */
public class ExceptionMessage {
    
    
    public void ERRORMessage(){
        JFrame window = new JFrame("ERROR Message");
        int response1;
        response1 = JOptionPane.showConfirmDialog(null, "Dothikan mi egira dedomena", "ERROR Message", 
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);        
    }
    public void INFORMATIONMessage(){
        JFrame window = new JFrame("INFORMATION Message");
        int response1;
        response1 = JOptionPane.showConfirmDialog(null, "Molis kanate Login", "INFORMATION Message", 
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
}
