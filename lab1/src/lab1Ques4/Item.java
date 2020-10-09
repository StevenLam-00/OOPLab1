package lab1Ques4;

public class Item {
	private String name;
	private double price;
	private String ItemID;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public Item(String itemID, String name, double price) {
		super();
		this.name = name;
		this.price = price;
		ItemID = itemID;
	}
	
	

}