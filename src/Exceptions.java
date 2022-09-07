public class Exceptions {

    public static void main(String[] args) {


        try {
            int[] Series = {1, 2, 3};
            System.out.println(Series[2]);
        } catch (Exception e) {
            System.out.println("Input is wrong");
        } finally {
            System.out.println("Process finished");
        }



            //Is it applicable for any code block other than Array List?

            try {
                String Name = ("Babu; Noor; Reza");
//                System.out.println(Name (2));
            } catch (Exception e) {
                System.out.println("Input is wrong");
            } finally {
                System.out.println("Process finished");

            }









//            Scanner sn = new Scanner(System.in);
//            System.out.println("Whats you fav number");
//
//            try{
//                int n = sn.nextInt();
//                System.out.println(n);
//            }catch (Exception e){
//                System.out.println("Sorry not a real number, please enter a number");
//            }
//            try{
//                int [] a = null;
//                System.out.println(a[4]);
//            }catch(NullPointerException e){
//                System.out.println("There is null pointer exceptions");
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("There is array index out of bound exception");
//            }
        }
    }

