package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InventoryMenu implements ActionListener {

    private JFrame frameinv = new JFrame();
    private JPanel PNLupinv, PNLmidinv, PNLline;
    private JLabel LBLinv, LBLlogoinv, bckgrndINV ;
    private JButton rtrnmmBTNinv, addBTNinv, dltBTNinv;
    private JTable tableinv;

    InventoryMenu() {
        addbuttoninv();
        dltbuttoninv();
        INVtable();
        logoinv();
        invtxt();
        returnbuttoninv();
        lineinv();
        upsquare();
        midsquare();
        
        bckgrndINV = new JLabel();

        frameinv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        bckgrndINV.setIcon(backgroundPic);
        bckgrndINV.setSize(900, 600);
        frameinv.add(bckgrndINV);

        frameinv.setSize(900, 600);
        frameinv.setLayout(null);
        frameinv.setTitle("J&J's Inventory");
        frameinv.setLocationRelativeTo(null);
        frameinv.setVisible(true);

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
        JScrollPane scp = new JScrollPane(tableinv);
        scp.setBounds(205, 140, 500, 220);
        frameinv.add(scp);
        
    }
    
    private void addbuttoninv(){
        addBTNinv = new JButton("ADD");
        addBTNinv.setBounds(310, 400, 110, 60);
        addBTNinv.setBackground(new Color(176,54,49));
        addBTNinv.setBorderPainted(false);
        addBTNinv.setForeground(new Color(255,255,255));
        addBTNinv.setFont(new Font("impact", Font.PLAIN, 24));
        frameinv.add(addBTNinv);
        
        addBTNinv.addActionListener(this);
    }
    
    private void dltbuttoninv(){
        dltBTNinv = new JButton("DELETE");
        dltBTNinv.setBounds(500, 400, 110, 60);
        dltBTNinv.setBackground(new Color(176,54,49));
        dltBTNinv.setBorderPainted(false);
        dltBTNinv.setForeground(new Color(255,255,255));
        dltBTNinv.setFont(new Font("impact", Font.PLAIN, 24));
        frameinv.add(dltBTNinv);

    }
    
    private void returnbuttoninv(){
        rtrnmmBTNinv = new JButton("RETURN TO MAIN MENU");
        rtrnmmBTNinv.setBounds(330, 1, 380, 60);
        rtrnmmBTNinv.setBackground(Color.WHITE);
        rtrnmmBTNinv.setBorderPainted(false);
        rtrnmmBTNinv.setForeground(new Color(176,54,49));
        rtrnmmBTNinv.setFont(new Font("impact", Font.PLAIN, 30));
        frameinv.add(rtrnmmBTNinv);
        
        rtrnmmBTNinv.addActionListener(this);
        
    }
    
    private void upsquare(){
    PNLupinv = new JPanel();
    PNLupinv.setBounds(0, 0, 900, 65);
    PNLupinv.setBackground(Color.white);
    frameinv.add(PNLupinv);
    }
    
    private void midsquare(){
        PNLmidinv = new JPanel();
    PNLmidinv.setBounds(120, 100, 650, 420);
    PNLmidinv.setBackground(Color.white);
    frameinv.add(PNLmidinv);
    }
    
    private void lineinv(){
    PNLline = new JPanel();
    PNLline.setBounds(150, 0, 5, 65);
    PNLline.setBackground(Color.black);
    frameinv.add(PNLline);
    }
    
    private void logoinv(){
        LBLlogoinv = new JLabel("J&J Resto");
        LBLlogoinv.setBounds(20, 2, 150, 55);
        LBLlogoinv.setForeground(new Color(167,54,49));
        LBLlogoinv.setFont(new Font("impact", Font.PLAIN, 30));
        frameinv.add(LBLlogoinv);
    }
    
    private void invtxt(){
        LBLinv = new JLabel("INVENTORY");
        LBLinv.setBounds(175, 2, 150, 55);
        LBLinv.setForeground(new Color(167,54,49));
        LBLinv.setFont(new Font("impact", Font.PLAIN, 32));
        frameinv.add(LBLinv);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == rtrnmmBTNinv){
        ManagerMenu MM = new ManagerMenu();
        }
        else if (e.getSource() == addBTNinv){
            AddInventory AddI = new AddInventory();
        }
    }
    
}

