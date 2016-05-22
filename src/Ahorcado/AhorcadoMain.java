/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author La Formula
 */
public class AhorcadoMain {

    public static void main(String[] args) {
        
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 650));
        frame.setResizable(false);
        frame.setTitle("Animación Ahorcado");
        frame.add(new Ahorcado(0,25));
        frame.setVisible(true);
    }
}
