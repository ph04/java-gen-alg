import java.util.ArrayList;
import java.util.Random;

public class Member implements Comparable<Member> {
    public ArrayList<Character> string;
    public String targetString;
    private int fitnessScore;
    private double newGenesProbability;

    public Member(String targetString, double newGenesProbability) {
        Random rand = new Random();

        this.string = new ArrayList<Character>();
        this.targetString = targetString;

        this.fitnessScore = 0;
        this.newGenesProbability = newGenesProbability;

        for (int i = 0; i < targetString.length(); i++) {
            string.add((char) (rand.nextInt(95) + 32)); // every number from 32 to 126
        }
    }

    private void evaluateFitnessScore() {
        this.fitnessScore = 0;

        for (int i = 0; i < this.targetString.length(); i++) {
            if ((char) this.string.get(i) == this.targetString.charAt(i)) {
                this.fitnessScore++;
            }
        }
    }

    public int getFitnessScore() {
        return this.fitnessScore;
    }

    public Member breed(Member otherMember) {
        Member child = new Member(this.targetString, this.newGenesProbability);

        Random rand = new Random();

        for (int i = 0; i < child.targetString.length(); i++) {
            if (rand.nextDouble(1.0) < this.newGenesProbability) {
                char randomCharacter = (char) (rand.nextInt(95) + 32); // every number from 32 to 126

                child.string.set(i, randomCharacter);
            } else {
                Character newCharacter = (rand.nextInt(1) == 0) ? this.string.get(i) : otherMember.string.get(i);
    
                child.string.set(i, newCharacter);
            }
        }
        
        return child;
    }

    @Override
    public int compareTo(Member otherMember) {
        otherMember.evaluateFitnessScore();
        this.evaluateFitnessScore();

        return otherMember.getFitnessScore() - this.getFitnessScore(); // descending order
    }

    @Override
    public String toString() {
        String output = "";

        for (char character : this.string) {
            output += character;
        }

        return output;
    }
}