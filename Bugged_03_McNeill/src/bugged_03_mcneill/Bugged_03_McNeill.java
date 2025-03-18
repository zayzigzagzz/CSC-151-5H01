package bugged_03_mcneill;
import java.util.Scanner;

public class Bugged_03_McNeill{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double dollars, eurosPerDollar, grossEuros, rate, ratePercent, netDollars, netEuros;
        //net after everything
        //gross before subtration
        System.out.println("Welcome to the Dollars to Euros Converter.\n");            
        System.out.print("How many dollars do you want to convert? ");        
        dollars = keyboard.nextDouble();

        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = keyboard.nextDouble(); 
        
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        rate = keyboard.nextDouble();
        ratePercent = rate / 100;
        netDollars = dollars - (dollars * ratePercent);
        //dollars to euros
        grossEuros = netDollars * eurosPerDollar;

        System.out.println(dollars + " Dollars => " + grossEuros + " Gross Euros");

        netEuros = grossEuros - (grossEuros* ratePercent);

	    System.out.println("Thank you for using the Dollars to Euros Converter\n");	
        System.out.println(dollars + " \tDollars\n" + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                rate + " \tFee Percentage %\n" + 
                netDollars + "\tNet Dollars"); 
        System.out.printf("%.2f", grossEuros);
        System.out.print("\tGross Euros\n");
    }    
}
