package lineItemApp;

public class ProductDB {

	public static Product getProduct(String productCode) { // static method

		// create the Product object
		Product product = new Product();

		// fill the Product object with data
		product.setCode(productCode);
		if (productCode.equalsIgnoreCase("java")) {
			product.setDescription("Grand Circus' Java Programming");
			product.setPrice(57.50);
		}// close if-statement
		else if (productCode.equalsIgnoreCase("jsp")) {
			product.setDescription("Grand Circus' Java Servlets and JSP");
			product.setPrice(57.50);
		}// close else-if statement
		else if (productCode.equalsIgnoreCase("mysql")) {
			product.setDescription("Grand Circus' MySQL");
			product.setPrice(54.50);
		}// close else-if statement
		else if (productCode.equalsIgnoreCase("android")) {
			product.setDescription("Grand Circus' Android Programming");
			product.setPrice(50.50);
		}// close else-if statement
		else {
			product.setDescription("Unknown");
		}// close if/else-statement
		return product;
	}// close getProduct( ) method

}
