package bugged_01_mcneill;

import java.util.Scanner;


public class Bugged_01_McNeill
{
   public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        //variables
        final double GUEST_PRICE = 35.00;
        double price;
        int guests;
        //input
        System.out.print("Enter number of guests >> ");
        guests = input.nextInt();
        System.out.println("***************************************************");
        System.out.println("*                                                 *");
        System.out.println("*  Jim's food makes the party great.              *");
        System.out.println("*                                                 *");
        System.out.println("***************************************************");
        //calculations
        price = guests * GUEST_PRICE;
        //output
        System.out.println("The price for an event with " + guests + " guests at $" + GUEST_PRICE + " per guest is $" + price);
   }
}
























































































;