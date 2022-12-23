package com.BridgeLabz.LineComparison;

import java.util.Scanner;

public class LineComparisonComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float x1, y1, x2, y2, length1;
		
		System.out.println(" Enter point for x1 and y1");
		x1 = scan.nextFloat();
		y1 = scan.nextFloat();
		
		System.out.println(" Enter points for x2 and y2 ");
		x2 = scan.nextFloat();
		y2 = scan.nextFloat();
		
		length1 = (float) Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("Length of line one is " + length1);
	}

}
