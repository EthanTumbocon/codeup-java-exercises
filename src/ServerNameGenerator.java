import java.util.Random;

public class ServerNameGenerator {
    public static String[] adj = {"adorable", "bewildered", "cautious", "dangerous", "ecstatic", "fantastic", "gargantuan", "healthy", "inexpensive", "jittery"};

    public static String[] noun = {"king", "lawyer", "magazine", "needle", "oyster", "pizza", "quill", "rainbow", "shampoo", "teacher" };

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getWord(adj) + " " + getWord(noun));
    }

    public static String getWord(String[] words){
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(words.length);
        return words[randomIndex];
    }

}
