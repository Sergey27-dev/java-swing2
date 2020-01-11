import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo{
    public int xcoord;
    public int ycoord;
    public int xcoordn;
    public int ycoordn;
    SwingDemo()
    {
        JFrame jfrm = new JFrame("My window");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("click");

        JButton MyButton = new JButton("Click");
        MyButton.setBounds(20,20, 70 , 30);


        MyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        MyButton.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                boolean move=false;

                xcoordn = xcoord;
                ycoordn = ycoord;
                xcoord=(int)(Math.random()*(jfrm.getBounds().width-70));
                ycoord=(int)(Math.random()*(jfrm.getBounds().height-60));

                MyButton.setBounds(xcoord,ycoord,70,30);
            }
        });
        jfrm.setLayout(null);
        jfrm.add(MyButton);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}

