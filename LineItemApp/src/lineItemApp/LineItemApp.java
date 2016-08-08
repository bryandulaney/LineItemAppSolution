package lineItemApp;

//Line Item App from p. 89 of Murach java

import java.text.NumberFormat;
import java.util.Scanner;

public class LineItemApp {

		public static void main (String [] args) {
			System.out.println("Welcome to the Line Item Calculator");
			System.out.println();
			
			Scanner scan = new Scanner(System.in);
			String choice = "y";
			
			while(choice.equalsIgnoreCase("y")){
				//get input from user
				System.out.println("Enter product code: ");
				String productCode = scan.nextLine();
				
				System.out.println("Enter quantity: ");
				int quantity = Integer.parseInt(scan.nextLine());
				
				//set product price based on product code
				double price;
				String description = "";
				if (productCode.equalsIgnoreCase("java") ) {
					price = 57.50;
					description = "Grand Circus Java Programming";
				}//end if-statement
				else if(productCode.equalsIgnoreCase("jsp") ) {
					price = 57.50;
					description = "Grand Circus JSP Programming";
				}//end else-if statement
				else if(productCode.equalsIgnoreCase("mysql")) {
					price = 54.50;
					description = "Grand Circus MySQL Programming";
				}//end else-if statement
				else if(productCode.equalsIgnoreCase("android")) {
					price = 50.50;
					description = "Grand Circus Android Programming";
				}//end else-if statement
				else {
					price = 0;
				}//end else-statement
				
				//calculate total
				double total = price * quantity;
				
				//format and display output
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				String message = "\nLINE ITEME\n" +
						"Code:        " + productCode + "\n" +
						"Description: " + description + "\n" +
						"Price:       " + currency.format(price) + "\n" +
						"Quantity:    " + quantity + "\n" + 
						"Total:       " + currency.format(total) + "\n";
				System.out.println(message);
				
				//see if the user wants to continue
				System.out.println("Continue? (y/n): ");
				choice = scan.nextLine();
				System.out.println();
			}//end while-loop
			scan.close();
			System.out.println("Bye!");
		}// end main
}
