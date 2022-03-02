public class Main {
    public static void main(String[] argv) {
        Obstacle obstacle1 = new Obstacle();

        Obstacle[] obstacles = new Obstacle[]{obstacle1};

        // Goal goal = new Goal();

        Window window = new Window("Genetic Algorithm", 500, 500, obstacles);//, goal, 40);
    }
}
