import java.util.Map;
import java.util.Scanner;

public class FeeCalculator {
    private static void displayOptions(Map<Integer, String> options) {
        for (Map.Entry<Integer, String> entry : options.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    private static void addNewAthletes() {
        Athlete athlete = new Athlete();
        Scanner userInput = getScanner();

        // Prepare user name
        System.out.println("Please enter your name:");
        String userName = userInput.next();
        athlete.setName(userName);

        System.out.println("Please enter your weight in Kg");
        Scanner weightInput = new Scanner(System.in);
        double userWeight = weightInput.nextDouble();

        // prepare user weight category
        WeightCategory weight = new WeightCategory();
        weight.checkWeightCategory(userWeight);
        athlete.setWeightCategory(weight);

        System.out.println("Please enter your training plan of your choosing:");
        for (String plan : Athlete.getTrainingPlans()){
            System.out.println(plan);
        }

        // prepare training plan
        String trainingPlan = "";
        TrainingPlan newPlan = null;
        double totalCost = 0;
        trainingPlan = "";

        do {
            trainingPlan = userInput.next();
            if (trainingPlan.equalsIgnoreCase("beginner")) {
                TrainingPlan beginner = new BeginnerPlan();
                totalCost += beginner.calculateFee();
                newPlan = beginner;
            } else if (trainingPlan.equalsIgnoreCase("intermediate")) {
                TrainingPlan intermediate = new IntermediatePlan();
                totalCost += intermediate.calculateFee();
                newPlan = intermediate;
            } else if (trainingPlan.equalsIgnoreCase("elite")) {
                TrainingPlan elite = new ElitePlan();
                totalCost += elite.calculateFee();
                newPlan = elite;
            } else {
                System.out.println("Please enter the correct kind of Training Plan!");
            }
        } while (!trainingPlan.equalsIgnoreCase("beginner")
                && !trainingPlan.equalsIgnoreCase("intermediate")
                && !trainingPlan.equalsIgnoreCase("elite"));

        if (newPlan != null) {
            athlete.setTrainingPlan(newPlan);
        }

        Competition competition = null;

        if (trainingPlan.equalsIgnoreCase("intermediate")) {
            System.out.println("Would you like to join a competition? (Yes/No)");
            String interInput = userInput.next();
            if (interInput.equalsIgnoreCase("Yes")) {
                System.out.println("How many competition would you like to enter?");
                int numOfComp = userInput.nextInt();
                competition = new Competition(numOfComp);
                totalCost += competition.calculateFee();
                athlete.setCompetition(competition);
            }
        } else if (trainingPlan.equalsIgnoreCase("elite")) {
            System.out.println("Would you like to join a competition? (Yes/No)");
            String eliteInput = userInput.next();
            if (eliteInput.equalsIgnoreCase("Yes")) {
                System.out.println("How many competition would you like to enter?");
                int numOfComp = userInput.nextInt();
                competition = new Competition(numOfComp);
                totalCost += competition.calculateFee();
                athlete.setCompetition(competition);
            }
        } else {
            System.out.println("We are sorry, only Intermediate and Elite Plan members can join the competition");
        }

        System.out.println("Would you like to apply for Private Coaching? Only for $9.00 / hour");
        athlete.setCompetition(competition);

        System.out.println("Would you like to apply for Private Coaching? Only for $9.00 / hour (Yes or No)");

        String privateCoach;
        do {
            privateCoach = userInput.next();
            if (privateCoach.equalsIgnoreCase("Yes")) {
                System.out.println("How many private coaching do you need in a week? Max.5 Hours/week");
                int amountOfHours = userInput.nextInt();

                do {
                    if (amountOfHours > 5) {
                        System.out.println("We're sorry to interupt but, you can only apply for maximum 5 hours/week");
                        System.out.println("Please enter the correct amount (<5 hours)");
                        amountOfHours = userInput.nextInt();
                    }
                } while (amountOfHours > 5);
                PrivateCoaching privateCoaching = new PrivateCoaching(amountOfHours);
                totalCost += privateCoaching.calculateFee();
                athlete.setPrivateCoaching(privateCoaching);
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

        Athlete.getAthletes().add(athlete);
    }

    private static void displayAllAthletes() {
        for (Athlete athlete : Athlete.getAthletes()) {
            System.out.println("Name: " + athlete.getName() + "Weight: " + athlete.getWeight());
        }

    }

    private static void displayTrainingPlan() {
        for (String training : TrainingPlan.getTrainingList()){
            System.out.println(training);
        }
    }

    public static void main(String[] args) {

        do {
            Map<Integer, String> choose = Choices.getChoices();
            displayOptions(choose);

            System.out.println("Choose an number option: ");

            Scanner scanChoices = getScanner();
            int choices = scanChoices.nextInt();

            if (choices == 1) {
                addNewAthletes();
            } else if (choices == 2) {
                displayAllAthletes();
            } else {
                displayTrainingPlan();
            }
            System.out.println("Would you like to continue? (Yes/No");
        } while (getScanner().next().equalsIgnoreCase("Yes"));
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
