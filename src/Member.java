import java.util.ArrayList;
import java.util.Random;

public class Member implements Comparable<Member> {
    public ArrayList<Character> string;
    public String targetString;
    private int fitnessScore;

    public Member(String targetString) {
        Random rand = new Random();

        this.string = new ArrayList<Character>();
        this.targetString = targetString;

        this.fitnessScore = 0;

        for (int i = 0; i < targetString.length(); i++) {
            // string.add((char) (rand.nextInt(94) + 32)); // every number from 32 to 126
            string.add((char) (rand.nextInt(122 - 97) + 97)); // every number from 97 to 122
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

    @Override
    public int compareTo(Member otherMember) {
        otherMember.evaluateFitnessScore();
        this.evaluateFitnessScore();

        return otherMember.getFitnessScore() - this.getFitnessScore();
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