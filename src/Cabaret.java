import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public boolean addPerformer(Performer a) {
        if (performers.indexOf(a) != -1) {
            return false;
        } else {
            performers.add(a);
            return true;
        }
    }

    public boolean removePerformer(Performer a) {
        if (performers.indexOf(a) != -1) {
            performers.remove(a);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public double averagePerformerAge() {
        double total = 0;
        for (Performer a : performers) {
            total += a.getAge();
        }
        return total / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> result = new ArrayList<Performer>();
        for (Performer a : performers) {
            if (a.getAge() >= age) {
                result.add(a);
            }
        }
        return result;
    }

    public void groupRehearsal() {
        for (Performer a : performers) {
            System.out.println("REHEARSAL CALL! " + a.getName());
            if (a instanceof Comedian) {
                ((Comedian) a).rehearse(false);
            } else {
                a.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer a : performers) {
            System.out.println("Welcome to the cabaret! Next act up... " + a.getName());
            if (a instanceof Dancer) {
                ((Dancer) a).pirouette(2);
                a.perform();
            } else {
                a.perform();
            }
        }
    }

}
