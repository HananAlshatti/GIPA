// Hanan Alshatti //
// 101137569 //




import java.util.ArrayList;

public class ShoppingCart {

	private int id;
	private boolean busy;
	private ArrayList<Integer[]> cart = new ArrayList<>();

	public ShoppingCart(int id) {
		this.busy = true;
		this.id = id;
		this.cart.add(0, null);
	}


	public boolean addProduct(int prod_id) {

		for (int i = 1; i < cart.size(); i++) {
			if (cart.get(i)[0] == prod_id) {
				cart.get(i)[1]++;
				return true;
			}
		}

		Integer[] newItem = { prod_id, 1 };
		cart.add(newItem);

		return true;
	}

	public boolean removeProduct(int prod_id) {

		for (int i = 1; i < cart.size(); i++) {
			if (cart.get(i)[0] == prod_id) {
				cart.get(i)[1]--;
				return true;
			}
		}

		return false;
	}

	public void setCartID(int id) {
		this.id = id;
	}

	public ArrayList<Integer[]> getCart() {
		return cart;
	}

	public int getId() {
		return id;
	}

	public boolean isBusy() {
		return busy;
	}
}
