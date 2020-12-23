package Zoo;

public class Macaw extends Bird implements Flyable{
    public Macaw(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        System.out.println("Macaw flying high.");
    }
}
