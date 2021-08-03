package pizzasystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frontPage {
    
    JFrame frame;
    JLabel label1;
    JButton button1, button2;
   
    frontPage()
    {
        frame=new JFrame();
        frame.setTitle("Pizza Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 300);
        frame.setLocation(250, 100);
        
        label1 = new JLabel();
        label1.setText("MAIN MENU");
        label1.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        label1.setBounds(100, 10, 1000, 50);
        label1.setForeground(Color.black);
        
        button1=new JButton("Klant");
        button1.setBounds(80,100, 250, 40);
        button1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        
        button2=new JButton("Werknemer");
        button2.setBounds(80,150, 250, 40);
        button2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);

        button1.addActionListener(new action());
        button2.addActionListener(new action());

        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
    
    public class action implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ac) {
        
        if(ac.getSource()==button1)
        {
            new Front().setVisible(true);
            frame.dispose();
        }
        if(ac.getSource()==button2)
        {
            frontPage2 e = new frontPage2();
            frame.dispose();
        }
    }
    }
    
}
