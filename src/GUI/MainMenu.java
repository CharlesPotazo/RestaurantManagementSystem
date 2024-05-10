package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainMenu implements ActionListener{
     private JFrame frame = new JFrame("MENU");
     private JPanel panel1,panel2,panel3;
     private JButton POSBtn;
     
     MainMenu(){
         
         POSBtn();
        panel2();
        panel3();
        panel1();
        frame.setSize(900, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        
        frame.setVisible(true);
     }
     private void panel1(){
         panel1 = new JPanel();
         panel1.setLayout(null);
         panel1.setSize(900, 600);
         panel1.setBackground(new Color(255,255,255));
         
         frame.add(panel1);
     }
     private void panel2(){
         panel2 = new JPanel();
         panel2.setLayout(null);
         panel2.setBounds(0,0,900,100);
         panel2.setBackground(new Color(167,54,49));
         
         frame.add(panel2);
     }
     
     private void panel3(){
         panel3 = new JPanel();
         panel3.setLayout(null);
         panel3.setBounds(0,0,150,600);
         panel3.setBackground(new Color(87,88,90));
         
         frame.add(panel3);
     }
     
     private void POSBtn(){
         POSBtn = new JButton();
        POSBtn.setBounds(300,50,100,25);//(x AXIS, y aixs,width LAPD, HEIGHT TAAS)
        POSBtn.setBackground(new Color(167,54,49));//(new Color(Search RGB fro the color you want))
        POSBtn.setBorderPainted(false);
        POSBtn.setText("POS");
        POSBtn.setForeground(new Color(255,255,255));
        POSBtn.setFont(new Font("impact", Font.PLAIN, 29));
        POSBtn.addActionListener(this);
        frame.add(POSBtn);
     }
     
     
     
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == POSBtn){
            //palagay dito POS NIYO ROD
        }
        }
    
}

