import java.util.ArrayList;
import java.util.Collections;

public class ArrayListD {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList <String> ();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Opel");

//      for (int i = 0; i <= cars.size(); i++){
//          System.out.println (cars.get(i));}

        Collections.sort (cars);
        for (String a : cars){
            System.out.println(a);}


        System.out.println(cars);

        System.out.println(cars.get (3));

        System.out.println(cars.size());

        cars.set (0, "VWagon");
        System.out.println(cars);

        cars.remove (3);
        System.out.println(cars);

        cars.clear ();
        System.out.println(cars);


        ArrayList <String> numbers = new ArrayList <String> ();

        numbers.add ("10");
        numbers.add ("10");
        numbers.add ("10");
        numbers.add ("10");
        numbers.add ("10");
        numbers.add ("10");

        System.out.println(numbers);
        System.out.println(numbers.get (0));









    }

}
