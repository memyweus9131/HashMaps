public class SwitchCon {
    public static void main(String[] args) {

        // Q : Sum of all the numbers upto 50.


        int score = 50;
        switch (score)

        {  case 95:
           System.out.println("A+");
           break;

           case 80:
           System.out.println("a");
           break;

           default:
           System.out.println("Failed");
        }

        int Day = 9;
        switch (Day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Input valid number");
            }

            StringBuilder a = new StringBuilder("Abdullah");
                System.out.println(a.reverse());


    }
}



