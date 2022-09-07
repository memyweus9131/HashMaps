public class Array {

    public static void main(String[] args) {

        String[]cars = {"Toyota", "Volvo", "Mazda", "Lexus", "VoxWagon" };
        System.out.println(cars[4]);
        System.out.println(cars[0]);

        cars [0] = "Opel";
        System.out.println(cars[0]);



        int[] a = {10, 20, 30, 40, 50};
        System.out.println(a[4]);

        String b = ("10, 20, 30, 40, 50"); //done by
        System.out.println(b.length());

        String[] c = {"10, 20, 30, 40, 50"};//Done through Array
        System.out.println(c.length);

        int d[] = new int [10];

        d[0]= 20;
        d[1]= 30;
        d[2]= 40;
        d[3]= 50;
        d[4]= 60;
        d[5]= 70;
        System.out.println(d.length);


    }
}
