import javax.swing.*;
import java.awt.event.*;

public class MySwingApplication implements Runnable
{
    CanvasComponent paint = new CanvasComponent(100, 100);
    public void run()
    {
        JFrame jframe = new JFrame("Window");
        jframe.setSize(4000, 4000);       
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(paint);
        jframe.setVisible(true);
    }
    public static void main(String[] args)
    {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}