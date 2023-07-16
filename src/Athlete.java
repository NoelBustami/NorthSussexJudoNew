import java.util.ArrayList;
import java.util.List;

public class Athlete {

    private String name;
    private double weight;
    private WeightCategory weightCategory;
    private TrainingPlan trainingPlan;

    private static List<Athlete> athleteList = new ArrayList<>();

    public PrivateCoaching getPrivateCoaching() {
        return privateCoaching;
    }
    public void setPrivateCoaching(PrivateCoaching privateCoaching) {
        this.privateCoaching = privateCoaching;
    }
    private PrivateCoaching privateCoaching;

    private Competition competition = null;
    public Athlete() {
        // do nothing
    }
    public Athlete(String name, Double weight, WeightCategory weightCategory) {
        this.name = name;
        this.weight = weight;
        this.weightCategory = weightCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public WeightCategory getWeightCategory() {
        return weightCategory;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public void setWeightCategory(WeightCategory weightCategory) {
        this.weightCategory = weightCategory;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private List<String> myList;

    public static List<String> getTrainingPlans() {
        List<String> myList = new ArrayList<>();
        myList.add("1. Beginner");
        myList.add("2. Intermediate");
        myList.add("3. Elite");
        return myList;
    }

    public List<String> getPlanList() {
        return myList;
    }

    public static List<Athlete> getAthletes() {
        if (athleteList.isEmpty()) {
            athleteList.add(new Athlete("Abe", 86.0, new WeightCategory()));
            athleteList.add(new Athlete("John", 86.0, new WeightCategory()));
            athleteList.add(new Athlete("Casey", 55.0, new WeightCategory()));
            athleteList.add(new Athlete("Kim", 56.0, new WeightCategory()));
            athleteList.add(new Athlete("Mike", 78.0, new WeightCategory()));
            athleteList.add(new Athlete("Larry", 88.0, new WeightCategory()));
        }
        return athleteList;
    }
}
