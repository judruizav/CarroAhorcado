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
    private int xMover;
    private int xMover2;
    private int xMoverPiernas;
    private int yMover;
    private int yMover2;
    private int yMoverPiernas;
    private Timer timer;
    
    public Ahorcado(int x, int y){
        this.x= x;
        this.xMover=x;
        this.xMover2=x;
        this.xMoverPiernas=x;
        this.y= y;
        this.yMover=y;
        this.yMover2=y;
        this.yMoverPiernas=y;
        this.timer = new Timer(50,this);
        this.timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        /*g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(20+x, 550+y, 220+x, 400+y, 150, 150);
        g.drawLine(120+x, 50+y, 120+x, 550+y);
        g.drawLine(120+x, 50+y, 350+x, 50+y);
        g.drawLine(350+x, 50+y, 350+xMover, 130+y);
        g.drawOval(300+xMover, 130+y, 100, 100);
       //Torso
        g.drawLine(350+xMover, 230+y, 350+xMover2, 400+yMover);
       //Piernas
        //Pierna izq 
        g.drawLine(350+xMover2, 400+yMover, 250+xMoverPiernas, 500+yMover);
        //Pierna der
        g.drawLine(350+xMover2, 400+yMover, 450+xMover2, 500+yMoverPiernas);
       //Brazos
        g.drawLine(320+xMover, 220+y, 220+xMover2, 320+yMover2);
        g.drawLine(380+xMover, 220+y, 480+xMover, 320+yMover);*/
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(20+x, 550+y, 220+x, 400+y, 150, 150);
        g.drawLine(120+x, 50+y, 120+x, 550+y);
        g.drawLine(120+x, 50+y, 350+x, 50+y);
        g.drawLine(350+x, 50+y, 350+x, 130+y);
        g.drawOval(300+x, 130+y, 100, 100);
       //Torso
        g.drawLine(350+x, 230+y, 350+x, 400+y);
       //Piernas
        //Pierna izq 
        g.drawLine(350+x, 400+y, 250+x, 500+y);
        //Pierna der
        g.drawLine(350+x, 400+y, 450+x, 500+y);
       //Brazos
        g.drawLine(320+x, 220+y, 220+x, 320+y);
        g.drawLine(380+x, 220+y, 480+x, 320+y);
        
        //+30y Grados dibujo
        g.setColor(Color.DARK_GRAY);
        //Soga
        g.drawLine(350+x, 50+y, 398+x, 128+y);
        //Face
        g.drawOval(370+x, 120+y, 100, 100);
       //Torso
        g.drawLine(450+x, 210+y, 540+x, 350+y);
       //Piernas
        //Pierna izq 
        g.drawLine(540+x, 350+y, 500+x, 490+y);
        //Pierna der
        g.drawLine(540+x, 350+y, 450+x, 500+y);
       //Brazo Izquierdo
        g.drawLine(420+x, 220+y, 395+x, 355+y);
        //Brazo Derecho
        g.drawLine(470+x, 180+y, 600+x, 225+y);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(xMover){
            
        }
        
        if(xMover<20){
          this.xMover+=1;
          this.xMover2+=3;
          this.xMoverPiernas+=4;
          this.yMover-=1;
          this.yMover2+=1;
          this.yMoverPiernas-=2;
        }
        if(xMover>(-40)){
          this.xMover-=2;
          this.xMover2-=2;
          this.yMover-=2;
          this.yMover2-=2;
          this.yMoverPiernas-=3;
        }
        repaint();
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
