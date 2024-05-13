package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ReportMenu implements ActionListener {
    
    private JFrame frame = new JFrame ();
    private JLabel BG;
    private JPanel square4;
    private JButton returnToMainMenu,sales,waste;
    
    ReportMenu() {
        
        square4();
        returnToMainMenu();
        sales();
        waste();
        repolabel();
        reportslabel();
        labelreport();
        displaylabel();
        emplolabel();
        divider1();
        longrectangle(); 
        divider();  
        middlerectangle();
        
        
        background ();

        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);        

    }
    
    public void background (){
        JLabel BackGroundImage = new JLabel();
    ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(900,620);
        frame.add(BackGroundImage);
        
    }
    
    private void square4(){
    square4 = new JPanel();
    square4.setBounds(0, 0, 900, 2);
    square4.setBackground(new Color(167,54,49));
    frame.add(square4);
    }

    public void returnToMainMenu() {
        returnToMainMenu = new JButton();
        returnToMainMenu.setBounds(280,40, 170, 30);
        returnToMainMenu.setBackground(Color.WHITE);
        returnToMainMenu.setBorderPainted(false);
        returnToMainMenu.setText("Return to the Main Menu");
        returnToMainMenu.setForeground(Color.RED);
        returnToMainMenu.setFont(new Font("Impact", Font.PLAIN, 12));
        returnToMainMenu.addActionListener(this);
        frame.add(returnToMainMenu);
    }

    public void sales() {
        sales = new JButton();
        sales.setBounds(50, 250, 100, 50);
        sales.setBackground(Color.WHITE);
        sales.setBorderPainted(true);
        sales.setText("Sales");
        sales.setForeground(Color.RED);
        sales.setFont(new Font("Impact", Font.PLAIN, 15));
        sales.addActionListener(this);
        frame.add(sales);
    }

    public void waste() {
        waste = new JButton();
        waste.setBounds(50, 350, 100, 50);
        waste.setBackground(Color.WHITE);
        waste.setBorderPainted(true);
        waste.setText("Waste");
        waste.setForeground(Color.RED);
        waste.setFont(new Font("Impact", Font.PLAIN, 15));
        waste.addActionListener(this);
        frame.add(waste);
    }

    public void longrectangle() {
        JPanel longrectangle = new JPanel();
        longrectangle.setBounds(0, 0, 900, 100);
        longrectangle.setBackground(Color.WHITE);
        longrectangle.setVisible(true);
        frame.add(longrectangle);
    }
    
    public void middlerectangle() {
        JPanel middlerectangle = new JPanel();
        middlerectangle.setBounds(30, 140, 800, 380);
        middlerectangle.setBackground(Color.WHITE);
        middlerectangle.setVisible(true);
        frame.add(middlerectangle);
    }
    
    public void divider() {
        JPanel divider = new JPanel();
        divider.setBounds(180, 140, 20, 380);
        divider.setBackground(new Color(167, 54, 49));
        divider.setVisible(true);
        frame.add(divider);
    }

    public void divider1() {
        JPanel divider1 = new JPanel();
        divider1.setBounds(120, 0, 10, 100);
        divider1.setBackground(Color.BLACK);
        divider1.setVisible(true);
        frame.add(divider1);
    }
    public void repolabel() {
        JLabel repolabel = new JLabel();
        repolabel.setText("REPORTS"); 
        repolabel.setBounds(480, 110, 300, 100);
        repolabel.setFont(new Font("Impact", Font.PLAIN, 24));
        repolabel.setVisible(true);
        frame.add(repolabel);
    }

    public void reportslabel() {
        JLabel reportslabel = new JLabel();
        reportslabel.setText("REPORTS"); 
        reportslabel.setBounds(150, 20, 300, 50);
        reportslabel.setFont(new Font("Impact", Font.PLAIN, 35));
        reportslabel.setForeground(new Color(167, 54, 49));
        reportslabel.setVisible(true);
        frame.add(reportslabel);
        }


    public void displaylabel() {
        JLabel displaylabel = new JLabel();
        displaylabel.setText("DISPLAY:"); 
        displaylabel.setBounds(75, 140, 300, 50);
        displaylabel.setFont(new Font("Impact", Font.PLAIN, 20));
        displaylabel.setVisible(true);
        frame.add(displaylabel);
    }

    public void labelreport() {
        JLabel labelreport = new JLabel();
        labelreport.setText("HERE ARE THE REPORTS:"); 
        labelreport.setBounds(220, 180, 300, 50);
        labelreport.setFont(new Font("Impact", Font.PLAIN, 20));
        labelreport.setVisible(true);
        frame.add(labelreport);
    }

    public void emplolabel() {
        JLabel emplolabel = new JLabel();
        emplolabel.setText("Employee Name"); 
        emplolabel.setBounds(740, 25, 300, 50);
        emplolabel.setForeground(new Color(167, 54, 49));
        emplolabel.setFont(new Font("Impact", Font.PLAIN, 20));
        emplolabel.setVisible(true);
        frame.add(emplolabel);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==returnToMainMenu){
            ManagerMenu mm = new ManagerMenu();
        }
    }
    
    
}