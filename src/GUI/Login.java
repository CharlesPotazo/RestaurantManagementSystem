package GUI;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener{
    
    private JButton cashierBtn; 
    private JButton managerBtn;
    
    Login(){
        
        
        cashierButton();
        managerButton();
        Text1();
        Text2();
        Square();
        Background();
        
        setVisible(true);//visible 
     }
    
    
    
    public void Background(){
        
        this.setTitle("Restaurant Management");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,750,500); 
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(750,535);//set the size
        this.setLayout(null);
        
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
    
    public void Text1(){
        JLabel text1 = new JLabel();
    
        text1.setBounds(245, 50 , 300, 250);
        text1.setForeground(Color.black);
        text1.setVisible(true);
        text1.setText("Welcome to J&J Restaurant");
        text1.setFont(new Font("impact", Font.PLAIN, 20));
        
        this.setLayout(null);
        this.setSize(750,540);
        this.add(text1);   
    }
    
    public void Text2(){
        JLabel text2 = new JLabel();
    
        text2.setBounds(275, 70 , 300, 250);
        text2.setForeground(Color.black);
        text2.setVisible(true);
        text2.setText("Management System");
        text2.setFont(new Font("impact", Font.PLAIN, 20));
        
        this.setLayout(null);
        this.setSize(750,540);
        this.add(text2);   
    }
     

    
    private void cashierButton() {
        
        cashierBtn = new JButton();
        cashierBtn.setBounds(300,250,100,25);//(x AXIS, y aixs,width LAPD, HEIGHT TAAS)
        cashierBtn.setBackground(new Color(167,54,49));//(new Color(Search RGB fro the color you want))
        cashierBtn.setBorderPainted(false);
        cashierBtn.setText("CASHIER");
        cashierBtn.setForeground(new Color(255,255,255));
        cashierBtn.setFont(new Font("impact", Font.PLAIN, 12));
        cashierBtn.addActionListener(this);
        this.add(cashierBtn); 
    }
    
     private void managerButton(){
       managerBtn = new JButton();
        managerBtn.setBounds(300,280,100,25);//(x AXIS, y aixs,width LAPAD, HEIGHT TAAS)
        managerBtn.setBackground(new Color(167,54,49));//(new Color(Search RGB fro the color you want))
        managerBtn.setBorderPainted(false);
        managerBtn.setText ("MANAGER");
        managerBtn.setForeground(new Color(255,255,255));//KAPAG FORE COLOR SA TEXT YUN BRYLE(new Color(Search RGB fro the color you want))
        managerBtn.setFont(new Font("impact", Font.PLAIN, 12));
        managerBtn.addActionListener(this);
        this.add(managerBtn);  
    }
     
    @Override
    public void actionPerformed(ActionEvent button) {
        if(button.getSource()==cashierBtn){
        CashierLog clogin = new CashierLog();
         this.dispose();
        }
        if(button.getSource()==managerBtn){
        ManagerLog mlogin = new ManagerLog();
         this.dispose();
        }
    
    }
    
}
