public class Main {
    public static void main(String[] argv) {
        Population population = new Population(100, "ho il pisello veramente minuscolo", 0.05);

        System.out.println(population.runGenerations(true));

        System.out.println(population.getBestMember());
    }
}