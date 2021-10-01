import java.util.Scanner;
public class runStock {

	public static void main(String[] args) {
		
		Stock stock1 = new Stock();
		stock1.setsymbol("APPL");
		stock1.setCompanyName("Apple INC");
		stock1.setPrice(144.67);
		//using set methods to initialize
		
		Stock stock2 = new Stock("APPL", "Apple INC", 144.67);
		//initialize object using constructor
		
		//System.out.println("Symbol: "+ stock1.getsymbol());
		System.out.printf("%-20s %-20s\n", "Symbol: ", stock1.getsymbol());
		//System.out.println("Company Name: " + stock1.getcompanyName());
		System.out.printf("%-20s %-20s\n", "Company Name: ", stock1.getcompanyName());
		//System.out.printf("Price: %.2f", stock1.getPrice());
		System.out.printf("%-20s %-10.2f\n", "Price: ", stock1.getPrice());
		
		Scanner in = new Scanner(System.in);
		
		int shares;
		do {
		System.out.println("Please enter how many shares you want to purchase: ");
		shares = in.nextInt();
		if (shares < 0) {
			System.out.println("Must be a positive value. Try again");
		}
		}while(shares < 0);
		System.out.printf("Total cost: %.2f\n", stock1.computePurchaseCost(shares));
		
		//for check, loop is better than if bc w/ loop the user can keep inputting values until correct. if statements will stop program
		
		//in.nextLine();
		
		Scanner name = new Scanner(System.in);
        System.out.print("Enter Stock Symbol: ");
        String symbolstock;
        symbolstock = name.nextLine();
	
		System.out.println("Please enter the company name: ");
		String companyn;
		companyn = name.nextLine();
		   while (companyn.length() <= 1) {
	            System.out.print("Please enter valid company name...");
	            System.out.println("Enter Company Name: ");
	}

		   System.out.println("Enter the price of the stock: ");
		   Double pricestock;
		   pricestock = name.nextDouble();
	        while (pricestock <= 0) {
	            System.out.print("Enter valid price: ");
	            System.out.print("Enter Price: ");
	}
	
			System.out.printf("%-20s %-20s\n", "Symbol: ", symbolstock);
			System.out.printf("%-20s %-20s\n", "Company Name: ", companyn);
			System.out.printf("%-20s %-10.2f\n", "Price: ", pricestock);
	        
			System.out.println("How many shares of stock would you like to buy in " + symbolstock + "?");
			Double totalshares;
			totalshares = name.nextDouble();
	        
			System.out.println("You will be buying " + shares + " shares of apple and " + totalshares + " of " + companyn);
	        
	}
}

