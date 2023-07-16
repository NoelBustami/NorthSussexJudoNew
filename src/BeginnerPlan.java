public class BeginnerPlan extends TrainingPlan {
    private String namePlan;
    private final double cost;

    public BeginnerPlan(){
        this.cost = 25;
        int numOfSession = 2;
    }
    @Override
    public double calculateFee() {
        return numOfWeek * this.cost;
    }

    @Override
    public String toString() {
        return this.namePlan;
    }
}
