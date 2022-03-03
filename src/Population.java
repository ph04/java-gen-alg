import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Population {
    private int size;
    private List<Member> members;
    public String targetString;

    public Population(int size, String targetString, double newGenesProbability) {
        this.size = size;
        this.targetString = targetString;

        this.members = new ArrayList<Member>();

        for (int i = 0; i < this.size; i++) {
            this.members.add(new Member(targetString, newGenesProbability));
        }
    }

    public List<Member> getMembers() {
        return this.members;
    }

    public int runGenerations(boolean verbose) {
        Random rand = new Random();

        int genCounter = 0;

        while (!this.targetString.equals(this.getBestMember().toString())) {
            if (verbose) {
                System.out.print("Generation number: ");
                System.out.println(genCounter);
            }

            Collections.sort(this.members);

            int oldPopulationSize = this.members.size();

            this.members = this.members.subList(0, oldPopulationSize / 2);

            int newPopulationSize = this.members.size();
            
            for (int m = 0; m < oldPopulationSize - newPopulationSize; m++) {
                int firstRandInt = rand.nextInt(newPopulationSize);

                Member firstMember = this.members.get(firstRandInt);
                
                int secondRandInt = rand.nextInt(newPopulationSize);
                
                // avoid having two identical parents
                while (firstRandInt == secondRandInt) {
                    secondRandInt = rand.nextInt(newPopulationSize);
                }
                
                Member secondMember = this.members.get(secondRandInt);

                this.members.add(firstMember.breed(secondMember));
            }

            genCounter++;
        }

        return genCounter;
    }

    public Member getBestMember() {
        return this.members.get(0);
    }
}