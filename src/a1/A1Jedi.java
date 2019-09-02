package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int datapnts = scan.nextInt();
		String[] itemName = new String [datapnts];
		double[] itemPrice = new double [datapnts];
		for (int i=0; i<datapnts; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		int [] numCustomers = new int[datapnts];
		int [] numItem = new int[datapnts];
		for (int i=0; i<customers; i++) {
			String first = scan.next();
			String last = scan.next();
			int numOfItems = scan.nextInt();
			boolean [] booleanArray = new boolean[datapnts];
			for (int j=0; j<numOfItems; j++) {
				int quant = scan.nextInt();
				String itemID = scan.next();
				for (int k=0; k<datapnts; k++) {
					if (itemID.contentEquals(itemName[k]) && booleanArray[k] == true) {
						numItem[k] += quant;
					} else if (itemID.contentEquals(itemName[k])) {
						numItem[k] += quant;
						numCustomers[k] += 1;
						booleanArray[k] = true;
					} 
				}
			}		
		}
		for (int a=0; a<datapnts; a++) {
			if (numCustomers[a] > 0) {
				System.out.println(numCustomers[a] + " customers bought " + numItem[a] + " " + itemName[a]);
			} else {
				System.out.println("No customers bought " + itemName[a]);
			}
		}
	}
}
