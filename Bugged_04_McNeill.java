import java.util.Scanner;
public class Bugged_04_McNeill 
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);

        String choice; 

        do
        {
            System.out.println("Would you like to convert to Euros or Dollars? Enter 1 for Euros and 2 for Dollars:");
            int userInput = k.nextInt();

            while(userInput != 1 && userInput != 2)
            {
                System.out.println("Error. You need to enter either 1 or 2.");
                userInput = k.nextInt();
            }

            if(userInput == 1)
            {
                dollarsToEuros(k);
            }
            else if(userInput == 2)
            {
                eurosToDollars(k);
            }

            System.out.println("Would you like to run the program again? Enter y for YES and n for NO:");
            choice = k.next();
        }
        while (choice == "y");
        System.out.println("Program has ended!");


    
    }

    public static void dollarsToEuros(Scanner k)
    {
        System.out.println("You chose Dollars to Euros!");

        double dollars, eurosPerDollar, grossEuros, rate, ratePercent, netDollars, netEuros;
        //net after everything
        //gross before subtration
        System.out.print("How many dollars do you want to convert? ");        
        dollars = k.nextDouble();

        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = k.nextDouble(); 
        
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        rate = k.nextDouble();
        ratePercent = rate / 100;
        netDollars = dollars - (dollars * ratePercent);
        //dollars to euros
        grossEuros = netDollars * eurosPerDollar;

        System.out.println(dollars + " Dollars => " + grossEuros + " Gross Euros");

        netEuros = grossEuros - (grossEuros* ratePercent);

        System.out.println(dollars + " \tDollars\n" + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                rate + " \tFee Percentage %\n" + 
                netDollars + "\tNet Dollars"); 
        System.out.printf("%.2f", grossEuros);
        System.out.print("\tGross Euros\n");
        System.out.println("Thank you for using the Euros to Dollars Converter\n");	
    } 

    public static void eurosToDollars(Scanner k)
    {
        System.out.println("You chose Euros to Dollars!");

        double euros, eurosPerDollar, grossDollars, rate, ratePercent, netEuros, netDollars;
        //net after everything
        //gross before subtration

        System.out.print("How many euros do you want to convert? ");        
        euros = k.nextDouble();

        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = k.nextDouble();

        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        rate = k.nextDouble();
        ratePercent = rate / 100;
        netEuros = euros - (euros * ratePercent);

        //euros to dollars
        grossDollars = netEuros / eurosPerDollar;

        System.out.println(euros + " Euros => " + grossDollars + " Gross Dollars");

        netDollars = grossDollars - (grossDollars* ratePercent);

        System.out.println(euros + " \tEuros\n" + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                rate + " \tFee Percentage %\n" + 
                netEuros + "\tNet Euros"); 
        System.out.printf("%.2f", grossDollars);
        System.out.print("\tGross Dollars\n");
        System.out.println("Thank you for using the Euros to Dollars Converter\n");	
    }




}
