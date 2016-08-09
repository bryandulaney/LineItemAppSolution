package lineItemApp;

import java.text.NumberFormat;

public class LineItem {

	private Product product;
	private int quantity;
	
	public LineItem() {
		this.product = null;
		this.quantity = 0;
	}//close my constructor
	
	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	} //close my constructor
	
	public void setProduct(Product product) {
		this.product = product;
	}//close my method setProduct()
	
	public Product getProduct() {
		return product;
	} //close my method getProduct()
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}//close my method getQuantity()
	
	public int getQuantity() {
		return quantity;
	} //close getQuantity() method
	
	public double getTotal() {
		double total = quantity * product.getPrice();
		return total;
	}//close getTotal() method
	
	public String getTotalFormatted() {
		double total = this.getTotal();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String totalFormatted = currency.format(total);
		return totalFormatted;
	}//close getTotalFormatted() method
}//close LineItem class
