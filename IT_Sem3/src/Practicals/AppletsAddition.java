package Practicals;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class AppletsAddition extends JApplet {

    public void paint(Graphics g) {        
        
    }
    public void init(){
        add(new UserControls());
    }

}

class UserControls extends JFrame implements ActionListener{

    JLabel l1, l2;
    JTextField txt_num1, txt_num2;
    JButton btn_Add;

    public UserControls(){
        l1 = new JLabel("Enter First Number: ");
        l1.setBounds(20, 50, 150, 100);
        add(l1);
        
        txt_num1 = new JTextField();
        txt_num1.setBounds(200, 90, 120, 30);
        add(txt_num1);
        
        l2 = new JLabel("Enter Second Number: ");
        l2.setBounds(20, 110, 150, 100);
        add(l2);
            
        txt_num2 = new JTextField();
        txt_num2.setBounds(200, 150, 120, 30);
        add(txt_num2);
        
        btn_Add = new JButton("ADD");
        btn_Add.addActionListener(this);
        btn_Add.setBounds(200, 210, 120, 50);
        add(btn_Add);
        
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        int num1 = Integer.parseInt(txt_num1.getText());
        int num2 = Integer.parseInt(txt_num2.getText());
        int k = num1 + num2;
        JOptionPane.showMessageDialog(this, k, "Arithmetic Operations:", JOptionPane.INFORMATION_MESSAGE);    }
    
    
   
}


/*<applet code="AppletsAddition.class" width="300" height="300">  
</applet>  */
