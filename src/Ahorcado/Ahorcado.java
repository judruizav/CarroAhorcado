/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Julian
 */
public class Ahorcado extends JPanel implements ActionListener, KeyListener{
    private int x;
    private int y;
    
    public Ahorcado(int x, int y){
        this.x= x;
        this.y= y;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(20+x, 550+y, 220+x, 400+y, 150, 150);
        g.drawLine(120+x, 50+y, 120+x, 550+y);
        g.drawLine(120+x, 50+y, 350+x, 50+y);
        g.drawLine(350+x, 50+y, 350+x, 130+y);
        g.drawOval(300+x, 130+y, 100, 100);
        g.drawLine(350+x, 230+y, 350+x, 400+y);
        g.drawLine(350+x, 400+y, 250+x, 500+y);
        g.drawLine(350+x, 400+y, 450+x, 500+y);
        g.drawLine(320+x, 220+y, 220+x, 320+y);
        g.drawLine(380+x, 220+y, 480+x, 320+y);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
