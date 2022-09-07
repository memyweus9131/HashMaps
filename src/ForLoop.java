public class ForLoop {

    public static void main(String[] args) {


//      1. Print squares of 5 to 15

        for (int a = 5; a <= 15; a++) {
            System.out.println(a * a);
        }

//      2. Calculate the sum of all numbers from -5 to 18

        int sums = 0;
        for (int y = -5; y <= 18; y++)
            sums += y;
        {
            System.out.println(sums);
        }

//      3. Write a program to print a multiplication table of 7

        int k = 7;
        for (int z = 1; z <= 10; z++)
            System.out.println(k * z);

//      4. Count the total number of digits in 67687

        int sum = 0;
        int r;
        int temp;
        int num;
        num = 67687;
        temp = num;
        r = temp % 10;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println(sum);


////      5. Print numbers from -10 to -1 using for loop

        for (int x = -10; x <= -1; x++) {
            System.out.println(x);
        }

//      6. Print all odd numbers between 1 to 9


        for (int p = 0; p <= 9; p++) {
            p += 1;
            System.out.println(p);
        }


//      7. Print Fibonacci series up to 10 terms


        int n = 10, FirstNum = 0, SecondNum = 1;
        for (int e = 0; e < n; e++) {
            int fibo = FirstNum + SecondNum;
            FirstNum = SecondNum;
            SecondNum = fibo;
            System.out.println(fibo);

        }

//      8. Calculate the sum of all numbers from -5 to 18

        int u = 0;
        for (int y = 0; y <= 10; y++)
            u += y;
        {
            System.out.println(u);
        }



    }
}





