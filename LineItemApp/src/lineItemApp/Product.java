package lineItemApp;

import java.text.NumberFormat;

public class Product {
	
	//the instance variables
	private String code;
	private String description;
	private float price;
	
	//the constructor
	public Product() {
		code = "";
		description = "";
		price = 0;
	}//close constructor 
	
	//the set and get methods for the code variable
	public void setCode(String code) {
		this.code = code;
	}//close setCode( ) method
	
	public String getCode() {
		return code;
	}//close getCode() method
	
	//the set and get methods for the description variable
	public void setDescription(String description) {
		this.description = description;
	}//close setDescription() method
	
	public String getDescription() {
		return description;
	}//close getDescription() method
	
	//the set and get methods for the price variable
	public void setPrice(float price) {
		this.price = price;
	}//close setPrice() method
	
	public float getPrice() {
		return price;
	}//close getPrice() method
	
	//a custom get method for the price variable 
	public String getPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceFormatted = currency.format(price);
		return priceFormatted;
	}//close getPriceFormatted() method
}//close Product class
