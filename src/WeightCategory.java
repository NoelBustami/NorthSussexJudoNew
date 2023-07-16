
public class WeightCategory {

    double heavyWeight = 100;
    double lightHeavyWeight = 90;
    double middleWeight = 81;
    double lightMiddleWeight = 73;
    double lightWeight = 66;

    private double weight;
    private String weightCategory;

    public String getAddWeight() {
        return "Based on your weight, you need to add ";
    }

    public String getLooseWeight() {
        return "Based on your weight, you need to loose ";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeightCategory() {
        return weightCategory;
    }

    public void setWeightCategory(String weightCategory) {
        this.weightCategory = weightCategory;
    }

    public void checkWeightCategory(double userWeight) {
        String weightCategory;

        if (userWeight > heavyWeight) {
            weightCategory = "Heavyweight";
        } else if (userWeight > lightHeavyWeight) {
            weightCategory = "Light-Heavyweight";
        } else if (userWeight > middleWeight) {
            weightCategory = "Middleweight";
        } else if (userWeight > lightMiddleWeight) {
            weightCategory = "Light-Middleweight";
        } else if (userWeight > lightWeight) {
            weightCategory = "Lightweight";
        } else {
            weightCategory = "flyweight";
        }
        setWeight(userWeight);
        setWeightCategory(weightCategory);

        if (userWeight < heavyWeight) {
            System.out.println(getAddWeight() + (heavyWeight - userWeight));
        } else if (userWeight > heavyWeight) {
            System.out.println(getLooseWeight() + (userWeight - heavyWeight));
        } else if (userWeight < lightHeavyWeight) {
            System.out.println(getAddWeight() + (lightHeavyWeight - userWeight));
        } else if (userWeight > lightHeavyWeight) {
            System.out.println(getLooseWeight() + (userWeight > lightHeavyWeight));
        } else if (userWeight < middleWeight) {
            System.out.println(getAddWeight() + (middleWeight - userWeight));
        } else if (userWeight > middleWeight) {
            System.out.println(getLooseWeight() + (userWeight - middleWeight));
        } else if (userWeight < lightMiddleWeight) {
            System.out.println(getAddWeight() + (lightMiddleWeight - userWeight));
        } else if (userWeight > lightMiddleWeight) {
            System.out.println(getLooseWeight() + (userWeight - lightMiddleWeight));
        } else if (userWeight < lightWeight) {
            System.out.println(getAddWeight() + (lightWeight - userWeight));
        } else if (userWeight > lightWeight) {
            System.out.println(getLooseWeight() + (userWeight - lightWeight));
        } else {
            System.out.println("Keep up with your weight");
        }

    }
}
