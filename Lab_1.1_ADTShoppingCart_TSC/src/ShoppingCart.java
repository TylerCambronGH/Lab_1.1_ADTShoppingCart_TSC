/**
 * Shopping cart used to hold an array bag of cart items.
 * @author tylercambron
 */
public interface ShoppingCart {
	/**
	 * Empties every item from cart.
	 */
	public void empty();
	
	/**
	 * Checks if cart has any items or not.
	 * @return whether there are items.
	 */
	public boolean isEmpty();
	
	/**
	 * Adds an item in most available location starting from zero.
	 * @param item being appended to the shopping cart.
	 */
	public void addItem(CartItem item);
	
	/**
	 * Adds an item and an index.
	 * @param index integer value where the item is inserted.
	 * @param item value being inserted at index.
	 */
	public void addItem(int index, CartItem item);
	
	/**
	 * Removes item at index.
	 * @param index integer value describing an item in the cart.
	 */
	public void removeItem(int index);
	
	/**
	 * Removes all items from the cart matching parameter "item".
	 * @param item CartItem value being compared.
	 */
	public void removeItem(CartItem item);
	//
	/**
	 * Gets and returns item by the index.
	 * @param index integer describing a value in the cart.
	 * @return the item at index.
	 */
	public CartItem getItem(int index);
	
	/**
	 * Counts up the amount of a duplicate item.
	 * @param item is what we are comparing the other too, finding the duplicate.
	 * @return the integer amount of items that are the same.
	 */
	public int getAmountOfItem(CartItem item);
	
	/**
	 * Gathers all items and adds their prices together.
	 * @return the total prices added up inside the cart.
	 */
	public float getTotalPrice();
}
