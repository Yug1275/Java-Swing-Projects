import java.awt.event.*;
import javax.swing.*;

public class Keyboard {

    Keyboard(){
    JFrame f=new JFrame();
       
        f.setTitle("Keyboard Event Demo");

      
        f.setSize(400, 300);

       
        f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                System.out.println("Key Pressed: " + ke.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                System.out.println("Key Released: " + ke.getKeyChar());
            }

            @Override
            public void keyTyped(KeyEvent ke) {
                System.out.println("Key Typed: " + ke.getKeyChar());
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }


    public static void main(String[] args) {
        // Create an instance of the Lab10_3 class
        Keyboard obj =new Keyboard();
    }
}
