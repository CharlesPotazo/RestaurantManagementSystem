package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManagerMenu implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel whiteRectangle, square, divider, divider2;
    private JLabel label1, mainTxt, chooseTxt, logo;
    private JButton POSBtn,ReportBtn,InvBtn,WRBtn;
    
    ManagerMenu(){//Hiniwalay po muna namin para po madali namin po maadjust
        Texts();
        buttons();
        Panels();
        BackGroundImage();
        
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private void Texts(){
        logo = new JLabel("J&J Resto");
        logo.setBounds(20, 20, 150, 55);
        logo.setForeground(new Color(167,54,49));
        logo.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(logo);
        
        mainTxt = new JLabel("MAIN MENU");//Main text
        mainTxt.setBounds(160, 0, 300, 100);
        mainTxt.setForeground(new Color(167,54,49));
        mainTxt.setFont(new Font("impact", Font.PLAIN, 50));
        frame.add(mainTxt);
        
        label1 = new JLabel("Employee Name");//Employee text
        label1.setBounds(750, 0, 300, 100);
        label1.setForeground(new Color(167,54,49));
        label1.setFont(new Font("impact", Font.PLAIN, 20));
        frame.add(label1);
        
        chooseTxt = new JLabel("CHOOSE");//Choose text
        chooseTxt.setBounds(410,170 , 300, 100);
        chooseTxt.setForeground(Color.BLACK);
        chooseTxt.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(chooseTxt);
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

        square = new JPanel();//white square
        square.setBounds(150, 180, 600, 300);
        square.setBackground(Color.white);
        frame.add(square);
    };

    private void buttons(){
        POSBtn = new JButton("POS");//POS Button
        POSBtn.setBounds(330,300,100,50);
        POSBtn.setBackground(new Color(167,54,49));
        POSBtn.setBorderPainted(false);
        POSBtn.setForeground(new Color(255,255,255));
        POSBtn.setFont(new Font("impact", Font.PLAIN, 30));
        POSBtn.addActionListener(this);
        frame.add(POSBtn);
        
        ReportBtn = new JButton("Reports");//Report Button
        ReportBtn.setBounds(450,300,130,50);
        ReportBtn.setBackground(new Color(167,54,49));
        ReportBtn.setBorderPainted(false);
        ReportBtn.setForeground(new Color(255,255,255));
        ReportBtn.setFont(new Font("impact", Font.PLAIN, 29));
        ReportBtn.addActionListener(this);
        frame.add(ReportBtn);
        
        InvBtn = new JButton("Inventory");//Inventory Button
        InvBtn.setBounds(280,380,150,50);
        InvBtn.setBackground(new Color(167,54,49));
        InvBtn.setBorderPainted(false);
        InvBtn.setForeground(new Color(255,255,255));
        InvBtn.setFont(new Font("impact", Font.PLAIN, 29));
        InvBtn.addActionListener(this);
        frame.add(InvBtn);
        
        WRBtn = new JButton("Waste Tracking");//Waste Tracking Button
        WRBtn.setBounds(450,380,230,50);
        WRBtn.setBackground(new Color(167,54,49));
        WRBtn.setBorderPainted(false);
        WRBtn.setForeground(new Color(255,255,255));
        WRBtn.setFont(new Font("impact", Font.PLAIN, 29));
        WRBtn.addActionListener(this);
        frame.add(WRBtn);
    
    }
    
    private void BackGroundImage(){
        JLabel BackGroundImage = new JLabel();
        ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(900,620);
        frame.add(BackGroundImage);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == POSBtn){
            //palagay dito POS NIYO ROD and dj
        }
        else if(e.getSource() == ReportBtn){
            ReportMenu reportMenu = new ReportMenu();//added by Bryle
            frame.dispose();
        }
        else if(e.getSource() == InvBtn){
            InventoryMenu inventoryMenu = new InventoryMenu();//added by Elijah
            frame.dispose();
        }
        else if(e.getSource() == WRBtn){
            WasteTracking wasteTracking = new WasteTracking(); //added by Ibarbia
            frame.dispose();
        }
    }
}
