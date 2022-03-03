import java.util.ArrayList;
import java.util.Collections;

public class Population {
    private int size;
    private ArrayList<Member> members;
    public String targetString;

    public Population(int size, String targetString) {
        this.size = size;
        this.targetString = targetString;

        this.members = new ArrayList<Member>();

        for (int i = 0; i < this.size; i++) {
            this.members.add(new Member(targetString));
        }
    }

    public ArrayList<Member> getMembers() {
        return this.members;
    }

    public void generations(int iterations) {
        Collections.sort(this.members);
    }
    
    public Member getBestMember() {
        return this.members.get(0);
    }
}