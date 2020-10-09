package lab1Ques4;

import java.util.List;

public class Order {
	private String orderID;
	private List <Item>ItemList;
	
	
	public List getItemList() {
		return ItemList;
	}


	public void setItemList(List itemList) {
		ItemList = itemList;
	}


	

	public Order(String orderID) {
		super();
		this.orderID = orderID;
	}



	public String getOrderID() {
		return orderID;
	}


	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	
	public double calculateAverageCost() {
		double average = 0;
		for (int i =0; i< ItemList.size(); i++) {
			average +=  ItemList.get(i).getPrice()/ ItemList.size();
		}
		return average;
	}
}
	