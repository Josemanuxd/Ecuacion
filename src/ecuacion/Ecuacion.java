/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.IOException;
import java.lang.Math.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class Ecuacion extends JFrame implements ActionListener {
    
    JButton bot1, bot2;
    JLabel pA, pB, pC, pD, pE, pF, pG, p, p1, p2, p3;
    JTextField tex1, tex2, tex3, tex4, tex5, tex6, tex7;
    Font font= new Font("Comic Sans MS", Font.BOLD, 20);
    Font font1= new Font("Comic Sans MS", Font.PLAIN, 18);
    Font font2= new Font("Comic Sans MS", Font.PLAIN, 20);
    Color color= new Color(253);
    public float a, b, num1, num2, num3, res1, res2;
    
    
    public Ecuacion() {
        
        setLayout(null);
        setTitle("Ecuacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.BLUE);
        
        p= new JLabel("Introduzca la ecuacion: (ax + b)^2");
        p.setFont(font);
        p.setBounds(270, 30, 490, 80);
        add(p);
        
        pD= new JLabel("Forma general: ");
        pD.setFont(font);
        pD.setBounds(270, 180, 490, 80);
        add(pD);
        
        p3= new JLabel("Resultado: ");
        p3.setFont(font);
        p3.setBounds(270, 320, 490, 80);
        add(p3);
        
        pA= new JLabel("(");
        pA.setBounds(320, 110, 50, 50);
        pA.setFont(font2);
        add(pA);
        
        tex1= new JTextField();
        tex1.setFont(font1);
        tex1.setHorizontalAlignment(JTextField.RIGHT);
        tex1.setBounds(335, 110, 100, 50);
        add(tex1);
        
        pB= new JLabel("x +");
        pB.setBounds(440, 110, 50, 50);
        pB.setFont(font2);
        add(pB);
        
        tex2= new JTextField();
        tex2.setFont(font1);
        tex2.setHorizontalAlignment(JTextField.RIGHT);
        tex2.setBounds(470, 110, 100, 50);
        add(tex2);
        
        pC= new JLabel(")^2");
        pC.setBounds(580, 110, 50, 50);
        pC.setFont(font2);
        add(pC);
        
        tex3= new JTextField();
        tex3.setFont(font1);
        tex3.setEnabled(false);
        tex3.setHorizontalAlignment(JTextField.RIGHT);
        tex3.setBounds(250, 250, 100, 50);
        add(tex3);
        
        
        pE= new JLabel("x^2 +");
        pE.setFont(font);
        pE.setBounds(360, 240, 490, 80);
        add(pE);
        
        tex4= new JTextField();
        tex4.setFont(font1);
        tex4.setEnabled(false);
        tex4.setHorizontalAlignment(JTextField.RIGHT);
        tex4.setBounds(420, 250, 100, 50);
        add(tex4);
        
        pF= new JLabel("x +");
        pF.setFont(font);
        pF.setBounds(530, 240, 490, 80);
        add(pF);
        
        pG= new JLabel("= 0");
        pG.setFont(font);
        pG.setBounds(680, 240, 490, 80);
        add(pG);
        
        tex5= new JTextField();
        tex5.setFont(font1);
        tex5.setEnabled(false);
        tex5.setHorizontalAlignment(JTextField.RIGHT);
        tex5.setBounds(570, 250, 100, 50);
        add(tex5);
        
        tex6= new JTextField();
        tex6.setFont(font1);
        tex6.setEnabled(false);
        tex6.setHorizontalAlignment(JTextField.RIGHT);
        tex6.setBounds(300, 400, 200, 50);
        add(tex6);
        
        tex7= new JTextField(0);
        tex7.setFont(font1);
        tex7.setEnabled(false);
        tex7.setHorizontalAlignment(JTextField.RIGHT);
        tex7.setBounds(550, 400, 200, 50);
        add(tex7);
        
        p1= new JLabel("x1 =");
        p1.setFont(font);
        p1.setBounds(250, 390, 490, 80);
        add(p1);
        
        p2= new JLabel("x2 =");
        p2.setFont(font);
        p2.setBounds(500, 390, 490, 80);
        add(p2);
        
        bot1= new JButton("Calcular");
        bot1.setFont(font1);
        bot1.setBackground(Color.getHSBColor(32, 452, 45));
        bot1.setForeground(Color.WHITE);
        bot1.setBounds(750, 650, 150, 50);
        bot1.addActionListener(this);
        add(bot1);
        
        setVisible(true);
    }
    
    public void resolEcu() {
        
        a = Float.valueOf(tex1.getText());
        b = Float.valueOf(tex2.getText());
        
        num1 = (float) Math.pow(a, 2);
        num2 = 2 * a * b;
        num3 = (float) Math.pow(b, 2);
        
        tex3.setText(String.valueOf(num1));
        tex4.setText(String.valueOf(num2));
        tex5.setText(String.valueOf(num3));
        
        double ps1,ps2,ps3,ps4,ps5,ps6,ps7;
        
        ps1 = (double) ((Math.pow(num2, 2))-(4*num1*num3));
        
        ps2 = (double) Math.sqrt(ps1);
        ps3 = 2 * num1;
        res1 = (float) ((float)(((-1)*num2)+ ps2) / ps3);
        res2 = (float) ((float)(((-1)*num2)- ps2) / ps3);
        
        tex6.setText(String.valueOf(res1));
        tex7.setText(String.valueOf(res2));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bot1) {
            resolEcu();
        }
        
    }
}