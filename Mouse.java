import java.awt.event.*;
import javax.swing.*;

public class Mouse extends JFrame {


    public Mouse() {
        JFrame f = new JFrame();

        f.setTitle("Mouse Event Demo");
        f.setSize(400, 300);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("Mouse Clicked at: (" + me.getX() + ", " + me.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                System.out.println("Mouse Entered the window.");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                System.out.println("Mouse Exited the window.");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                System.out.println("Mouse Pressed at: (" + me.getX() + ", " + me.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                System.out.println("Mouse Released at: (" + me.getX() + ", " + me.getY() + ")");
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                System.out.println("Mouse Dragged at: (" + me.getX() + ", " + me.getY() + ")");
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
     
        Mouse L = new Mouse();
    }
}
