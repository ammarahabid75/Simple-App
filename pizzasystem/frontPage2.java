package pizzasystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class frontPage2 {
    
    JFrame frame;
    JLabel label1;
    JButton button1, button2, button3, button4, button5, button6;
    
    frontPage2()
    {
        frame=new JFrame();
        frame.setTitle("Pizza Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 450);
        frame.setLocation(250, 100);
        
        label1 = new JLabel();
        label1.setText("Werknemer Menu");
        label1.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        label1.setBounds(70, 10, 1000, 50);
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
        
        button4=new JButton("Product");
        button4.setBounds(80,200, 250, 40);
        button4.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button4.setForeground(Color.white);
        button4.setBackground(Color.black);
        
        button5=new JButton("Order");
        button5.setBounds(80,250, 250, 40);
        button5.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button5.setForeground(Color.white);
        button5.setBackground(Color.black);
        
        button6=new JButton("Terug naar Main");
        button6.setBounds(80,300, 250, 40);
        button6.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button6.setForeground(Color.white);
        button6.setBackground(Color.black);
        
        frame.add(label1);
        frame.add(button1);
        frame.add(button2);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        
        button1.addActionListener(new action());
        button2.addActionListener(new action());
        button4.addActionListener(new action());
        button5.addActionListener(new action());
        button6.addActionListener(new action());
        
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
    
    public class action implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ac) {
        
        if(ac.getSource()==button1)
        {
            customerInput c = new customerInput();
            frame.dispose();
        }
        if(ac.getSource()==button2)
        {
            employeeInput e = new employeeInput();
            frame.dispose();
        }

        if(ac.getSource()==button4)
        {
            productInput p = new productInput();
            frame.dispose();
        }
        if(ac.getSource()==button5)
        {
            orderInput p = new orderInput();
            frame.dispose();
            
        }
        
        if(ac.getSource()==button6)
        {
             frontPage e = new frontPage();
            frame.dispose();
        }
    }
    }
    
}
