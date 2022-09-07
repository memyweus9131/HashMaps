import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListP {

    public static void main(String[] args) {

//     1. Print all numbers 342, 432, 765, 234, 265, 322

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(342);
        numbers.add(432);
        numbers.add(765);
        numbers.add(234);
        numbers.add(265);
        numbers.add(322);

        System.out.println(numbers);


//      2. Find the lowest number from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322

        numbers.add(342);
        numbers.add(-231);
        numbers.add(432);
        numbers.add(997);
        numbers.add(765);
        numbers.add(-715);
        numbers.add(234);
        numbers.add(265);
        numbers.add(322);
        numbers.add(-432);

        Collections.sort(numbers); // Sorting above numbers in Ascending Order.

        numbers.size();
        System.out.println(numbers.size());//Counting how many numbers are in the list.

        System.out.println(numbers.get(0)); //Finding lowest number in the list.
        System.out.println(numbers.get(numbers.size() - 1)); //Finding highest number in the list.

//      4. Add all the numbers and print sum of 342, - 231, 432, 997, 765,  - 715, 234, 265, 322

        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        System.out.println(sum);


//      5. Print odd numbers from 342, - 231, 432, 997, 765,  - 715, 234, 265, 322


        }

    }




