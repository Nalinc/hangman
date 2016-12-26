/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman_final;

import java.awt.Dimension;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rachna Dutta
 */
public class Hangman_final {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        
/*        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
            }
        });*/
        new GameFrame();
/*
        JFrame frame = new JFrame("HMFrame");
    GamePanel Panel = new GamePanel();
    //Panel.add
    Panel.setVisible(true);
    frame.setResizable(false);
    frame.setSize(new Dimension(700, 500));
//    frame.setContentPane(new JLabel(new javax.swing.ImageIcon("/bg.png")));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(Panel);
    frame.setVisible(true);        
*/
    }
    
}
