package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManagerMenu implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel square1, square2, square3;
    private JLabel label1, label2, label3;
    private JButton POSBtn,ReportBtn,InvBtn,WRBtn;
    
    ManagerMenu(){
        label3();
        buttons();
        square3();
        label1();
        label2();
        square1();
        square2();
        BackGroundImage();
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    private void square1(){
    square1 = new JPanel();
    square1.setBounds(0, 0, 900, 100);
    square1.setBackground(Color.white);
    frame.add(square1);
    }
    
    private void square2(){
    square1 = new JPanel();
    square1.setBounds(150, 180, 600, 300);
    square1.setBackground(Color.white);
    frame.add(square1);
    }
    
    private void square3(){
    square3 = new JPanel();
    square3.setBounds(150, 0, 5, 100);
    square3.setBackground(Color.black);
    frame.add(square3);
    }
    
    private void label1(){
    label1 = new JLabel("MAIN MENU");
    label1.setBounds(160, 0, 300, 100);
    label1.setForeground(new Color(167,54,49));
    label1.setFont(new Font("impact", Font.PLAIN, 50));
    frame.add(label1);
    }
    
    private void label2(){
    label1 = new JLabel("Employee Name");
    label1.setBounds(750, 0, 300, 100);
    label1.setForeground(new Color(167,54,49));
    label1.setFont(new Font("impact", Font.PLAIN, 20));
    frame.add(label1);
    }
    
    private void label3(){
    label3 = new JLabel("CHOOSE");
    label3.setBounds(410,170 , 300, 100);
    label3.setForeground(Color.BLACK);
    label3.setFont(new Font("impact", Font.PLAIN, 30));
    frame.add(label3);
    }
    
    private void buttons(){
        POSBtn = new JButton("POS");
        POSBtn.setBounds(330,300,100,50);
        POSBtn.setBackground(new Color(167,54,49));
        POSBtn.setBorderPainted(false);
        POSBtn.setForeground(new Color(255,255,255));
        POSBtn.setFont(new Font("impact", Font.PLAIN, 30));
        POSBtn.addActionListener(this);
        frame.add(POSBtn);
        
        ReportBtn = new JButton("Reports");
        ReportBtn.setBounds(450,300,130,50);
        ReportBtn.setBackground(new Color(167,54,49));
        ReportBtn.setBorderPainted(false);
        ReportBtn.setForeground(new Color(255,255,255));
        ReportBtn.setFont(new Font("impact", Font.PLAIN, 29));
        ReportBtn.addActionListener(this);
        frame.add(ReportBtn);
        
        InvBtn = new JButton("Inventory");
        InvBtn.setBounds(280,380,150,50);
        InvBtn.setBackground(new Color(167,54,49));
        InvBtn.setBorderPainted(false);
        InvBtn.setForeground(new Color(255,255,255));
        InvBtn.setFont(new Font("impact", Font.PLAIN, 29));
        InvBtn.addActionListener(this);
        frame.add(InvBtn);
        
        WRBtn = new JButton("Waste Tracking");
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
    ImageIcon backgroundPic = new ImageIcon("Background2.JPg");
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
            //palagay dito Report mo bryle
        }
        else if(e.getSource() == InvBtn){
            //palagay dito Inventory mo elijah
        }
        else if(e.getSource() == WRBtn){
            //palagay dito WasteTracking mo Ibarbia
        }
    }
}
