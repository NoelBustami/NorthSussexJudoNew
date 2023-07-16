public class ElitePlan extends TrainingPlan {

    private String namePlan;
    private String numOfHours;
    private double cost;

    public String getNamePlan() {
        return namePlan;
    }
    public void setNamePlan(String namePlan) {
        this.namePlan = namePlan;
    }
    public String getNumOfHours() {
        return numOfHours;
    }
    public void setNumOfHours(String numOfHours) {
        this.numOfHours = numOfHours;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
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
