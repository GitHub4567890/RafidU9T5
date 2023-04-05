import java.util.ArrayList;

public class Carbaret {
    private String name;
    private ArrayList<Performer> performers;

    public Carbaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }


}
