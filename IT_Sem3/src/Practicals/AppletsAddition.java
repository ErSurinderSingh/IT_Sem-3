package Practicals;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class AppletsAddition extends JApplet implements ActionListener {
    
    JLabel l1, l2;
    JTextField txt_num1, txt_num2,txt_res;
    JButton btn_Add;

    public void paint(Graphics g) {        
        g.drawString("Enter First Number: ",  80, 100);
        g.drawString("Enter Second Number: ", 80, 150);
        g.drawString("Result: ", 150, 200);
    }
    public void init(){
               
        txt_num1 = new JTextField();
        txt_num1.setBounds(200, 90, 120, 30);
        add(txt_num1);
                 
        txt_num2 = new JTextField();
        txt_num2.setBounds(200, 150, 120, 30);
        add(txt_num2);
        
        txt_res = new JTextField();
        txt_res.setBounds(200, 210, 120, 30);
        txt_res.setEditable(false);
        add(txt_res);
        
        btn_Add = new JButton("ADD");
        add(btn_Add);
        btn_Add.addActionListener((ActionListener) this);
        btn_Add.setBounds(200, 270, 120, 50);
       
        setVisible(true);
        setSize(500,500);
        setLayout(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        int num1 = Integer.parseInt(txt_num1.getText());
        int num2 = Integer.parseInt(txt_num2.getText());
        Integer k = num1 + num2;
        txt_res.setText(k.toString());
        JOptionPane.showMessageDialog(this, k, "Arithmetic Operations:", JOptionPane.INFORMATION_MESSAGE);    }

}

/*<applet code="AppletsAddition.class" width="300" height="300">  
</applet>  */
