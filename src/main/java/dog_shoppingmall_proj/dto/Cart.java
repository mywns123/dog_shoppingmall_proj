package dog_shoppingmall_proj.dto;

public class Cart {
	private String image;
	private String kind;
	private int price;
	private int qty;

	public Cart() {}

	public Cart(String image, String kind, int price, int qty) {
		this.image = image;
		this.kind = kind;
		this.price = price;
		this.qty = qty;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return String.format("Cart [image=%s, kind=%s, price=%s, qty=%s]", image, kind, price, qty);
	}

}
