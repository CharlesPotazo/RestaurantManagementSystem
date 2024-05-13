
package GUI;

import DataLayer.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login implements ActionListener{
  
    private JFrame frame = new JFrame();
    private JTextField empIDTxtFld;
    private JPasswordField passTxtFld;
    private JRadioButton cashierbtn,managerbtn;
    private JButton signinButton;
    private JLabel text1, text2,text3, prompText,BackGroundImage;
    private JPanel Square;
    private EmployeeData employeeData= new EmployeeData();
    
    Login(){
        buttonGroup();
        text1();
        text2();
        text3();
        empIDTxtFld();
        passTxtFld();
        prompText();
        signButton();
        Square();
        BackGroundImage();
        
        
        frame.setSize(750,535);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);   
    
    }
    
    private void buttonGroup(){
    cashierbtn = new JRadioButton("Cashier");
    managerbtn = new JRadioButton("Manager");

    ButtonGroup group = new ButtonGroup();
    group.add(cashierbtn);
    group.add(managerbtn);

    cashierbtn.setBounds(280, 170, 100, 20); 
    managerbtn.setBounds(380, 170, 100, 20); 
    
    cashierbtn.setBackground(new Color(255,255,255)); 
    managerbtn.setBackground(new Color(255,255,255)); 
    
    cashierbtn.setBorder(null); 
    managerbtn.setBorder(null); 
    
    cashierbtn.addActionListener(this);
    managerbtn.addActionListener(this);
    
    frame.add(cashierbtn);
    frame.add(managerbtn);
    }
    
    private void text1(){
    text1 = new JLabel("LOGIN");
    text1.setBounds(350, 23 , 300, 250); 
    text1.setForeground(new Color(167,54,49));
    text1.setFont(new Font("impact", Font.PLAIN, 25));
    frame.add(text1);
    }
    private void text2(){
    text1 = new JLabel("ID:");
    text1.setBounds(240, 200 , 300, 30); 
    text1.setForeground(Color.black);
    text1.setFont(new Font("impact", Font.PLAIN, 20));
    frame.add(text1);
    }
    
    private void text3(){
    text1 = new JLabel("Password:");
    text1.setBounds(240, 250 , 300, 30); 
    text1.setForeground(Color.black);
    text1.setFont(new Font("impact", Font.PLAIN, 20));
    frame.add(text1);
    }
    
    private void prompText(){
    prompText = new JLabel();
    prompText.setBounds(300, 173 , 300, 250); 
    prompText.setForeground(Color.black);
    prompText.setFont(new Font("impact", Font.PLAIN, 20));
    frame.add(prompText);
    }
    
    private void empIDTxtFld(){
          empIDTxtFld = new JTextField("Enter_Employee_ID_Here");
          empIDTxtFld.setBounds(340, 200, 150, 30);
          empIDTxtFld.setBackground(new Color(167,54,49));
          empIDTxtFld.setBorder(null);
          empIDTxtFld.setForeground(Color.white);
          frame.add(empIDTxtFld);
     }
    
    private void passTxtFld(){
          passTxtFld = new JPasswordField();
          passTxtFld.setBounds(340, 250, 150, 30);
          passTxtFld.setBackground(new Color(167,54,49));
          passTxtFld.setBorder(null);
          passTxtFld.setForeground(Color.white);
          frame.add(passTxtFld);
     }
    
    
    private void signButton() {
        signinButton = new JButton("SIGNIN");
        signinButton.setForeground(Color.white);
        signinButton.setBounds(330,320,80,18);
        signinButton.setBackground(new Color(167,54,49));
        signinButton.setBorder(null);
        signinButton.addActionListener(this);
        signinButton.setFont(new Font("impact", Font.PLAIN, 15));
        frame.add(signinButton); 
    }
    
    private void Square(){
        Square = new JPanel();
        
        Square.setBounds(225, 125 , 300, 250);
        Square.setBackground(Color.WHITE);
        Square.setVisible(true);
        
        frame.add(Square);   
    }    
    
    private void BackGroundImage(){
        BackGroundImage = new JLabel();
    
        ImageIcon backgroundPic = new ImageIcon("Background1.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(750,500);
        frame.add(BackGroundImage);
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
          
            if (cashierbtn.isSelected() && e.getSource() == signinButton) {
                try {
                    int id = Integer.parseInt(empIDTxtFld.getText());
                    String passwordText = passTxtFld.getText();
                    boolean verified = employeeData.VerifyCashierEmployee(id, passwordText);
                    if (verified) {
                        CashierMenu cMenu = new CashierMenu();
                        frame.dispose();
                    } 
                    else {
                    prompText.setText("Credentials Wrong");
                    }
                }
                catch (NumberFormatException ex) {
                  prompText.setText("Not an EmployeeID");
                }
            } 
            if (managerbtn.isSelected() &&  e.getSource() == signinButton) {
                try {
                    int id = Integer.parseInt(empIDTxtFld.getText());
                    String passwordText = passTxtFld.getText();
                    boolean verified = employeeData.VerifyManagerEmployee(id, passwordText);
                    if (verified) {
                        ManagerMenu mMenu = new ManagerMenu();
                        frame.dispose();
                    } 
                    else{
                        prompText.setText("Credentials Wrong");
                    }
                } 
                catch (NumberFormatException ex) {
                  prompText.setText("Not an EmployeeID");
                }
            }
        }
}