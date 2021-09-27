import java.util.Scanner;

public class ExtendExistingApp {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6;

        System.out.print("Input the 1st number: ");
        num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        num3 = in.nextInt();

        if (num1 > num2)
            if (num1 > num3)
                System.out.println("The greatest: " + num1);

        if (num2 > num1)
           if (num2 > num3)
               System.out.println("The greatest: " + num2);

        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);

        num4 = (num1 + num2 + num3);
        System.out.println("The sum of the 3 numbers is: " + num4);

        num5 =  (num1 / num3);
        System.out.println(num1 + " divided by " + num3 + " is: " + num5);

        num6 = (num2 * num2);
        System.out.println(num2 + " times " + num2 + " is: " + num6);
    }

}
