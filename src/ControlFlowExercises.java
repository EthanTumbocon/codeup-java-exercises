import java.util.stream.IntStream;

public class ControlFlowExercises {


    private static Math math;


    public static void main(String[] args) {
//        int i = 5;
//
//
//        while(i <= 15){
//            System.out.println(i);
//            System.out.println(" ");
//            i++;
//        }

//        int counter = 0;
//
//        do{
//            System.out.println(counter);
//            counter += 2;
//        } while(counter <= 100);

//        int counter = 100;
//        do{
//            System.out.println(counter);
//            counter -= 5;
//        }while(counter >= -10);
//
//        long start = 2;
//
//        do{
//            System.out.println(start);
//            start *= start;
//
//        }while(start < 1000000L);

//        int i = 2;
//        do {
//            System.out.println(i);
//            i = (int) math.pow(i, 2);
//        }
//        while (i < 1000000);
//        fizzBuzzBeforeJava8(100);
//        fizzBuzzInJava8(100);
//    }
//
//    private static void fizzBuzzBeforeJava8(int num) {
//        for (int i = 1; i <= num; i++) {
//            if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
//                System.out.println("fizzbuzz");
//            else if ((i % 5) == 0) // Is it a multiple of 5?
//                System.out.println("fizz");
//            else if ((i % 7) == 0) // Is it a multiple of 7?
//                System.out.println("buzz");
//            else
//                System.out.println(i); // Not a multiple of 5 or 7
//        }
//    }
//
//    private static void fizzBuzzInJava8(int num) {
//        IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);

//        sophies fizzbuzz
        int i = 0;
        for(i = 0; i <= 100; i +=1){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else{
                System.out.println(i);
            }
        }

        Scanner scanner = new











    }
}
