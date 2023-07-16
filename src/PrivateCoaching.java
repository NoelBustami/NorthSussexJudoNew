
public class PrivateCoaching extends TrainingPlan{

    private String name;
    private double cost;
    private int amountOfHours;

    public PrivateCoaching(int amountOfHours){
        this.amountOfHours = amountOfHours;
    }

    @Override
    public double calculateFee() {
        return this.amountOfHours * 9.00;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
