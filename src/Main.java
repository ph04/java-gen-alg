public class Main {
    public static void main(String[] argv) {
        Population population = new Population(10, "pisellone");

        population.generations(10);

        Member bestMember = population.getBestMember();

        // System.out.println(population.getMembers());

        System.out.println(bestMember);
    }
}