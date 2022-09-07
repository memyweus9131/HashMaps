import java.util.Scanner;

public class ScannerUserInput {

    public static void main(String[] args) {

        Scanner Input = new Scanner (System.in);
        System.out.println("Enter User Name");

        String Output = Input.nextLine();
        System.out.println("User Name is : " + Output);

        Scanner Features = new Scanner(System.in);
        System.out.println("Enter Employee Name, ID and Salary");

        String Name = Features.nextLine();
        System.out.println("Employee Name is:  "  + Name);
        int ID = Features.nextInt();
        System.out.println("Employee ID is:  "  + ID);
        int Salary = Features.nextInt();
        System.out.println("Employee Salary is:  "  + Salary);



    }
}
