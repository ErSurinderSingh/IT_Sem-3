
package AWT_SWINGS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class Frame1 extends Frame implements ActionListener{
    Frame1(){
        //creating a button
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300); 
        setLayout(null);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
       new Frame1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int count = 0;
        if(e.getSource() == "Click me")
            count++;
        JOptionPane.showMessageDialog(this, count);
    }
}