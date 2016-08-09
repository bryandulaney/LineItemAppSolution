package lineItemApp;

import java.util.Scanner;

public class LineItemApp {

		public static void main (String [] args) {
			//display welcome message
			System.out.println("Welcome to the Line Item Calculator");
			System.out.println();
			
			//create 1 or more line items
			Scanner scan = new Scanner(System.in);
			String choice = "y";
			
			while(choice.equalsIgnoreCase("y")){
				//get input from user
				System.out.println("Enter product code: ");
				String productCode = scan.nextLine();
				
				System.out.println("Enter quantity: ");
				int quantity = Integer.parseInt(scan.nextLine());
				
				//get the Product object
				Product product = ProductDB.getProduct(productCode);
				
				//create the LineItem object
				LineItem lineItem = new LineItem(product, quantity);
				
				//format and display output
				String message = "\nLINE ITEME\n" +
						"Code:        " + product.getCode() + "\n" +
						"Description: " + product.getDescription() + "\n" +
						"Price:       " + product.getPriceFormatted() + "\n" +
						"Quantity:    " + lineItem.getQuantity() + "\n" + 
						"Total:       " + lineItem.getTotalFormatted() + "\n";
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
