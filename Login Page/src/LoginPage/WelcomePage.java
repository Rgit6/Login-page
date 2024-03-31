package LoginPage;
import javax.swing.*;
import java.awt.Font;
public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel WP = new JLabel("Hello!");

    WelcomePage(){

        WP.setBounds(0,0,200,35);
        WP.setFont(new Font(null,Font.ITALIC,25));

        frame.add(WP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
