
package Ahorcado;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author La Formula
 */

public class Ahorcado extends JPanel implements ActionListener, KeyListener{
    private int x;
    private int y;
    private Timer timer;
    private int referenciaPosicion= 0;
    private int referenciaPosicionVuelta= -1;
    private int delay= 600;
    
    public Ahorcado(int x, int y){
        this.x= x;
        this.y= y;
        this.timer = new Timer(500,this);
        this.timer.setInitialDelay(600);
        this.timer.start();
        this.setFocusable(true);
        this.addKeyListener(this);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(220+x, 550+y, 420+x, 400+y, 150, 150);
        g.drawLine(320+x, 50+y, 320+x, 550+y);
        g.drawLine(320+x, 50+y, 550+x, 50+y);
        g.drawString("P para pausar", 75, 43); 
        g.drawString("S para reanudar", 75, 53); 
        
        switch(referenciaPosicion){
            //Hangman enumerado de izquierda a derecha de 0 a 4
            case 0: 
                //Hangman 0
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 465+x, 95+y);
                g.setColor(Color.BLUE);
                //Cabeza
                g.drawOval(370+x, 70+y, 100, 100);
                //Torso
                g.drawLine(380+x, 150+y, 240+x, 230+y);
                //Brazo Izquierdo
                g.drawLine(405+x, 165+y, 370+x, 300+y);
                //Brazo Derecho
                g.drawLine(370+x, 120+y, 235+x, 95+y);
                //Pierna Izquierda
                g.drawLine(240+x, 230+y, 200+x, 370+y);
                //Pierna Derecha
                g.drawLine(240+x, 230+y, 100+x, 200+y);
            break;
            case 1:
                //Hangman 1
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 510+x, 130+y);
                g.setColor(Color.RED);
                //Cabeza
                g.drawOval(430+x, 120+y, 100, 100);
                //Torso
                g.drawLine(450+x, 210+y, 370+x, 350+y);
                //Brazo Izquierdo
                g.drawLine(480+x, 220+y,510 +x, 355+y);
                //Brazo Derecho
                g.drawLine(430+x, 180+y, 300+x, 225+y);
                //Pierna Izquierda
                g.drawLine(370+x, 350+y, 400+x, 490+y);
                //Pierna Derecha
                g.drawLine(370+x, 350+y, 230+x, 390+y);
            break;
            case 2:
                //Hangman 2
                g.setColor(Color.BLACK);   
                //Soga
                g.drawLine(550+x, 50+y, 550+x, 130+y);
                g.setColor(Color.MAGENTA);
                //Cabeza
                g.drawOval(500+x, 130+y, 100, 100);
                //Torso
                g.drawLine(550+x, 230+y, 550+x, 400+y);
                //Brazo Izquierdo
                g.drawLine(520+x, 220+y, 420+x, 320+y);
                //Brazo Derecho
                g.drawLine(580+x, 220+y, 680+x, 320+y);
                //Pierna Izquierda
                g.drawLine(550+x, 400+y, 450+x, 500+y);
                //Pierna Derecha
                g.drawLine(550+x, 400+y, 650+x, 500+y);
            break;
            case 3: 
                //Hangman 3
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 598+x, 128+y);
                g.setColor(Color.ORANGE);
                //Cabeza
                g.drawOval(570+x, 120+y, 100, 100);
                //Torso
                g.drawLine(650+x, 210+y, 740+x, 350+y);
                //Brazo Izquierdo
                g.drawLine(620+x, 220+y, 595+x, 355+y);
                //Brazo Derecho
                g.drawLine(670+x, 180+y, 800+x, 225+y);
                //Pierna Izquierda
                g.drawLine(740+x, 350+y, 700+x, 490+y);
                //Pierna Derecha
                g.drawLine(740+x, 350+y, 870+x, 390+y);
            break;
            case 4:
                //Hangman 4
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 625+x, 95+y);
                g.setColor(Color.GREEN);
                //Cabeza
                g.drawOval(620+x, 70+y, 100, 100);
                //Torso
                g.drawLine(710+x, 150+y, 850+x, 230+y);
                //Brazo Izquierdo
                g.drawLine(685+x, 165+y, 720+x, 300+y);
                //Brazo Derecho
                g.drawLine(720+x, 120+y, 855+x, 95+y);
                //Pierna Izquierda 
                g.drawLine(850+x, 230+y, 890+x, 370+y);
                //Pierna Derecha
                g.drawLine(850+x, 230+y, 990+x, 200+y);
            break;
        }
        switch(referenciaPosicionVuelta){
            //Hangman enumerado de izquierda a derecha de 0 a 4
            case 0: 
                //Hangman 0
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 465+x, 95+y);
                g.setColor(Color.BLUE);
                //Cabeza
                g.drawOval(370+x, 70+y, 100, 100);
                //Torso
                g.drawLine(380+x, 150+y, 240+x, 230+y);
                //Brazo Izquierdo
                g.drawLine(405+x, 165+y, 370+x, 300+y);
                //Brazo Derecho
                g.drawLine(370+x, 120+y, 235+x, 95+y);
                //Pierna Izquierda
                g.drawLine(240+x, 230+y, 200+x, 370+y);
                //Pierna Derecha
                g.drawLine(240+x, 230+y, 100+x, 200+y);
            break;
            case 1:
                //Hangman 1
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 510+x, 130+y);
                g.setColor(Color.RED);
                //Cabeza
                g.drawOval(430+x, 120+y, 100, 100);
                //Torso
                g.drawLine(450+x, 210+y, 370+x, 350+y);
                //Brazo Izquierdo
                g.drawLine(480+x, 220+y,510 +x, 355+y);
                //Brazo Derecho
                g.drawLine(430+x, 180+y, 300+x, 225+y);
                //Pierna Izquierda
                g.drawLine(370+x, 350+y, 400+x, 490+y);
                //Pierna Derecha
                g.drawLine(370+x, 350+y, 230+x, 390+y);
            break;
            case 2:
                //Hangman 2
                g.setColor(Color.BLACK);   
                //Soga
                g.drawLine(550+x, 50+y, 550+x, 130+y);
                g.setColor(Color.MAGENTA);
                //Cabeza
                g.drawOval(500+x, 130+y, 100, 100);
                //Torso
                g.drawLine(550+x, 230+y, 550+x, 400+y);
                //Brazo Izquierdo
                g.drawLine(520+x, 220+y, 420+x, 320+y);
                //Brazo Derecho
                g.drawLine(580+x, 220+y, 680+x, 320+y);
                //Pierna Izquierda
                g.drawLine(550+x, 400+y, 450+x, 500+y);
                //Pierna Derecha
                g.drawLine(550+x, 400+y, 650+x, 500+y);
            break;
            case 3: 
                //Hangman 3
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 598+x, 128+y);
                g.setColor(Color.ORANGE);
                //Cabeza
                g.drawOval(570+x, 120+y, 100, 100);
                //Torso
                g.drawLine(650+x, 210+y, 740+x, 350+y);
                //Brazo Izquierdo
                g.drawLine(620+x, 220+y, 595+x, 355+y);
                //Brazo Derecho
                g.drawLine(670+x, 180+y, 800+x, 225+y);
                //Pierna Izquierda
                g.drawLine(740+x, 350+y, 700+x, 490+y);
                //Pierna Derecha
                g.drawLine(740+x, 350+y, 870+x, 390+y);
            break;
            case 4:
                //Hangman 4
                g.setColor(Color.BLACK);
                //Soga
                g.drawLine(550+x, 50+y, 625+x, 95+y);
                g.setColor(Color.GREEN);
                //Cabeza
                g.drawOval(620+x, 70+y, 100, 100);
                //Torso
                g.drawLine(710+x, 150+y, 850+x, 230+y);
                //Brazo Izquierdo
                g.drawLine(685+x, 165+y, 720+x, 300+y);
                //Brazo Derecho
                g.drawLine(720+x, 120+y, 855+x, 95+y);
                //Pierna Izquierda 
                g.drawLine(850+x, 230+y, 890+x, 370+y);
                //Pierna Derecha
                g.drawLine(850+x, 230+y, 990+x, 200+y);
            break;
        }  
    }   
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(referenciaPosicion<=6){
            referenciaPosicion++;  
        }
        if(referenciaPosicion==5){
            referenciaPosicionVuelta=4;
        }
        if(referenciaPosicion>0&&referenciaPosicionVuelta<=4){
            referenciaPosicionVuelta--;  
        }
        if(referenciaPosicionVuelta==0){
            referenciaPosicion=0;
        }
        repaint();
    }
        
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case KeyEvent.VK_UP: this.timer.setDelay(delay-=25); break;
            case KeyEvent.VK_DOWN: this.timer.setDelay(delay+=25); break;
            case KeyEvent.VK_P: this.timer.stop(); break;
            case KeyEvent.VK_S: this.timer.start(); break;            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
