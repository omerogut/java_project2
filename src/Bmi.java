
public class Bmi {

	private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237d;
    public static final double METERS_PER_INCH = 0.30635;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        double kilo = Bmi.KILOGRAMS_PER_POUND * this.weight;

        double boy = Bmi.METERS_PER_INCH * this.height;

        return kilo / (boy * boy);
    }

    public String getStatus(){
        if (this.getBMI() < 18.5) {
            return "underweight";
        } else if (18.5 <= this.getBMI() && this.getBMI() < 25.0) {
            return "normal";
        } else if (25 <= this.getBMI() && this.getBMI() < 30) {
            return "overweight";
        } else if (30 <= this.getBMI()) {
            return "obese";
        } else {
            return "obese";
        }
    }
	
}
