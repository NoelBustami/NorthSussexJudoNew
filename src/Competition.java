
public class Competition extends TrainingPlan {

    private int numOfCompetition;

    public Competition() {
        // do nothing
    }

    public Competition(int numOfCompetition) {
        this.numOfCompetition = numOfCompetition;
    }

    @Override
    public double calculateFee() {
        return numOfCompetition * 22.0;
    }
}
