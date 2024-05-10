package GUI;
import DataLayer.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CashierLog extends JFrame implements ActionListener{
    
    private JTextField employeeID, password;
    private JButton signinButton, returnButton;
    private JLabel prompText;
    private EmployeeData employeeData= new EmployeeData();
    
    CashierLog(){
        Textfield();
        Textfield2();
        signinButton();
        returnButton();
        PrompText();
        Square();
        Background();
        this.setVisible(true);
    }
    
    
    
    public void Background(){
        this.setTitle("Restaurant Management");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,750,500); //set the size
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(750,535);
        
        JLabel lblBG = new JLabel();
        ImageIcon backgroundPic = new ImageIcon("D:\\Users\\CJ\\Documents\\NetBeansProjects\\RestaurantManagementSystem\\src\\Images\\Background1.png");
        lblBG.setIcon(backgroundPic);
        lblBG.setSize(750,500);
        add(lblBG);
    }
    
    public void Square(){
        JPanel square = new JPanel();
    
        square.setBounds(200, 150 , 300, 250);
        square.setBackground(Color.WHITE);
        square.setVisible(true);
        
        this.setLayout(null);
        this.setSize(750,540);
        this.add(square);   
    }
    
    private void Textfield(){
          employeeID = new JTextField();
          employeeID.setBounds(300, 200, 200, 30);
          employeeID.setVisible(true);
          this.add(employeeID);
            add(employeeID);
     }
    
    private void Textfield2(){
          password = new JTextField();
          password.setBounds(300, 250, 200, 30);
          password.setVisible(true);
          this.add(password);
            add(password);
     }
    
    public void PrompText(){
        prompText = new JLabel();
        prompText.setBounds(245, 350 , 300, 250);
        prompText.setForeground(Color.black);
        prompText.setVisible(true);
        prompText.setFont(new Font("impact", Font.PLAIN, 20));
        this.add(prompText);
    }
    
    private void signinButton() {
            signinButton = new JButton();
     
        signinButton.setBounds(200,200,80,40);
        signinButton.setVisible(true);
        signinButton.setText("SIGNIN");
        signinButton.addActionListener(this);
        this.add(signinButton); 
            
        }
    
    private void returnButton() {
            returnButton = new JButton();
     
        returnButton.setBounds(150,150,80,40);
        returnButton.setVisible(true);
        returnButton.setText("return");
        returnButton.addActionListener(this);
        this.add(returnButton); 
    }
    
       

        @Override
        public void actionPerformed(ActionEvent e) {
           if (e.getSource() == signinButton) {
                try{
               int id = Integer.parseInt(employeeID.getText());
                String passwordText = password.getText(); 
                
                boolean verified = employeeData.VerifyCashierEmployee(id, passwordText); 

                    if (verified) {
                        //PUT HERE OUR MAIN MENU

                    } else {
                        prompText.setText("Either credentials is wrong or is not in our System");
                    }
                }catch(NumberFormatException ex){
                    prompText.setText("Not an EmployeeID");//IF YUNG USER INPUTED STRING INSTEAD OF INT IN EMPLOYEE ID
                }    
            }
           
           else if(e.getSource() == returnButton){
               Login log= new Login();
               this.dispose();
           }
        }

    
}
