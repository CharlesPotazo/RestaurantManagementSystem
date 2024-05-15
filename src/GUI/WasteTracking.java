package GUI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WasteTracking implements ActionListener{
    private JFrame frame = new JFrame();
    private JPanel whiteRectangle, divider2, divider,square1;
    private JButton addButton, deleteButton, rtrnBtn;
    private JLabel logo,txt1;
    
    
    WasteTracking() {//Hiniwalay po muna namin para po madali namin po maadjust
        table();
        Texts();
        Buttons();
        Panels();
        Background();
     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setTitle("J&J's Waste Tracking");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void Texts(){
        logo = new JLabel("J&J Resto");
        logo.setBounds(20, 20, 150, 55);
        logo.setForeground(new Color(167,54,49));
        logo.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(logo);
        
        txt1 = new JLabel("Waste Tracking");
        txt1.setBounds(160, 20, 210, 55);
        txt1.setForeground(new Color(167,54,49));
        txt1.setFont(new Font("impact", Font.PLAIN, 32));
        frame.add(txt1);
    }
    private void Buttons(){
        rtrnBtn = new JButton("Return to the Main Menu");//Return to menu button
        rtrnBtn.setBounds(380,40, 170, 30);
        rtrnBtn.setBackground(Color.WHITE);
        rtrnBtn.setBorderPainted(false);
        rtrnBtn.setForeground(new Color(167, 54, 49));
        rtrnBtn.setFont(new Font("Impact", Font.PLAIN, 12));
        rtrnBtn.addActionListener(this);
        frame.add(rtrnBtn);
        
        addButton = new JButton("ADD");
        addButton.setBounds(310, 400, 110, 60);
        addButton.setBackground(new Color(176,54,49));
        addButton.setBorderPainted(false);
        addButton.setForeground(new Color(255,255,255));
        addButton.setFont(new Font("impact", Font.PLAIN, 24));
        frame.add(addButton);
        
        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(500, 400, 110, 60);
        deleteButton.setBackground(new Color(176,54,49));
        deleteButton.setBorderPainted(false);
        deleteButton.setForeground(new Color(255,255,255));
        deleteButton.setFont(new Font("impact", Font.PLAIN, 24));
        frame.add(deleteButton);
        deleteButton.addActionListener(this);
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
    
    public void table(){
        String[] columnName = {"Date and TIme", "Item Description", "Reason For Waste", "Quantity","Recorded By"};
        Object[][] data = {{"1/15/24 & 12:30", "Chicken Breast", " Expired", "9","Ibarbia"},
                    {"2/23/24 & 10:40", " Chicken Breast", "Expired", "7","Ibarbia"}
                           };
             
        JTable table = new JTable(data, columnName);
        JScrollPane scp = new JScrollPane(table);
        scp.setBounds(205, 140, 500, 220);
        frame.add(scp);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rtrnBtn){
            ManagerMenu managerMenu = new ManagerMenu();
            frame.dispose();
        }
        else if(e.getSource() == addButton){
         //finiffigure out pa po
        }
        else if(e.getSource() == deleteButton){
            //finiffigure out pa po
        }
    }
    
}
