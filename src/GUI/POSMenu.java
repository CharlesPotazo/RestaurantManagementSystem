package GUI;

import DataLayer.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class POSMenu implements ActionListener {

    private JFrame f = new JFrame();
    private JLabel POS, Text1;
    private JButton dish1, dish2, dish3, dish4, btnCheckout, btnCancelOrder, returnToMainMenu;
    private JTextArea orderArea;
    private JTextField orderTotal;
    private JPanel rectangleWhite, divider1, redLine, redLine2;

    private double total = 0.00;
    private FoodData foodData = new FoodData();

    POSMenu() {

        Buttons();
        order();
        Texts();
        panels();
        BackGroundImage();
        f.setSize(900, 600);
        f.setLayout(null);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void BackGroundImage() {
        JLabel BackGroundImage = new JLabel();
        ImageIcon backgroundPic = new ImageIcon("Images/Background3.jpg");
        BackGroundImage.setIcon(backgroundPic);
        BackGroundImage.setSize(900, 620);
        f.add(BackGroundImage);
    }

    private void Texts() {
        Text1 = new JLabel("Employee Name");
        Text1.setBounds(750, 0, 300, 100);
        Text1.setForeground(new Color(167, 54, 49));
        Text1.setFont(new Font("impact", Font.PLAIN, 20));
        f.add(Text1);

        POS = new JLabel("POS");
        POS.setBounds(160, 0, 300, 100);
        POS.setForeground(new Color(167, 54, 49));
        POS.setFont(new Font("impact", Font.PLAIN, 50));
        f.add(POS);

    }

    private void panels() {
        redLine = new JPanel();
        redLine.setBounds(0, 0, 900, 2);
        redLine.setBackground(new Color(167, 54, 49));
        f.add(redLine);

        redLine2 = new JPanel();
        redLine2.setBounds(0, 100, 900, 2);
        redLine2.setBackground(new Color(167, 54, 49));
        f.add(redLine2);

        divider1 = new JPanel();
        divider1.setBounds(150, 0, 5, 100);
        divider1.setBackground(Color.black);
        f.add(divider1);

        rectangleWhite = new JPanel();
        rectangleWhite.setBounds(0, 0, 900, 100);
        rectangleWhite.setBackground(Color.white);
        f.add(rectangleWhite);

    }

    private void Buttons() {

        returnToMainMenu = new JButton("Return to the Main Menu");
        returnToMainMenu.setBounds(240, 40, 230, 30);
        returnToMainMenu.setBackground(Color.WHITE);
        returnToMainMenu.setBorderPainted(false);
        returnToMainMenu.setForeground(new Color(167, 54, 49));
        returnToMainMenu.setFont(new Font("Impact", Font.PLAIN, 20));
        returnToMainMenu.addActionListener(this);
        f.add(returnToMainMenu);

        dish1 = new JButton(foodData.Dish1().getName() + "(P" + foodData.Dish1().getPrice() + ")"); //kungpaockn
        dish1.setFont(new Font("impact", Font.PLAIN, 11));
        dish1.setBounds(120, 150, 160, 115);
        ImageIcon menu1Icon = new ImageIcon("Dish1.jpg");

        dish1.setIcon(menu1Icon);
        dish1.setHorizontalTextPosition(JButton.CENTER);
        dish1.setVerticalTextPosition(JButton.BOTTOM);
        dish1.setBackground(Color.white);
        dish1.addActionListener(this);
        f.add(dish1);

        dish2 = new JButton(foodData.Dish2().getName() + "(P" + foodData.Dish2().getPrice() + ")"); //bpepper
        dish2.setFont(new Font("impact", Font.PLAIN, 11));
        dish2.setBounds(360, 150, 160, 115);
        ImageIcon menu2Icon = new ImageIcon("Dish2.jpg");

        dish2.setIcon(menu2Icon);
        dish2.setHorizontalTextPosition(JButton.CENTER);
        dish2.setVerticalTextPosition(JButton.BOTTOM);
        dish2.setBackground(Color.white);
        dish2.addActionListener(this);
        f.add(dish2);

        dish3 = new JButton(foodData.Dish3().getName() + "(P" + foodData.Dish3().getPrice() + ")"); //mushroom
        dish3.setFont(new Font("impact", Font.PLAIN, 11));
        dish3.setBounds(120, 300, 160, 115);
        ImageIcon menu3Icon = new ImageIcon("C:Dish3.jpg");

        dish3.setIcon(menu3Icon);
        dish3.setHorizontalTextPosition(JButton.CENTER);
        dish3.setVerticalTextPosition(JButton.BOTTOM);
        dish3.setBackground(Color.white);
        dish3.addActionListener(this);
        f.add(dish3);

        dish4 = new JButton(foodData.Dish4().getName() + "(P" + foodData.Dish4().getPrice() + ")"); //orangeckn
        dish4.setFont(new Font("impact", Font.PLAIN, 11));
        dish4.setBounds(360, 300, 160, 115);
        ImageIcon menu4Icon = new ImageIcon("Dish4.jpg");

        dish4.setIcon(menu4Icon);
        dish4.setHorizontalTextPosition(JButton.CENTER);
        dish4.setVerticalTextPosition(JButton.BOTTOM);
        dish4.setBackground(Color.white);
        dish4.addActionListener(this);
        f.add(dish4);

        btnCheckout = new JButton("Checkout");
        btnCheckout.setForeground(Color.white);
        btnCheckout.setBorder(null);
        btnCheckout.setFont(new Font("impact", Font.PLAIN, 15));
        btnCheckout.setBounds(770, 530, 100, 25);
        btnCheckout.setBackground(new Color(167, 54, 49));
        btnCheckout.addActionListener(this);
        f.add(btnCheckout);

        btnCancelOrder = new JButton("Cancel Order");
        btnCancelOrder.setForeground(Color.white);
        btnCancelOrder.setBorder(null);
        btnCancelOrder.setFont(new Font("impact", Font.PLAIN, 15));
        btnCancelOrder.setBounds(650, 530, 100, 25);
        btnCancelOrder.setBackground(new Color(167, 54, 49));
        btnCancelOrder.addActionListener(this);
        f.add(btnCancelOrder);

    }

    private void order() {

        orderTotal = new JTextField("₱0.00");
        orderTotal.setEditable(false);
        orderTotal.setBounds(634, 475, 250, 50);
        orderTotal.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        f.add(orderTotal);

        orderArea = new JTextArea();
        orderArea.setEditable(false);
        Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
        orderArea.setBorder(blackBorder);
        orderArea.setBounds(634, 100, 250, 425);
        f.add(orderArea);

    }

    private void updateOrder(FoodModel dish) {
        total += dish.getPrice();
        orderArea.append(dish.getName() + " - ₱" + dish.getPrice() + "\n");
        orderTotal.setText("₱" + total);
    }

    private void acceptPayment() {
        double paymentAmount = total;

        String paymentInput = JOptionPane.showInputDialog(f, "Enter payment amount:");

        try {
            double payment = Double.parseDouble(paymentInput);

            if (payment >= paymentAmount) {
                double change = payment - paymentAmount;
                JOptionPane.showMessageDialog(f, "Payment accepted!\nChange: ₱" + String.format("%.2f", change));
            } else {
                JOptionPane.showMessageDialog(f, "Insufficient payment amount.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(f, "Invalid input. Please enter a valid payment amount.");
        }
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
