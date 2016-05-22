/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Julian
 */
public class CarroMain {

    /**
     * @param args the command line arguments
     */
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
