import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args){
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);


    Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an Integer");
//        int userInput = scanner.nextInt();
//        System.out.println("Please enter 3 words");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.printf("Your three words are %s \n %s \n %s.\n", word1, word2, word3);
//        scanner.nextLine();
//
//        System.out.println("Give me a sentence please");
//        String someSentence = scanner.nextLine();
//        System.out.printf("%s? What is that?", someSentence);

        System.out.println("Please enter the length of the classroom.");
        int length = parseInt(scanner.nextLine());
        System.out.println("Please enter the width of the classroom.");
        int width = parseInt(scanner.nextLine());

        int area = length * width;
        int perimeter =  (2*length) + (2*width);
        System.out.printf("The area of the classroom is: %d\n", area);
        System.out.printf("The perimeter of the classroom is %d\n", area);





    }

}
