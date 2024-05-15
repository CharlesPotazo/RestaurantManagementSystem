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
    private JLabel loginTxt, idTxt,passTxt, prompText,BackGroundImage;
    private JPanel Square;
    private EmployeeData employeeData= new EmployeeData();
    
    Login(){ //Hiniwalay po muna namin para po madali namin po maadjust
        Texts();
        TextFields();
        Buttons();
        Square();
        BackGroundImage();
        
        frame.setSize(750,535);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);   
    }
    
     private void Texts(){
        loginTxt = new JLabel("LOGIN"); //Login Text
        loginTxt.setBounds(350, 23 , 300, 250); 
        loginTxt.setForeground(new Color(167,54,49));
        loginTxt.setFont(new Font("impact", Font.PLAIN, 25));
        frame.add(loginTxt);
    
        idTxt = new JLabel("ID:");//ID Text
        idTxt.setBounds(240, 200 , 300, 30); 
        idTxt.setForeground(Color.black);
        idTxt.setFont(new Font("impact", Font.PLAIN, 20));
        frame.add(idTxt);

        passTxt = new JLabel("Password:");//Password Text
        passTxt.setBounds(240, 250 , 300, 30); 
        passTxt.setForeground(Color.black);
        passTxt.setFont(new Font("impact", Font.PLAIN, 20));
        frame.add(passTxt);
    
        prompText = new JLabel();//Prompt Text
        prompText.setBounds(300, 173 , 300, 250); 
        prompText.setForeground(Color.black);
        prompText.setFont(new Font("impact", Font.PLAIN, 20));
        frame.add(prompText);
    }
    
    private void TextFields(){
        empIDTxtFld = new JTextField("Enter_Employee_ID_Here"); //Employee TextField
        empIDTxtFld.setBounds(340, 200, 150, 30);
        empIDTxtFld.setBackground(new Color(167,54,49));
        empIDTxtFld.setBorder(null);
        empIDTxtFld.setForeground(Color.white);
        frame.add(empIDTxtFld);
    
        passTxtFld = new JPasswordField();//Password TextField
        passTxtFld.setBounds(340, 250, 150, 30);
        passTxtFld.setBackground(new Color(167,54,49));
        passTxtFld.setBorder(null);
        passTxtFld.setForeground(Color.white);
        frame.add(passTxtFld);
    }
     
    private void Buttons(){
        ButtonGroup group = new ButtonGroup();   
    
        cashierbtn = new JRadioButton("Cashier");//Cashier Button
        cashierbtn.setBounds(280, 170, 100, 20);
        cashierbtn.setBackground(new Color(255,255,255)); 
        cashierbtn.setBorder(null); 
        cashierbtn.addActionListener(this);
        group.add(cashierbtn);
        frame.add(cashierbtn);

        managerbtn = new JRadioButton("Manager");//Manager Button
        managerbtn.setBounds(380, 170, 100, 20); 
        managerbtn.setBackground(new Color(255,255,255));
        managerbtn.setBorder(null); 
        managerbtn.addActionListener(this);
        group.add(managerbtn);
        frame.add(managerbtn);

        signinButton = new JButton("SIGNIN");//Sigin Button
        signinButton.setForeground(Color.white);
        signinButton.setBounds(330,320,80,18);
        signinButton.setBackground(new Color(167,54,49));
        signinButton.setBorder(null);
        signinButton.addActionListener(this);
        signinButton.setFont(new Font("impact", Font.PLAIN, 15));
        frame.add(signinButton); 
    }
    
    private void Square(){
        Square = new JPanel(); //White square panel
        Square.setBounds(225, 125 , 300, 250);
        Square.setBackground(Color.WHITE);
        Square.setVisible(true);
        frame.add(Square);   
    }    
    
    private void BackGroundImage(){
        BackGroundImage = new JLabel(); //Background
        ImageIcon backgroundPic = new ImageIcon("Images/Background1.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(750,500);
        frame.add(BackGroundImage);
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
            int id = Integer.parseInt(empIDTxtFld.getText());
            String passwordText = passTxtFld.getText();
            boolean verifiedCashier = employeeData.VerifyCashierEmployee(id, passwordText), verifiedManager = employeeData.VerifyManagerEmployee(id, passwordText);
            
            if (cashierbtn.isSelected() && e.getSource() == signinButton) {
                try {
                    if (verifiedCashier) {
                        CashierMenu cashierMenu = new CashierMenu();
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
            else if(managerbtn.isSelected() &&  e.getSource() == signinButton) {
                try {
                    if (verifiedManager) {
                        ManagerMenu managerMenu = new ManagerMenu();
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