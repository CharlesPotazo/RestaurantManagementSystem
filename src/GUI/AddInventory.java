package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInventory implements ActionListener{
    
    private JFrame frameadds = new JFrame();
    private JTextField prodTF, quanTF;
    private JPanel upadd, midadd, lineadd ;
    private JButton rtnmmbtnADD, addbtnINV;
    private JLabel logoaddLBL, invaddLBL, prodLBL, quanLBL, bckgrndadd;
    
    AddInventory(){
        prodTxtFld();
        quanTxtFld();
        rtnmmbtnADD();
        addsbtnADD();
        logolblADD();
        invlblADD();
        prodLBLADD();
        quanLBLADD();
        lineADD();
        upsquaADD();
        midsquaADD();
        
        bckgrndadd = new JLabel();
        
        ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        bckgrndadd.setIcon(backgroundPic);
        bckgrndadd.setSize(900, 600);
        frameadds.add(bckgrndadd);
        
        frameadds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameadds.setSize(900,600);
        frameadds.setLayout(null);
        frameadds.setTitle("Add in Inventory");
        frameadds.setLocationRelativeTo(null);
        frameadds.setVisible(true);
        
    }
    
    public void prodTxtFld(){
        prodTF = new JTextField("Add Product");
        prodTF.setBounds(240, 260, 155, 35);
        prodTF.setBackground(new Color(167,54,49));
        prodTF.setBorder(null);
        prodTF.setForeground(Color.white);
        
        frameadds.add(prodTF);
    }
    
    public void quanTxtFld(){
        quanTF = new JTextField("Add Quantity");
        quanTF.setBounds(500, 260, 155, 35);
        quanTF.setBackground(new Color(167,54,49));
        quanTF.setBorder(null);
        quanTF.setForeground(Color.white);
        
        frameadds.add(quanTF);
    }
   
    public void addsbtnADD(){
        addbtnINV = new JButton("ADD");
        addbtnINV.setBounds(570, 400, 100, 50);
        addbtnINV.setBackground(new Color(176,54,49));
        addbtnINV.setBorderPainted(false);
        addbtnINV.setForeground(new Color(255,255,255));
        addbtnINV.setFont(new Font("impact", Font.PLAIN, 20));
        
        frameadds.add(addbtnINV);
    }
    
    public void rtnmmbtnADD(){
        rtnmmbtnADD = new JButton("RETURN TO INVENTORY");
        rtnmmbtnADD.setBounds(330, 1, 380, 60);
        rtnmmbtnADD.setBackground(Color.WHITE);
        rtnmmbtnADD.setBorderPainted(false);
        rtnmmbtnADD.setForeground(new Color(176,54,49));
        rtnmmbtnADD.setFont(new Font("impact", Font.PLAIN, 30));
        frameadds.add(rtnmmbtnADD);
        
        rtnmmbtnADD.addActionListener(this);
    }
    
    public void upsquaADD(){
        upadd = new JPanel();
        upadd.setBounds(0, 0, 900, 65);
        upadd.setBackground(Color.white);
    
        frameadds.add(upadd);
    }
    
    public void midsquaADD(){
        midadd = new JPanel();
        midadd.setBounds(120, 100, 650, 420);
        midadd.setBackground(Color.white);
        
        frameadds.add(midadd);
    }
    
    public void lineADD(){
        lineadd = new JPanel();
        lineadd.setBounds(150, 0, 5, 65);
        lineadd.setBackground(Color.black);
        
        frameadds.add(lineadd);
    }
     
    public void logolblADD(){
        logoaddLBL = new JLabel("J&J Resto");
        logoaddLBL.setBounds(20, 2, 150, 55);
        logoaddLBL.setForeground(new Color(167,54,49));
        logoaddLBL.setFont(new Font("impact", Font.PLAIN, 30));
        frameadds.add(logoaddLBL);
    }
    
    public void invlblADD(){
        invaddLBL = new JLabel("INVENTORY");
        invaddLBL.setBounds(175, 2, 150, 55);
        invaddLBL.setForeground(new Color(167,54,49));
        invaddLBL.setFont(new Font("impact", Font.PLAIN, 32));
        frameadds.add(invaddLBL);
    }
    
    public void prodLBLADD(){
        prodLBL = new JLabel("Product");
        prodLBL.setBounds(260, 170, 150, 50);
        prodLBL.setFont(new Font("League Spartan", Font.BOLD, 28));
        
        frameadds.add(prodLBL);
    }
    
    public void quanLBLADD(){
        quanLBL = new JLabel("Quantity");
        quanLBL.setBounds(525, 170, 150, 50);
        quanLBL.setFont(new Font("League Spartan", Font.BOLD, 28));
        
        frameadds.add(quanLBL);
    }
            
    @Override
    public void actionPerformed(ActionEvent e){
        InventoryMenu backtoinv = new InventoryMenu();
    }
    
}