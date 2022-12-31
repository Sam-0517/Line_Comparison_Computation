package com.BridgeLabz.LineComparison;

import java.util.*;

public class LineComparisonComputation {
	Scanner scan = new Scanner(System.in);
	int x1, y1, x2, y2;
	static int length;

	public int lineCoordinates() {
		System.out.println("Enter point for x1 and y1");
		x1 = scan.nextInt();
		y1 = scan.nextInt();

		System.out.println("Enter points for x2 and y2 ");
		x2 = scan.nextInt();
		y2 = scan.nextInt();

		length = (int) Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		return length;

	}

	public static void main(String[] args) {

		LineComparisonComputation obj = new LineComparisonComputation();

		int length1, length2;

		length1 = obj.lineCoordinates();
		Integer line1 = length1;
		// obj.lineCoordinates();
		System.out.println("Enter coordinates for second line ");

		length2 = obj.lineCoordinates();
		Integer line2 = length2;
		// obj.lineCoordinates();
		System.out.println("Length of line one is " + length1);
		System.out.println("Length of line two is " + length2);

		int result = line1.compareTo(line2);
		
		if (result > 0) {
			System.out.println("Line1 is greater than line2 ");
		} else if (result < 0)
			System.out.println("Line1 is lesser than line2 ");

		else
			System.out.println("Both lines are equal ");

	}
}
