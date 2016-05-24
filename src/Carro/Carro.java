
package Carro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author La Formula
 */

public class Carro extends JPanel implements ActionListener, KeyListener{
    private Timer timer;
    private int x=0;
    private int y=0;
    private int velocidad;
    
    public Carro(int x, int y){
        this.x= x;
        this.y= y;
        this.velocidad=2;
        this.timer= new Timer(20,this);
        this.timer.start();
        this.addKeyListener(this);
        this.setFocusable(true);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(10+x, 60+y, 150, 25);
        g.setColor(Color.BLACK);
        g.fillOval(25+x, 82+y, 35, 35);
        g.fillOval(108+x, 82+y, 35, 35);
        Polygon poligono = new Polygon();
        poligono.addPoint(30+x,60+y);
        poligono.addPoint(60+x,30+y);
        poligono.addPoint(110+x,30+y);
        poligono.addPoint(140+x,60+y);
        g.drawPolygon(poligono);
        g.setColor(Color.BLACK);
        g.fillPolygon(poligono);
        g.setFont(new Font("Calibri", Font.BOLD, 14));
        g.drawString("Flecha arriba:Aumentar velocidad    Flecha Abajo:Disminuir velocidad", 0, 15);
        g.drawString("Enter:Pausar animación  Liberar enter: Continuar animación", 0, 35);
        g.drawString("Velocidad=" + this.velocidad, 0, 55);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(this.velocidad<0){
            this.velocidad=0;
        }
        if(x<475){
            this.x+=this.velocidad;    
        }else{
            this.x=0;    
        }
        repaint();            
    }    

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent e){
        switch (e.getKeyCode()) {   
            case KeyEvent.VK_UP: this.velocidad+=2; break;
            case KeyEvent.VK_DOWN: this.velocidad-=2; break;
            case KeyEvent.VK_ENTER: this.timer.stop(); break; 
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        switch (ke.getKeyCode()){
            case KeyEvent.VK_ENTER: this.timer.start(); break;
        }
    }
}
