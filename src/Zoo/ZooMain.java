package Zoo;

public class ZooMain {
    public static void main(String[] args){
        Fish seaBass = new Fish(10, "Female", 20);
        seaBass.eat();
        seaBass.sleep();
        seaBass.swim();
        seaBass.move();
        Bird bird1 = new Bird(30, "Male", 10);
        bird1.eat();
        bird1.sleep();
//        bird1.fly();
        Macaw blueMacaw = new Macaw(3, "female", 8);
        blueMacaw.fly();
        blueMacaw.move();
        Penguin penguin1 = new Penguin(5, "Male", 20);
//        penguin1.fly();
    }


}
