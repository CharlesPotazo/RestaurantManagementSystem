package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InventoryMenu implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel divider2,divider,whiteRectangle,square1;
    private JLabel inventoryTxt, logo ;
    private JButton returnBtn, addBTNinv, dltBTN;
    private JTable tableinv;

    InventoryMenu() { //Hiniwalay po muna namin para po madali namin po maadjust
        Texts();
        Buttons();
        INVtable();
        Panels();
        Background();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setTitle("J&J's Inventory");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void Texts(){//all texts
        logo = new JLabel("J&J Resto");
        logo.setBounds(20, 20, 150, 55);
        logo.setForeground(new Color(167,54,49));
        logo.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(logo);
        
        inventoryTxt = new JLabel("INVENTORY");
        inventoryTxt.setBounds(160, 20, 150, 55);
        inventoryTxt.setForeground(new Color(167,54,49));
        inventoryTxt.setFont(new Font("impact", Font.PLAIN, 32));
        frame.add(inventoryTxt);
    }
    
    private void Buttons(){// all buttons
        addBTNinv = new JButton("ADD");
        addBTNinv.setBounds(310, 400, 110, 60);
        addBTNinv.setBackground(new Color(176,54,49));
        addBTNinv.setBorderPainted(false);
        addBTNinv.setForeground(new Color(255,255,255));
        addBTNinv.setFont(new Font("impact", Font.PLAIN, 24));
        addBTNinv.addActionListener(this);
        frame.add(addBTNinv);
        
        dltBTN = new JButton("DELETE");
        dltBTN.setBounds(500, 400, 110, 60);
        dltBTN.setBackground(new Color(176,54,49));
        dltBTN.setBorderPainted(false);
        dltBTN.setForeground(new Color(255,255,255));
        dltBTN.setFont(new Font("impact", Font.PLAIN, 24));
        frame.add(dltBTN);
        
        
        returnBtn = new JButton("Return to the Main Menu");//Return to menu button
        returnBtn.setBounds(300,40, 170, 30);
        returnBtn.setBackground(Color.WHITE);
        returnBtn.setBorderPainted(false);
        returnBtn.setForeground(new Color(167, 54, 49));
        returnBtn.setFont(new Font("Impact", Font.PLAIN, 12));
        returnBtn.addActionListener(this);
        frame.add(returnBtn);
        
    }
    
    private void Panels(){
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
        
        square1 = new JPanel();//square in the middle
        square1.setBounds(120, 120, 650, 420);
        square1.setBackground(Color.white);
        frame.add(square1);
    }
    
    private void Background(){
        JLabel BackGroundImage = new JLabel();
        ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(900,620);
        frame.add(BackGroundImage);
    }
    
    public void INVtable() {
        String[] columnNameinv = {"Product", "Quantity"};
        Object data[][]
                = {
                    {"Chicken Breast", "10pcs."},
                    {"Porkchops", "13pcs."},
                    {"Soda", "30pcs."},
                    {"Electric Fan", "4pcs."},
                    {"Rice Cooker", "2pcs."},
                    {"Piyesa", "5pcs."}
                };
        JTable tableinv = new JTable(data, columnNameinv);
        tableinv.getTableHeader().setBackground(new Color(176,54,49));
        tableinv.getTableHeader().setForeground(new Color(255,255,255));
        tableinv.getTableHeader().setFont(new Font("impact", Font.PLAIN, 20));

        JScrollPane scp = new JScrollPane(tableinv);
        scp.setBounds(205, 140, 500, 250);
        tableinv.setEnabled(false);
        
        frame.add(scp);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == returnBtn){
            ManagerMenu managerMenu = new ManagerMenu();
            frame.dispose();
        }
        else if (e.getSource() == addBTNinv){
            AddInventory addInventory = new AddInventory();
            frame.dispose();
        }
        else if (e.getSource() == dltBTN){
            //finifigure out pa po
        }
    }
    
}

