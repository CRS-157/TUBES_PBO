/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo_s1si07d_kel3;

import java.awt.Font;
import javax.swing.JLabel;

public class LoginFromGUI extends From  {
    
    public LoginFromGUI() {
        super("Login");
        addGuiComponents();
    }

    private void addGuiComponents() {
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(0,25,520,100);
        loginLabel.setForeground(CommonConstants.TEXT_COLOR); 
        loginLabel.setFont(new Font("Dialog", Font.BOLD, 40)); 
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
   
    }
    
 
