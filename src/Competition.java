import java.util.Scanner;

public class Competition implements TrainingPlan{

    private String name;
    private double cost;
    private int amount;

    public Competition(){
        System.out.println("How many competition you want to enter?");
        Scanner compete = new Scanner(System.in);
        this.amount = compete.nextInt();
        this.cost = 22.00;
    }

    @Override
    public double calculateFee() {
        return this.amount * this.cost;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
