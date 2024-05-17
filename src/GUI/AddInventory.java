package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddInventory implements ActionListener{
    private JFrame frame = new JFrame();
    private JTextField prodTF, quanTF;
    private JPanel divider2,divider, whiteRectangle,midSquare,  prodSquare, quanSquare ;
    private JButton rtnmmbtnADD, addbtn;
    private JLabel invaddLBL, prodLBL, quanLBL, logo;
    
    AddInventory(){ //Hiniwalay po muna namin para po madali namin po maadjust
        Texts();
        TextFields();
        Buttons();
        Panels();
        Background();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
        frame.setLayout(null);
        frame.setTitle("Add in Inventory");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void Texts(){//All text 
        logo = new JLabel("J&J Resto");
        logo.setBounds(20, 20, 150, 55);
        logo.setForeground(new Color(167,54,49));
        logo.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(logo);
        
        quanLBL = new JLabel("Quantity");
        quanLBL.setBounds(525, 150, 150, 50);
        quanLBL.setForeground(Color.WHITE);
        quanLBL.setFont(new Font("League Spartan", Font.BOLD, 28));
        frame.add(quanLBL);
        
        invaddLBL = new JLabel("INVENTORY");
        invaddLBL.setBounds(175, 2, 150, 55);
        invaddLBL.setForeground(new Color(167,54,49));
        invaddLBL.setFont(new Font("impact", Font.PLAIN, 32));
        frame.add(invaddLBL);
        
        prodLBL = new JLabel("Product");
        prodLBL.setBounds(260, 150, 150, 50);
        prodLBL.setForeground(Color.WHITE);
        prodLBL.setFont(new Font("League Spartan", Font.BOLD, 28));
        frame.add(prodLBL);
    }
    
    private void TextFields(){//All text fields
        prodTF = new JTextField("Add Product");
        prodTF.setBounds(240, 260, 155, 35);
        prodTF.setBackground(new Color(167,54,49));
        prodTF.setBorder(null);
        prodTF.setForeground(Color.white);
        frame.add(prodTF);
        
        quanTF = new JTextField("Add Quantity");
        quanTF.setBounds(500, 260, 155, 35);
        quanTF.setBackground(new Color(167,54,49));
        quanTF.setBorder(null);
        quanTF.setForeground(Color.white);
        frame.add(quanTF);
    }
    
    private void Buttons(){//All Buttons
        rtnmmbtnADD = new JButton("RETURN TO INVENTORY");
        rtnmmbtnADD.setBounds(330, 3, 380, 60);
        rtnmmbtnADD.setBackground(Color.WHITE);
        rtnmmbtnADD.setBorderPainted(false);
        rtnmmbtnADD.setForeground(new Color(176,54,49));
        rtnmmbtnADD.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(rtnmmbtnADD);
        
        rtnmmbtnADD.addActionListener(this);
        addbtn = new JButton("ADD");
        addbtn.setBounds(570, 400, 100, 50);
        addbtn.setBackground(new Color(176,54,49));
        addbtn.setBorderPainted(false);
        addbtn.setForeground(new Color(255,255,255));
        addbtn.setFont(new Font("impact", Font.PLAIN, 20));
        frame.add(addbtn);
    }
    
    private void Panels(){//All Panels
        prodSquare = new JPanel();
        prodSquare.setBounds(242, 145, 150, 70);
        prodSquare.setBackground(new Color(176,54,49));
        frame.add(prodSquare);
        
        quanSquare = new JPanel();
        quanSquare.setBounds(510, 145, 150, 70);
        quanSquare.setBackground(new Color(176,54,49));
        
        frame.add(quanSquare);
        
        divider2 = new JPanel();//red divider on the top
        divider2.setBounds(0, 0, 900, 2);
        divider2.setBackground(new Color(167,54,49));
        frame.add(divider2);

        divider = new JPanel();//black divider on the top
        divider.setBounds(150, 0, 5, 100);
        divider.setBackground(Color.black);
        frame.add(divider);

        whiteRectangle = new JPanel();//white rectangle on the top
        whiteRectangle.setBounds(0, 0, 900, 100);
        whiteRectangle.setBackground(Color.white);
        frame.add(whiteRectangle);
        
        midSquare = new JPanel();//white square on the middle
        midSquare.setBounds(120, 120, 650, 420);
        midSquare.setBackground(Color.white);
        frame.add(midSquare);
    }
    
    private void Background(){
        JLabel BackGroundImage = new JLabel();
        ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(900,620);
        frame.add(BackGroundImage);
    }
   
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== rtnmmbtnADD){
            InventoryMenu backtoinv = new InventoryMenu();
            frame.dispose();
        }
        else if(e.getSource()== addbtn){
            //finifigure out pa po
        }
    }
    
}