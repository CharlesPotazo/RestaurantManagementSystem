package GUI;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class WasteTracking {
    private JTable table;
    private JButton addButtonfwt;
    private JButton deleteButtonBtn;
    private JLabel lblpic, backgroundWR;
    private JFrame frame = new JFrame();
    
        WasteTracking() {
        addBTNfwt();
        deleteBTNBtn();
        tablefwt();
        JPanelWT(); 
        
        backgroundWR = new JLabel();
      
        ImageIcon backgroundpic = new ImageIcon("Background1.png");
        backgroundWR .setIcon(backgroundpic);
        backgroundWR .setSize(900, 600);
        frame.add(backgroundWR );
        
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setTitle("WasteRecordingMenu");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
        public void JPanelWT () {
        JPanel whitePanel = new JPanel ();
        whitePanel.setBackground(Color.white);
        whitePanel.setBounds(110, 210, 700,400);
        frame.add(whitePanel);
     }
    
    public void addBTNfwt() {
        addButtonfwt = new JButton("Add");
        addButtonfwt.setBounds(300, 300, 110, 60);
        frame.add(addButtonfwt);
  
    }
    public void deleteBTNBtn() {
    deleteButtonBtn = new JButton("Delete");
        deleteButtonBtn.setBounds(450, 300, 110, 60);
        frame.add(deleteButtonBtn);

    
    }
    
    public void tablefwt(){
        String[] columnName = {"Date and TIme", "Item Description", "Reason For Waste", "Quantity","Recorded By"};
        
        Object[][] data = {{"1/15/24 & 12:30", "Chicken Breast", " Expired", "9","Ibarbia"},
                    {"2/23/24 & 10:40", " Chicken Breast", "Expired", "7","Ibarbia"}
                    
            };
             
        JTable table = new JTable(data, columnName);
        table.getTableHeader().setBounds(110,170,650,50);
        table.setBounds(110,210,650,60);
        
        frame.add(table);
        frame.add(table.getTableHeader());
    }
}
