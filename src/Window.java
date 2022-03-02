import javax.swing.JFrame;

public class Window extends JFrame {
    public Window(String title, int w, int h, Obstacle[] obstacles) {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        for (Obstacle obstacle : obstacles) {
            this.add(obstacle);
        }

        this.setSize(w, h);
    }
}
