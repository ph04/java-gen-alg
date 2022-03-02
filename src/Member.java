import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Member {
    public ArrayList<Character> string;

    public Member(int stringLength) {
        Random rand = new Random();

        this.string = new ArrayList<Character>();

        for (int i = 0; i < stringLength; i++) {
            string.add((char) (rand.nextInt(94) + 32)); // every number from 32 to 126
        }
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