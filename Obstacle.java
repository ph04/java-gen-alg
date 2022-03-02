import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Obstacle extends JPanel {
    public Obstacle() {

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(255, 130, 255));
        g.fillRect(10, 10, 100, 100);
    }
}