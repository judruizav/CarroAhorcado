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
 * @author Juanki el paspi
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
        g.drawString("Timer= " + this.delay, 75, 33); 
         g.drawString("P para pausar", 75, 43); 
         g.drawString("S para reanudar", 75, 53); 
switch(referenciaPosicion){
      case 0: 
//caso  REfletttttZZZion 1 muleco izquierda mas arriba 
       g.setColor(Color.YELLOW);
        //Soga
        g.drawLine(550+x, 50+y, 465+x, 95+y);
        //Face
        g.drawOval(370+x, 70+y, 100, 100);
       //Torso
        g.drawLine(380+x, 150+y, 240+x, 230+y);
       //Piernas
        //Pierna izq 
        g.drawLine(240+x, 230+y, 200+x, 370+y);
        //Pierna der
        g.drawLine(240+x, 230+y, 100+x, 200+y);
       //Brazo Izquierdo
        g.drawLine(405+x, 165+y, 370+x, 300+y);
        //Brazo Derecho
        g.drawLine(370+x, 120+y, 235+x, 95+y);
        break;
    case 1:
        //caso  REFLETZZION -30y Grados dibujo
        g.setColor(Color.GREEN);
        //Soga
        g.drawLine(550+x, 50+y, 510+x, 130+y);
        //Face
        g.drawOval(430+x, 120+y, 100, 100);
       //Torso
        g.drawLine(450+x, 210+y, 370+x, 350+y);
       //Piernas
        //Pierna izq 
        g.drawLine(370+x, 350+y, 400+x, 490+y);
        //Pierna der
        g.drawLine(370+x, 350+y, 230+x, 390+y);
       //Brazo Izquierdo
        g.drawLine(480+x, 220+y,510 +x, 355+y);
        //Brazo Derecho
        g.drawLine(430+x, 180+y, 300+x, 225+y);
        break;
    case 2:
    // Caso  mitad
        g.setColor(Color.DARK_GRAY);   
        g.drawLine(550+x, 50+y, 550+x, 130+y);
        g.drawOval(500+x, 130+y, 100, 100);
       //Torso
        g.drawLine(550+x, 230+y, 550+x, 400+y);
       //Piernas
        //Pierna izq 
        g.drawLine(550+x, 400+y, 450+x, 500+y);
        //Pierna der
        g.drawLine(550+x, 400+y, 650+x, 500+y);
       //Brazos
        g.drawLine(520+x, 220+y, 420+x, 320+y);
        g.drawLine(580+x, 220+y, 680+x, 320+y);
        
        break;
                
    case 3: 
        //Caso +30y Grados dibujo
        g.setColor(Color.BLUE);
        //Soga
        g.drawLine(550+x, 50+y, 598+x, 128+y);
        //Face
        g.drawOval(570+x, 120+y, 100, 100);
       //Torso
        g.drawLine(650+x, 210+y, 740+x, 350+y);
       //Piernas
        //Pierna izq 
        g.drawLine(740+x, 350+y, 700+x, 490+y);
        //Pierna der
        g.drawLine(740+x, 350+y, 870+x, 390+y);
       //Brazo Izquierdo
        g.drawLine(620+x, 220+y, 595+x, 355+y);
        //Brazo Derecho
        g.drawLine(670+x, 180+y, 800+x, 225+y);
        break;
    case 4:
        //caso  +45y Grados dibujo
        g.setColor(Color.RED);
        //Soga
        g.drawLine(550+x, 50+y, 625+x, 95+y);
        //Face
        g.drawOval(620+x, 70+y, 100, 100);
       //Torso
        g.drawLine(710+x, 150+y, 850+x, 230+y);
       //Piernas
        //Pierna izq 
        g.drawLine(850+x, 230+y, 890+x, 370+y);
        //Pierna der
        g.drawLine(850+x, 230+y, 990+x, 200+y);
       //Brazo Izquierdo
        g.drawLine(685+x, 165+y, 720+x, 300+y);
        //Brazo Derecho
        g.drawLine(720+x, 120+y, 855+x, 95+y);
        break;
  
}

