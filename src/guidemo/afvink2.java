/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Bartdroge
 */
public class afvink2 extends JFrame implements ActionListener {
    private JTextField textfieldx;
    private JTextField textfieldy;
    private JButton button;
    private JPanel panel;
    

    public static void main(String[] args) {
        afvink2 frame = new afvink2();
        frame.setSize(200, 200);
        frame.setTitle("Watermolecuul");
        frame.createGUI();
        frame.setVisible(true);
    } 
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        textfieldx = new JTextField();
        textfieldx.setPreferredSize(new Dimension (50,25));
        window.add(textfieldx);    
        textfieldx.setBackground(Color.white);
        
        textfieldy = new JTextField();
        textfieldy.setPreferredSize(new Dimension (50,25));
        window.add(textfieldy);
        textfieldy.setBackground(Color.white);
        
        
        button = new JButton("show");
        window.add(button);
        button.addActionListener(this);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension (500,500));
        window.add(panel);
        panel.setBackground(Color.white);
        
      }

    public void actionPerformed(ActionEvent event){
    int X = Integer.parseInt(textfieldx.getText());
    int Y = Integer.parseInt(textfieldy.getText());
    Graphics paper = panel.getGraphics();
    paper.clearRect(0, 0, getWidth(), getHeight());
    paper.setColor(Color.BLACK);
    paper.drawLine(X+50, Y+30, X+200, Y+150);
    paper.drawLine(X+50, Y+220, X+200, Y+150);
    paper.setColor(Color.blue);
    paper.fillOval(X+30, Y+10, 50, 50);
    paper.fillOval(X+30, Y+200, 50, 50);
    paper.setColor(Color.RED);
    paper.fillOval(X+150, Y+100, 100, 100);
 
}

    
}
