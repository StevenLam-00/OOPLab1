package lab1Ques4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main (String args[]) {
		List<Item> item= new ArrayList<Item>();
		int NumberItems;
		String ItemID;
		String name;
		double price;
		Order o1 = new Order ("Order3");
		Scanner s = new Scanner (System.in);
		System.out.print("Enter list: ");
		NumberItems = s.nextInt();
		for (int i = 0 ; i<NumberItems; i++) {
			Scanner s2 = new Scanner (System.in);
			System.out.print("Input the ID of item " +(i+1));
			ItemID = s2.nextLine();
			System.out.print("Input name of item: ");
			name = s2.nextLine();
			System.out.print("Price: ");
			price =s2.nextDouble();
			
			Item item1= new Item(ItemID,name,price);
			item.add(item1);

		}
		
		
		
		o1.setItemList(item);
		System.out.print("Average cost is: " + o1.calculateAverageCost());
	}

}