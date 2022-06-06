package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("List of numbers : " + numbers);

        // Adding numbers to a particular position in an array list
        numbers.add(2, 15);
        System.out.println("Observe the second index : " + numbers);

        // Finding the size of an array list
        System.out.println("The size of an array is : " + numbers.size());

        // Retrieving the element at a specified index
        System.out.println("The number at present at 5th position is : " + numbers.get(5));

        // Modifying the index at specified index
        numbers.set(2, 200);
        System.out.println("The number at the 2nd position is changed from 3 to 200 : " + numbers);
    }
}
