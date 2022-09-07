public class Encapsulation2 {

    public static void main(String[] args) {

        Encapsulation Test = new Encapsulation();

        Test.setName ("Bob");
        Test.setId (21);
        Test.setAge (50);
        Test.setGrade ("B+");

        System.out.println("Final Input Name:   " + Test.getName());
        System.out.println("Final Input ID:   " +Test.getId());
        System.out.println("Final Input Age:   " +Test.getAge());
        System.out.println("Final Input Grade:   " +Test.getGrade());

    }
}
