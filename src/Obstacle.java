import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Obstacle extends JPanel {
    public int x1, y1, x2, y2;
    public Color color;

    public Obstacle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(255, 0, 144));
        g.fillRect(this.x1, this.y1, this.x2, this.y2);
    }
}