
package pizzasystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class orderInput {
    
    JFrame frame;
    JLabel label1,label3,label4,label5;
    JTextField tf1,tf2,tf3,tf4;
    JButton button1, button2;
    
    orderInput()
    {
        frame=new JFrame();
        frame.setTitle("Pizza Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocation(250, 100);
        
        label1 = new JLabel();
        label1.setText("Order details");
        label1.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        label1.setBounds(50, 10, 1000, 50);
        label1.setForeground(Color.black);
        
        label3 = new JLabel();
        label3.setText("Order datum ");
        label3.setFont(new Font("Times New Roman",Font.BOLD,12));
        label3.setBounds(40,120, 100, 50);
        label3.setForeground(Color.black);
        
        label4 = new JLabel();
        label4.setText("Order tijd ");
        label4.setFont(new Font("Times New Roman",Font.BOLD,12));
        label4.setBounds(40,160, 100, 50);
        label4.setForeground(Color.black);
        
        label5 = new JLabel();
        label5.setText("Betaallwijze ");
        label5.setFont(new Font("Times New Roman",Font.BOLD,12));
        label5.setBounds(40,200, 200, 50);
        label5.setForeground(Color.black);
                
        tf2=new JTextField();
        tf2.setBounds(175,130,200,30);
        tf2.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        tf3=new JTextField();
        tf3.setBounds(175,170,200,30);
        tf3.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        tf4=new JTextField();
        tf4.setBounds(175,210,200,30);
        tf4.setFont(new Font("Serif",Font.LAYOUT_LEFT_TO_RIGHT,18));
        
        button1=new JButton("Invoeren");
        button1.setBounds(230,300, 150, 40);
        button1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        
        button2=new JButton("Terug");
        button2.setBounds(40,300, 150, 40);
        button2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        
        
        frame.add(label1);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);
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
            
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/pizzaordering","root","");
            String sql = "INSERT INTO order (orderid , orderdate, ordertime , orderpaymenttype ) VALUES (NULL, ?, ?, ?);";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tf2.getText());
            pst.setString(2, tf3.getText());
            pst.setString(3, tf4.getText());
            pst.execute();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Succesvol ingevoerd!");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        }
        
        
        if(ac.getSource()==button2)
        {

            frontPage2 e = new frontPage2();
            frame.dispose();
        }
        
        
    }
    }
    
}