switch(referenciaPosicionVuelta){
      case 0: 
//caso  REfletttttZZZion 1 muleco izquierda mas arriba 
       g.setColor(Color.YELLOW);
        //Soga
        g.drawLine(550+x, 50+y, 465+x, 95+y);
        //Face
        g.drawOval(370+x, 70+y, 100, 100);
       //Torso
        g.drawLine(380+x, 150+y, 240+x, 230+y);
       //Piernas
        //Pierna izq 
        g.drawLine(240+x, 230+y, 200+x, 370+y);
        //Pierna der
        g.drawLine(240+x, 230+y, 100+x, 200+y);
       //Brazo Izquierdo
        g.drawLine(405+x, 165+y, 370+x, 300+y);
        //Brazo Derecho
        g.drawLine(370+x, 120+y, 235+x, 95+y);
        break;
    case 1:
        //caso  REFLETZZION -30y Grados dibujo
        g.setColor(Color.GREEN);
        //Soga
        g.drawLine(550+x, 50+y, 510+x, 130+y);
        //Face
        g.drawOval(430+x, 120+y, 100, 100);
       //Torso
        g.drawLine(450+x, 210+y, 370+x, 350+y);
       //Piernas
        //Pierna izq 
        g.drawLine(370+x, 350+y, 400+x, 490+y);
        //Pierna der
        g.drawLine(370+x, 350+y, 230+x, 390+y);
       //Brazo Izquierdo
        g.drawLine(480+x, 220+y,510 +x, 355+y);
        //Brazo Derecho
        g.drawLine(430+x, 180+y, 300+x, 225+y);
        break;
    case 2:
    // Caso  mitad
        g.setColor(Color.DARK_GRAY);   
        g.drawLine(550+x, 50+y, 550+x, 130+y);
        g.drawOval(500+x, 130+y, 100, 100);
       //Torso
        g.drawLine(550+x, 230+y, 550+x, 400+y);
       //Piernas
        //Pierna izq 
        g.drawLine(550+x, 400+y, 450+x, 500+y);
        //Pierna der
        g.drawLine(550+x, 400+y, 650+x, 500+y);
       //Brazos
        g.drawLine(520+x, 220+y, 420+x, 320+y);
        g.drawLine(580+x, 220+y, 680+x, 320+y);
        
        break;
                
    case 3: 
        //Caso +30y Grados dibujo
        g.setColor(Color.DARK_GRAY);
        //Soga
        g.drawLine(550+x, 50+y, 598+x, 128+y);
        g.setColor(Color.BLUE);
        //Face
        g.drawOval(570+x, 120+y, 100, 100);
       //Torso
        g.drawLine(650+x, 210+y, 740+x, 350+y);
       //Piernas
        //Pierna izq 
        g.drawLine(740+x, 350+y, 700+x, 490+y);
        //Pierna der
        g.drawLine(740+x, 350+y, 870+x, 390+y);
       //Brazo Izquierdo
        g.drawLine(620+x, 220+y, 595+x, 355+y);
        //Brazo Derecho
        g.drawLine(670+x, 180+y, 800+x, 225+y);
        break;
    case 4:
        //caso  +45y Grados dibujo
        g.setColor(Color.DARK_GRAY);
       
        //Soga
        g.drawLine(550+x, 50+y, 625+x, 95+y);
         g.setColor(Color.RED);
        //Face
        g.drawOval(620+x, 70+y, 100, 100);
       //Torso
        g.drawLine(710+x, 150+y, 850+x, 230+y);
       //Piernas
        //Pierna izq 
        g.drawLine(850+x, 230+y, 890+x, 370+y);
        //Pierna der
        g.drawLine(850+x, 230+y, 990+x, 200+y);
       //Brazo Izquierdo
        g.drawLine(685+x, 165+y, 720+x, 300+y);
        //Brazo Derecho
        g.drawLine(720+x, 120+y, 855+x, 95+y);
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
            case KeyEvent.VK_UP: this.timer.setDelay(delay-=50); break;
            case KeyEvent.VK_DOWN: this.timer.setDelay(delay+=50); break;
            case KeyEvent.VK_P: this.timer.stop(); break;
            case KeyEvent.VK_S: this.timer.start(); break;            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
