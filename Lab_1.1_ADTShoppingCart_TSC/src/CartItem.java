/**
 * @author tylercambron
 * Cart Item used in shopping cart methods.
 */
public interface CartItem {
	/**
	 * Name of the item.
	 */
	String name = "";
	/**
	 * Price of the item.
	 */
	double price = 0.0;
	
	/**
	 * @return returns String variable name
	 */
	public String getName();
	
	/**
	 * @return Double value price of the cart item.
	 */
	public double getPrice();
	
	/**
	 * Set String variable name.
	 * @param name used to describe the cart item.
	 */
	public void setName(String name);
	
	/**
	 * Set double variable price.
	 * @param price used to describe the expense of the cart item.
	 */
	public void setPrice(double price);
}
