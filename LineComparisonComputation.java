package com.BridgeLabz.LineComparison;

import java.util.Scanner;

public class LineComparisonComputation {
	Scanner scan = new Scanner(System.in);
	float x1, y1, x2, y2;
	static float length;

	public float lineCoordinates() {
		System.out.println("Enter point for x1 and y1");
		x1 = scan.nextFloat();
		y1 = scan.nextFloat();

		System.out.println("Enter points for x2 and y2 ");
		x2 = scan.nextFloat();
		y2 = scan.nextFloat();

		length = (float) Math.sqrt((Math.pow((x2 - x1), 2))
				+ (Math.pow((y2 - y1), 2)));
		return length;

	}

	public static void main(String[] args) {
		LineComparisonComputation obj = new LineComparisonComputation();

		float length1, length2;
		
		length1 = obj.lineCoordinates();
		// obj.lineCoordinates();
		System.out.println("Enter coordinates for second line ");
		
		length2 = obj.lineCoordinates();
		// obj.lineCoordinates();
		System.out.println("Length of line one is " + length1);
		System.out.println("Length of line two is " + length2);
		
		if(length1 == length2){
			System.out.println("Lines are Equal");
		}
		else
			System.out.println("Lines are not Equal");
	}

}
