package Zoo;

public class Macaw extends Bird implements Flyable{
    public Macaw(int age, String gender, int weight, int wingSpan) {
        super(age, gender, weight,wingSpan);
    }

    @Override
    public void fly() {
        System.out.println("Macaw flying high.");
    }
}
