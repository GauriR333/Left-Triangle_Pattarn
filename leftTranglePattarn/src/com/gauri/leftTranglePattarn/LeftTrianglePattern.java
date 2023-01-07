package com.gauri.leftTranglePattarn;

public class LeftTrianglePattern {
	public static void main(String args[]) {

		int i, j, row = 10;
		for (i = 0; i < row; i++) {
			for (j = 2 * (row - 1); j >= 0; j--) {

				System.out.print("");
			}

			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
