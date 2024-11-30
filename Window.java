import java.awt.event.*;
import javax.swing.JFrame;

public class Window {

    public Window() {
        JFrame f=new JFrame();
        
        f.setTitle("Window Event Demo");
        f.setSize(400, 300);

        f.addWindowListener(new WindowAdapter() {
    
            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Window Closing");
              
                System.exit(0);
            }

           @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("Window Closed");
            }

        
            @Override
            public void windowIconified(WindowEvent we) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                System.out.println("Window Deactivated");
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Window l =new Window();
    }
}

