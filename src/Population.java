import java.util.ArrayList;

public class Population {
    private int size;
    private ArrayList<Member> members;
    public String target;

    public Population(int size, String target) {
        this.size = size;
        this.target = target;

        this.members = new ArrayList<Member>();

        for (int i = 0; i < this.size; i++) {
            this.members.add(new Member(target.length()));
        }
    }

    public void generations(int iterations) {

    }
    
    public Member getBestMember() {
        return this.members.get(1);
    }
}