import java.util.ArrayList;
import java.util.List;

public abstract class TrainingPlan  {
    int numOfWeek = 4;
    public abstract double calculateFee();

    public static List<String> getTrainingList(){
        List<String> list = new ArrayList<>();
        list.add("Beginner $25.00/week (2 session)");
        list.add("Intermediate $30.00/week (3 session)");
        list.add("Elite $35.00/week (5 session)");
        return list;
    }


}
