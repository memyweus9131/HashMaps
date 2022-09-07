public class ElseIf {
    public static void main(String[] args) {

        int z = 11;
        int k = 19;

        if (z > k) {
            System.out.println("It is true");
        } else {
            System.out.println("It is False");
        }

        String a = "It is raining";

        if (a == "It is not raining") {
            System.out.println("Stay Home");
        } else {
            System.out.println("Play Outside");
        }

        String o = "Texas is biggest state";

        if (o == "Texas is biggest state") {
            System.out.println("It is true");
        } else {
            System.out.println("It is False");
        }

        // < 25000 = Low Income Group
        // 25000 ~ 50000 = Middle Income Group
        // 50000 ~ 75000 = High Income Group
        // > 75000 = Filthy Rich

        int Income = 55000;

        if (Income < 25000) {
            System.out.println("Low Income Group");
        } else if (Income >= 25000 && Income < 50000) {
            System.out.println("Middle Income Group");
        } else if (Income >= 50000 && Income < 75000) {
            System.out.println("High Income Group");
        } else if (Income >= 75000) {
            System.out.println("Filthy Rich");
        }else{
            System.out.println("Wrong Input");
        }


            // If Expenditure is :
            // 0 ~ 25000 = Investigation Required
            // 25000 ~ 50000 = Move On Buddy
            // 50000 ~ 75000 = Be Careful
            // 75000 ~ 100000 = Investigation Required
            // > 100000 = Fire Them All

            int Expenditure = 105000;

            if (Expenditure < 25000 || Expenditure > 75000 && Expenditure < 100000) {
                System.out.println("Investigation Required");
            } else if (Expenditure >= 25000 && Expenditure <= 50000) {
                System.out.println("Move on Buddy");
            } else if (Expenditure > 50000 && Expenditure < 75000) {
                System.out.println("Be Careful");
            } else if (Expenditure >= 100000) {
                System.out.println("Fire Them All");
            }



        int p = 5;
        int b = 9;

        if (p > b && p == b) {
            System.out.println("Its True");
        } else {
            System.out.println("Its False");
        }

        int i = 50;

        if (i >= 90 && i <= 100) {
            System.out.println("A+");


        } else if (i >= 80 && i < 90) {
            System.out.println("A");


        } else if (i >= 70 && i < 80) {
            System.out.println("B+");


        } else {
            System.out.println("Failed");
        }


        //Brain Usage = m in percentile";

        int m = 55;

        if (m > 90 && m <= 100) {
            System.out.println("MENSA");

        } else if (m > 80 && m <= 90) {
            System.out.println("Genius");

        } else if (m > 70 && m <= 80) {
            System.out.println("Standard");

        } else if (m < 0 || m > 100) {
            System.out.println("You are a Stupid");

        } else {
            System.out.println("Dumb");

        }

    }

}


