import javax.swing.JFrame;

public class Window extends JFrame {
    private int w, h, size;
    private Obstacle[] obstacles;

    public Window(String title, int w, int h, Obstacle[] obstacles, Goal goal, int size) {
        this.w = w;
        this.h = h;
        this.size = size;
        this.obstacles = obstacles;

        // these should not be options
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(this.w, this.h);
        
    }

    public void run() {
        // while (true) {
            this.update();
            this.draw();
        // }
    }

    private void update() {

    }

    private void draw() {
        for (Obstacle obstacle : this.obstacles) {
            this.add(obstacle);
        }
    }
}