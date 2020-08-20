
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 
public class ShowPNG extends JFrame {

    public ShowPNG(String argx) {
        if (argx == null) {
            argx = "a.png";
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 250);
        JPanel panel = new JPanel();
        //panel.setSize(500,640);
        panel.setBackground(Color.CYAN);
        ImageIcon icon = new ImageIcon(argx);
        JLabel label = new JLabel();
        label.setIcon(icon);
        panel.add(label);
        this.getContentPane().add(panel);
    }
}
