package a1;

import java.util.Scanner;

public class A1Adept {

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
		double [] orderTotals = new double [customers];
		String biggestFirst = "";
		String biggestLast = "";
		double biggestTotal = 0;
		String smallestFirst = "";
		String smallestLast = "";
		double smallestTotal = 0;
		for (int i=0; i<customers; i++) {
			double total = 0;
			String first = scan.next();
			String last = scan.next();
			int numOfItems = scan.nextInt();
			for (int j=0; j<numOfItems; j++) {
				int quant = scan.nextInt();
				String itemID = scan.next();
				for (int k=0; k<datapnts; k++) {
					for (int l=0; l<quant; l++) {
						if (itemID.contentEquals(itemName[k])) {
						total = total + itemPrice[k];
						}
					}	
				}		
			}
			orderTotals[i] = total;
			if (customers == 2 && biggestTotal < total) {
				smallestTotal = biggestTotal;
				smallestFirst = biggestFirst;
				smallestLast = biggestLast;
				biggestTotal = total;
				biggestFirst = first;
				biggestLast = last;
			} else if (total <= smallestTotal) {
				smallestTotal = total;
				smallestFirst = first;
				smallestLast = last;
			} else if (biggestTotal < total) {
				biggestTotal = total;
				biggestFirst = first;
				biggestLast = last;	
			} else if (biggestTotal > total) {
				// do nothing
			} else {
				smallestTotal = total;
				smallestFirst = first;
				smallestLast = last;
			}
			// edge cases
			if (customers == 1) {
				smallestTotal = total;
				smallestFirst = first;
				smallestLast = last;
			}
		}
		// calculating average
		double combinedTotal = 0;
		for (int i=0; i<orderTotals.length; i++) {
			combinedTotal = combinedTotal + orderTotals[i];
		}
		double average = combinedTotal / orderTotals.length;
		String biggestFixTotal = String.format("%.2f", biggestTotal);
		String smallestFixTotal = String.format("%.2f", smallestTotal);
		String fixAverage = String.format("%.2f", average);
		System.out.println("Biggest: " + biggestFirst + " " + biggestLast + " (" + biggestFixTotal + ")");
		System.out.println("Smallest: " + smallestFirst + " " + smallestLast + " (" + smallestFixTotal + ") ");
		System.out.println("Average: " + fixAverage);
	}
}
