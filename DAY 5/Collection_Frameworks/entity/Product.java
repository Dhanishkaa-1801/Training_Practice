package entity;

public class Product {
	private int proId;
	private String proName;
	private String category;
	private float price;
	private int stockCount;
	
	public Product(int proId, String proName, String category, float price, int stockCount) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.category = category;
		this.price = price;
		this.stockCount = stockCount;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", category=" + category + ", price=" + price
				+ ", stockCount=" + stockCount + "]";
	}
	
	
}
