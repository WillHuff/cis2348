import java.util.Scanner;

public class recurses {
    public static void  main(String[] args) {
            int n;
            String str;
            Scanner input =new Scanner(System.in);
            System.out.println("Enter a number");
            n= input.nextInt();//***For different types of data, use input.nextLine to clear the enter space.
            input.nextLine();
            System.out.println("Enter a String to print");
            str=input.nextLine();
            printMessage(str, n);
        }
        public static void printMessage(String s, int x) { //print a string str n times
            if (x > 0) {
                System.out.println(s);
                printMessage(s, x - 1);
            }
        }
}
