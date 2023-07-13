import java.util.List;
import java.util.Scanner;

public class FeeCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Scanner userNama = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = userNama.next();

        System.out.println("Please enter your training plan of your choosing:");
        Athlete listObject = new Athlete();
        List<String> list = listObject.getPlanList();

        for (String element : list) {
            System.out.println(element);
        }

        String trainingPlan = "";
        double totalCost = 0;

        trainingPlan = "";

        do {
            trainingPlan = userInput.next();
            if (trainingPlan.equalsIgnoreCase("beginner")) {
                TrainingPlan beginner = new BeginnerPlan();
                totalCost += beginner.calculateFee();
            } else if (trainingPlan.equalsIgnoreCase("intermediate")) {
                TrainingPlan intermediate = new IntermediatePlan();
                totalCost += intermediate.calculateFee();
            } else if (trainingPlan.equalsIgnoreCase("elite")) {
                TrainingPlan elite = new ElitePlan();
                totalCost += elite.calculateFee();
            } else {
                System.out.println("Please enter the correct kind of Training Plan!");
            }
        } while (!trainingPlan.equalsIgnoreCase("beginner")
                && !trainingPlan.equalsIgnoreCase("intermediate")
                && !trainingPlan.equalsIgnoreCase("elite"));

        WeightCategory weight = new WeightCategory();

        Competition numOfCompetition;

        if (trainingPlan.equalsIgnoreCase("intermediate")) {
            numOfCompetition = new Competition();
            totalCost += numOfCompetition.calculateFee();
        } else if (trainingPlan.equalsIgnoreCase("elite")) {
            numOfCompetition = new Competition();
            totalCost += numOfCompetition.calculateFee();
        } else {
            System.out.println("We are sorry, only Intermediate and Elite Plan members can join the competition");
        }

        System.out.println("Would you like to apply for Private Coaching? Only for $9.00 / hour");

        String privateCoach;
        do {
            privateCoach = userInput.next();
            if (privateCoach.equalsIgnoreCase("Yes")) {
                TrainingPlan privateCoaching = new PrivateCoaching();
                totalCost += privateCoaching.calculateFee();
                System.out.println("Congratulation, your plan is set!");
                System.out.println("Name: " + userName);
                System.out.println("Weight: " + weight.getWeight());
                System.out.println("Weight Category: " + weight.getWeightCategory());
                System.out.println("Training Plan: " + trainingPlan);
                System.out.println("Total Cost: " + totalCost);
            } else if (privateCoach.equalsIgnoreCase("no")) {
                System.out.println("Congratulation, your plan is set!");
                System.out.println("Name: " + userName);
                System.out.println("Weight: " + weight.getWeight());
                System.out.println("Weight Category: " + weight.getWeightCategory());
                System.out.println("Training Plan: " + trainingPlan);
                System.out.println("Total Cost: " + totalCost);
            } else {
                System.out.println("Please enter the correct answer");
            }
        } while (!privateCoach.equalsIgnoreCase("yes") && !privateCoach.equalsIgnoreCase("no"));

    }
}
