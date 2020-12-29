package Zoo;

public class Bird extends Animal{
    private int wingSpan;
    public Bird(int age, String gender, int weight, int wingSpan) {
        super(age, gender, weight);
        this.wingSpan = wingSpan;
    }

    @Override
    public void move() {
        System.out.println("Flapping wings!");
    }
}
