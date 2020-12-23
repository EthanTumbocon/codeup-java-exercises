package Zoo;

public class Fish extends Animal{

    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Flipping fins!");
    }

    public void swim(){
        System.out.println("Swimming!");
    }
}
