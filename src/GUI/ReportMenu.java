package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReportMenu implements ActionListener {
    private JFrame frame = new JFrame ();
    private JLabel BG, reportTxt,reportsLabel,displaylabel,emplolabel,labelreport, logo;
    private JPanel divider2, longRectangle,divider1,divider3,middleRectangle;
    private JButton returnToMainMenu,sales,waste;
    
    ReportMenu() { //Hiniwalay po muna namin para po madali namin po maadjust
        Texts();
        Buttons();
        Panels();
        background();

        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);        
    }
    
    private void Texts(){ //All the texts in the GUI
        logo = new JLabel("J&J Resto");
        logo.setBounds(20, 20, 150, 55);
        logo.setForeground(new Color(167,54,49));
        logo.setFont(new Font("impact", Font.PLAIN, 30));
        frame.add(logo);
        
        reportsLabel = new JLabel(); 
        reportsLabel.setText("REPORTS"); 
        reportsLabel.setBounds(155, 20, 300, 50);
        reportsLabel.setFont(new Font("Impact", Font.PLAIN, 35));
        reportsLabel.setForeground(new Color(167, 54, 49));
        reportsLabel.setVisible(true);
        frame.add(reportsLabel);
        
        reportTxt = new JLabel();
        reportTxt.setText("REPORTS"); 
        reportTxt.setBounds(480, 110, 300, 100);
        reportTxt.setFont(new Font("Impact", Font.PLAIN, 24));
        reportTxt.setVisible(true);
        frame.add(reportTxt);
        
        labelreport = new JLabel();
        labelreport.setText("HERE ARE THE REPORTS:"); 
        labelreport.setBounds(220, 180, 300, 50);
        labelreport.setFont(new Font("Impact", Font.PLAIN, 20));
        labelreport.setVisible(true);
        frame.add(labelreport);
        
        displaylabel = new JLabel();
        displaylabel.setText("DISPLAY:"); 
        displaylabel.setBounds(93, 140, 300, 50);
        displaylabel.setFont(new Font("Impact", Font.PLAIN, 20));
        displaylabel.setVisible(true);
        frame.add(displaylabel);
        
        emplolabel = new JLabel();
        emplolabel.setText("Employee Name"); 
        emplolabel.setBounds(740, 25, 300, 50);
        emplolabel.setForeground(new Color(167, 54, 49));
        emplolabel.setFont(new Font("Impact", Font.PLAIN, 20));
        emplolabel.setVisible(true);
        frame.add(emplolabel);
    }
    
    private void Buttons(){//All the Buttons in the GUI
        returnToMainMenu = new JButton("Return to the Main Menu");//Return to menu button
        returnToMainMenu.setBounds(280,40, 170, 30);
        returnToMainMenu.setBackground(Color.WHITE);
        returnToMainMenu.setBorderPainted(false);
        returnToMainMenu.setForeground(new Color(167, 54, 49));
        returnToMainMenu.setFont(new Font("Impact", Font.PLAIN, 12));
        returnToMainMenu.addActionListener(this);
        frame.add(returnToMainMenu);
        
        sales = new JButton("Sales");//Sales button
        sales.setBounds(70, 250, 110, 50);
        sales.setBackground(Color.WHITE);
        sales.setBorderPainted(false);
        sales.setForeground(new Color(167, 54, 49));
        sales.setFont(new Font("Impact", Font.PLAIN, 30));
        sales.addActionListener(this);
        frame.add(sales);
        
        waste = new JButton("Waste");////Waste button
        waste.setBounds(70, 350, 110, 50);
        waste.setBackground(Color.WHITE);
        waste.setBorderPainted(false);
        waste.setForeground(new Color(167, 54, 49));
        waste.setFont(new Font("Impact", Font.PLAIN, 30));
        waste.addActionListener(this);
        frame.add(waste);
    }
    
    public void Panels(){
        divider2 = new JPanel();//red divider on the top
        divider2.setBounds(0, 0, 900, 2);
        divider2.setBackground(new Color(167,54,49));
        frame.add(divider2);

        divider1 = new JPanel();//black divider on the top
        divider1.setBounds(150, 0, 5, 100);
        divider1.setBackground(Color.black);
        frame.add(divider1);

        longRectangle = new JPanel();//white rectangle on the top
        longRectangle.setBounds(0, 0, 900, 100);
        longRectangle.setBackground(Color.white);
        frame.add(longRectangle);
        
        divider3 = new JPanel();//red dvider on the middle
        divider3.setBounds(200, 140, 10, 380);
        divider3.setBackground(new Color(167, 54, 49));
        divider3.setVisible(true);
        frame.add(divider3);
        
        middleRectangle = new JPanel();//middle rectangle
        middleRectangle.setBounds(40, 140, 800, 380);
        middleRectangle.setBackground(Color.WHITE);
        middleRectangle.setVisible(true);
        frame.add(middleRectangle);
    }
    
    public void background(){
        JLabel BackGroundImage = new JLabel();
        ImageIcon backgroundPic = new ImageIcon("Images/Background2.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(900,620);
        frame.add(BackGroundImage);
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource()==returnToMainMenu){
            ManagerMenu managerMenu = new ManagerMenu();
            frame.dispose();
        }
        else if(e.getSource()==sales){
            //will show sales report
        }
        else if(e.getSource()==waste){
            //will show sales report
        }
    }
    
    
}