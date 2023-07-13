import java.util.ArrayList;
import java.util.List;

public class Athlete {

    private final List<String> myList;

    public Athlete() {
        myList = new ArrayList<>();
        myList.add("1. Beginner: $25.00/week");
        myList.add("2. Intermediate: $30.00/week");
        myList.add("3. Elite: $35.00/week");
    }

    public List<String> getPlanList() {
        return myList;
    }

}
