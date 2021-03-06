/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAYKISHAN SATIKUVAR
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class New_Employee extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t7,t3,t4,t5,t6;
    JButton b1,b2;
    Choice c1;
    
    public New_Employee() {
        super("New Employee");
        
        setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        
        p1.setLayout(new GridLayout(8,2,10,10));
        l1 = new JLabel("Name");
        t1 = new JTextField(14);
        
        p1.add(l1);
        p1.add(t1);
        
        l2 = new JLabel("Gender");
        c1 = new Choice();
        c1.add("Male");
        c1.add("Female");
        
        p1.add(l2);
        p1.add(c1);
        
        l3 = new JLabel("Address");
        t3 = new JTextField(14);
        
        p1.add(l3);
        p1.add(t3);
        
        l4 = new JLabel("State");
        t4 = new JTextField(14);
        
        p1.add(l4);
        p1.add(t4);
        
        l5 = new JLabel("City");
        t5 = new JTextField(14);
        
        p1.add(l5);
        p1.add(t5);
        
        l6 = new JLabel("Email");
        t6 = new JTextField(14);
        
        p1.add(l6);
        p1.add(t6);
        
        l7 = new JLabel("Phone");
        t7 = new JTextField(14);
        
        p1.add(l7);
        p1.add(t7);
        
        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");
        
        p1.add(b1);
        p1.add(b2);
        
        setLayout(new BorderLayout());
        add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/new_employee.png"))),"West"); 
        add(p1,"Center");
        
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String n = t1.getText();
        String g = c1.getSelectedItem();
        String a = t3.getText();
        String s = t4.getText();
        String c = t5.getText();
        String e = t6.getText();
        String p = t7.getText();
        String query = "insert into employee values(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";
        
        try{
            Conn connection = new Conn();
            connection.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Employee Created");
            this.setVisible(false);
        }catch(Exception exception){
            exception.printStackTrace();
        }
        
    }
    
    public static void main(String args[]){
        new New_Employee().setVisible(true);
    }
    
}
