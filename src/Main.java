public class Main {
    public static void main(String[] argv) {
        Obstacle obstacle1 = new Obstacle(40, 40, 60, 60);

        Obstacle[] obstacles = new Obstacle[]{obstacle1};

        Goal goal = new Goal(30, 30);

        Window window = new Window("Genetic Algorithm", 500, 500, obstacles, goal, 40);

        // window.draw();
        window.run();
    }
}