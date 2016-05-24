
package Carro;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author La Formula
 */

public class CarroMain {
    
    public static void main(String[] args) {
        
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(657, 200));
        frame.setResizable(false);
        frame.setTitle("Animación carro");
        frame.add(new Carro(0,25));
        frame.setVisible(true);
    }    
}
