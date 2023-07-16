import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Choices {

    List<Athlete> athletes;

    public Choices() {
        // do nothing
    }

    public Choices(List<Athlete> athletes) {
        this.athletes = athletes;
    }


    public static Map<Integer, String> getChoices() {
        Map<Integer, String> choices = new HashMap<>();
        choices.put(1, "Add New User");
        choices.put(2, "Check Current Athletes");
        choices.put(3, "Training Plan Price List");
        return choices;
    }


    public void processOption(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Option A logic goes here");
                break;
            case 2:
                System.out.println("Option B logic goes here");
                break;
            case 3:
                System.out.println("Option C logic goes here");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }


}
