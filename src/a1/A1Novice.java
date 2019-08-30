package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int datapnts = scan.nextInt();
		for (int i=0; i<datapnts; i++) {
			String first = scan.next();
			char firstInitial = first.charAt(0);
			String last = scan.next();
			double total = 0;
			int numOfItems = scan.nextInt();
			for (int j=0; j<numOfItems; j++) {
				int quant = scan.nextInt();
				String food = scan.next();
				double price = scan.nextDouble();
				for (int k=0; k<quant; k++) {
					total = total + price;
				}
			}
		String fixTotal = String.format("%.2f", total);
		System.out.println(firstInitial + ". " + last + ": " + fixTotal);
		}		
	scan.close();
	}
}
