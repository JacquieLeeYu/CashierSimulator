/* I got bored again and now I'm messing with the mod (%) function that
we learned about in class today
 */

//import java.util.Random;
//DONE
import java.util.Scanner;

public class CashierSimulator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter in all prices separated by a space:");
        String totalString = s.nextLine();
        double sum = 0;
        String [] arr= totalString.split(" ");
        for (int x = 0 ; x<arr.length ; x++ ) {
            sum += Double.parseDouble(arr[x]);
        }
      //  System.out.println(sum);
        //Tax sequence
        System.out.println("What is the tax rate? (in decimal) ");
        double taxRate = s.nextDouble() + 1;
        double tax = taxRate * sum;

        //Net total sequence
        double netTotal = ((tax + sum) * 1000) / 1000;
        System.out.println("Your total is: $" + netTotal);

        //Payment
        System.out.println("How much are you paying?");
        double payment = s.nextDouble();
        System.out.println("You are paying: $" + payment);
        double changeTotal = payment - netTotal;
        System.out.println("Your change is: $" + changeTotal);

        int change = (int)((changeTotal)*100);
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        if ((change / 10000) >= 1) {//Change sequence
            hundred = (change / 10000);
            change = change % 10000;
        }
        if ((change / 5000) >= 1) {
            fifty = (change / 5000);
            change = change % 5000;
        }
        if ((change / 2000) >= 1){
            twenty = (change / 2000);
            change = change % 2000;
        }
        if ((change /  1000) >= 1) {
            ten = (change / 1000);
            change = change % 1000;
        }
        if ((change / 500) >= 1) {
            five = (change / 500);
            change = change % 500;
        }
        if ((change / 100) >= 1) {
            one = (change / 100);
            change = change % 100;
        }
        if ((change / 25) >= 1) {
            quarter = (change / 25);
            change = change % 25;
        }
        if ((change / 10) >= 1) {
            dime = (change / 10);
            change = change % 10;
        }
        if ((change / 5) >= 1) {
            nickel = (change / 5);
            change = change % 5;
        }
        if ((change / 1) >= 1) {
            penny = (change / 1);
            change = change % 1;
        }

        System.out.println("Give the customer:");//Money sequence
        if (hundred != 0) {
            System.out.println(hundred + " hundreds");
        } else {
            System.out.println(hundred + " hundred");
        }
        if (fifty != 0) {
            System.out.println(fifty + " fifties");
        } else {
            System.out.println(fifty + " fifty");
        }
        if (twenty != 0) {
            if (twenty > 1){
                System.out.println(twenty + " twenties");
            } else {
                System.out.println(twenty + " twenty");
            }
        }
        if (ten != 0) {
            if (ten > 1) {
                System.out.println(ten + " tens");
            } else {
                System.out.println(ten + " ten");
            }
        }
        if (five != 0) {
            if (five > 1) {
                System.out.println(five + " fives");
            } else {
                System.out.println(five + " five");
            }
        }
        if (one != 0) {
            if (one > 1) {
                System.out.println(one + " ones");
            } else {
                System.out.println(one + " one");
            }
        }
        if (quarter != 0) {
            if (quarter > 1) {
                System.out.println(quarter + " quarters");
            } else {
                System.out.println(quarter + " quarter");
            }
        }
        if (dime != 0) {
            if (dime > 1) {
                System.out.println(dime + " dimes");
            } else {
                System.out.println(dime + " dime");
            }
        }
        if (nickel != 0) {
            if (nickel > 1) {
                System.out.println(nickel + " nickels");
            } else {
                System.out.println(nickel + " nickel");
            }
        }
        if (penny != 0) {
            if (penny > 1) {
                System.out.println(penny + " pennies");
            } else {
                System.out.println(penny + " penny");
            }
        }
    }
}
