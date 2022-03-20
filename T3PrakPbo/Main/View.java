/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.awt.event.*;
import javax.swing.*;
import Ruang.Balok;
/**
 *
 * @author Machine Game
 */
public class View extends JFrame implements ActionListener {
    JLabel lbljudul = new JLabel("Cuboid Calculator");
    
    JLabel lblLength = new JLabel("Length :");
    JTextField tfLength = new JTextField(20);
    JLabel lblWidth = new JLabel("Width :");
    JTextField tfWidth = new JTextField(20); 
    JLabel lblHeight = new JLabel("Height :");
    JTextField tfHeight = new JTextField(20);
       
    JLabel lblhasil = new JLabel("Result :");
    JLabel lblSquareArea = new JLabel();
    JLabel lblSquareCircumference  = new JLabel();
    JLabel lblSurfaceArea = new JLabel();
    JLabel lblvolume = new JLabel();
       
    JButton btnhitung = new JButton("Count");
    JButton btnreset = new JButton("Reset");

    public View() {
        setTitle("Cuboid Calculator");
           
        setSize(350, 400);
        setLayout(null);
        add(lbljudul);
        add(lblLength);
        add(tfLength);
        add(lblWidth);
        add(tfWidth);
        add(lblHeight);
        add(tfHeight);
        
        add(lblhasil);
        add(lblSquareArea);
        add(lblSquareCircumference );
        add(lblSurfaceArea);
        add(lblvolume);
        
        add(btnhitung);
        add(btnreset);
           
        //setBounds(int x-coordinate, int y-coordinate, int width, int height)
               lbljudul.setBounds(140,6,150,40);
        lblLength.setBounds(20,40,100,30);
        tfLength.setBounds(130,40,160,30);
        lblWidth.setBounds(20,65,100,30);
        tfWidth.setBounds(130,65,160,30);
        lblHeight.setBounds(20,95,100,30);
        tfHeight.setBounds(130,95,160,30);
       
        lblhasil.setBounds(145,125,100,30);
        lblSquareArea.setBounds(30,160,200,30);
        lblSquareCircumference .setBounds(30,185,200,30);
        lblSurfaceArea.setBounds(30,210,200,30);
        lblvolume.setBounds(30,235,200,30);
        
        btnhitung.setBounds(70,300,80,30);
        btnreset.setBounds(170,300,80,30);
           
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        btnhitung.addActionListener(this);
        btnreset.addActionListener(this);
       }
       
    @Override
    public void actionPerformed(ActionEvent e){
        int Length, Width, Height;
           
        if (e.getSource() == btnhitung) {
            if (tfLength.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error : Length is empty!");
            } else if (tfWidth.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error : Width is empty!");
            } else if (tfHeight.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error : Height is empty!");             
            } else if(tfLength.getText().isEmpty()& tfWidth.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Error : Length and Width are empty!"); 
            }
            else {
                try {
                    Length = Integer.parseInt(tfLength.getText());
                    Width = Integer.parseInt(tfWidth.getText());
                    Height = Integer.parseInt(tfHeight.getText());
                    
                    Balok balok = new Balok(Length, Width, Height);
                    
                    lblSquareArea.setText("Square Area                        : " + balok.SquareArea());
                    lblSquareCircumference .setText("Square Circumference     : " + balok.SquareCircumference ());
                    lblvolume.setText("Cuboid Volume                        : " + balok.volume());
                    lblSurfaceArea.setText("Cuboid Surface Area             : " + balok.SurfaceArea());
                } catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Input Number not String!");
                }
            }
        }
           
        if (e.getSource() == btnreset) {
            lblSquareArea.setText(" ");
            lblSquareCircumference .setText(" ");
            lblSurfaceArea.setText(" ");
            lblvolume.setText(" ");
            tfLength.setText("");
            tfWidth.setText("");
            tfHeight.setText("");
        }
    }
}