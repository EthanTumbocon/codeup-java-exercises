import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
static Scanner scan = new Scanner(System.in);
//    public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//        int a = 62;
//        int b = 18;
//        System.out.println(Integer.sum(a,b));
//    }
//    public static void main(String[] args){
//        int c = 50;
//        int d = 25;
//        System.out.println(Math.subtractExact(c,d));
//    }
//    public static void main(String[] args){
//    int e = 24;
//    int f = 32;
//    int g = e * f;
//    System.out.println(g);
//    }
//    public static void main(String[] args){
//    int h = 400;
//    int i = 8;
//    System.out.println(h/i);
//    }
//    public static void main(String[] args){
//        int a = 72;
//        int b = 13;
//        int c = a % b;
//        System.out.println(c);
//    }


//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//    }

//}
//public static long factorial(long num){
//        Scanner input = new Scanner(System.in);
//        if(num >= 1 && num <= 10) {
//            return (num * (factorial(num - 1)));
//        } else if(num != 0) {
//            System.out.println("Please enter a number between 0 and 10.");
//            long userNum = input.nextLong();
//            return factorial(userNum);
//        } else {
//            return 1;
//        }
//    }
    public static void main(String[] args){
//
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Choose a number from 1 to 10!");
////        String userInput = scanner.next();
////        System.out.println("You entered: \"" + userInput + "\" ");
//
//        factorial();
////        System.out.println(factorial(6));
        dice();
    }
//    public static int main(int n, int fact) {
////        Scanner scanner = new Scanner(System.in);
//        int userInput;
//        if (n == 1) {
//            return 1;
//        }
//        userInput = fact(n - 1) * n;
//        return userInput;
//    }
//public static void factorial() {
//    int base = getInteger(1,10);
//    long fact = 1;
//    String output = "! = 1";
//    System.out.printf("1%s\n", output);
//    for (int i = 2; i <= base; i++) {
//        fact *= i;
//        output += " x " + i;
//        System.out.printf("%d%s = %d\n", i,output, fact);
//    }
//}
    public static int getInteger(int min, int max) {
        int answer;
        do {
            System.out.println("Enter a number between " + min + " and " + max +": ");
            answer = scan.nextInt();
            scan.nextLine();
        } while (answer < min || answer > max);
        return answer;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int dice(){
        int userInput = 0;
        int dice1 = 0;
        int dice2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides of dice do you want?");
        userInput = getInteger(1,100);
        while(true){
            dice1 = (int) Math.round(Math.floor(Math.random() * userInput + 1));
            dice2 = (int) Math.round(Math.floor(Math.random() * userInput + 1));
            System.out.printf("%d + %d = %d\n", dice1, dice2, (int)add(dice1,dice2));
            System.out.println("Would you like to roll again?");
            String answer = scan.next();
            if(answer.toLowerCase().contains("n")) return (int) add(dice1,dice2);{
            }
        }

    }

}


