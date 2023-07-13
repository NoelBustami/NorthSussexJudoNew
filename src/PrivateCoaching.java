import java.util.Scanner;

public class PrivateCoaching implements TrainingPlan{

    private String name;
    private double cost;
    private int amountOfHours;
    Scanner privateCoach = new Scanner(System.in);

    public PrivateCoaching(){
        System.out.println("How much private coaching do you need in a week? Max.5 Hours/week");
        this.amountOfHours = privateCoach.nextInt();

        do {
            if (this.amountOfHours > 5){
                System.out.println("We're sorry to interupt but, you can only apply for maximum 5 hours/week");
                System.out.println("Please enter the correct amount (<5 hours)");
                this.amountOfHours = privateCoach.nextInt();
            }
        } while (this.amountOfHours > 5);

        this.cost = 9.00;
    }

    @Override
    public double calculateFee() {
        return this.amountOfHours * this.cost;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
