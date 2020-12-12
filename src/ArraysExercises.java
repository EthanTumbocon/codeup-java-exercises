
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        //
         int[] numbers = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(numbers)); // necessary because you want to get the values in the array not the location of the array in the memory.

       Person[] people = new Person[3];

        people[0] = new Person("Ethan");
        people[1] = new Person("Elvira");
        people[2] = new Person("Ryan");


        Person foo = new Person("Nico");
        people = Person.addPerson(people, foo);
    

        for(Person person : people){
            System.out.println(person.getName());
        }


        //It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


    }








}

