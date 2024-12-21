/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubespbo_s1si07d_kel3;

import javax.swing.SwingUtilities;
public class TubesPBO_S1SI07D_Kel3 {
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable () {
            @Override
            public void run() {
                 new LoginFromGUI().setVisible(true);  
        }
        });
    }
}  

