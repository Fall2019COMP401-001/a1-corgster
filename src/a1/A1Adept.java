package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int datapnts = scan.nextInt();
		double [] item = new double [datapnts];
		for (int i=0; i<item.length; i++) {
			String itemName = scan.next();
			double price = scan.nextDouble();
		}
		int customers = scan.nextInt();
		double [] requests = new double [customers];
		for (int j=0; j<requests.length; j++) {
			String first = scan.next();
			String last = scan.next();
			int numOfItems = scan.nextInt();
			double total = 0;
			for (int k=0; k<numOfItems; k++) {
				int quant = scan.nextInt();
				String itemID = scan.next();
			}
			System.out.println(first + " " + last + " (" + total + ")");
		}
		/* int datapnts = scan.nextInt();
		String[] itemName = new String [datapnts];
		double[] itemPrice = new double [datapnts];
		for (int i=0; i<itemName.length; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		double total = 0;
		int customers = scan.nextInt();
		double [] requests = new double [customers];
		for (int j=0; j<requests.length; j++) {
			String first = scan.next();
			String last = scan.next();
			int numOfItems = scan.nextInt();
			for (int k=0; k<numOfItems; k++) {
				int quant = scan.nextInt();
				String itemID = scan.next();
				for (int l=0; l<itemName.length; l++) {
					if (itemID==itemName[l]) {
					total = (total + itemPrice[l]) * quant;
					}	
				}
			}
		System.out.println(first + " " + last + " (" + total + ")");
		}
		*/
	}
}
