package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int datapnts = scan.nextInt();
		// String[] customer = new String[datapnts];
		// System.out.println(datapnts);
		for (int i=0; i<datapnts; i++) {
			String first = scan.next();
			// System.out.println("after first name");
			char firstInitial = first.charAt(0);
			// System.out.println("after first initial");
			String last = scan.next();
			// System.out.println("after last name");
			double total = 0;
			int numOfItems = scan.nextInt();
			// System.out.println(numOfItems);
			for (int j=0; j<numOfItems; j++) {
				// System.out.println("after inner for loop");
				int quant = scan.nextInt();
				// System.out.println("before");
				String food = scan.next();
				// System.out.println("after");
				double price = scan.nextDouble();
				for (int k=0; k<quant; k++) {
					total = total + price;
				}
			}
		System.out.println(firstInitial + ". " + last + ": " + total);
		}		
	scan.close();
	}
}
