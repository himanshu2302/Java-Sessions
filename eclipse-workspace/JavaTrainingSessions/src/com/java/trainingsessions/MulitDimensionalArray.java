package com.java.trainingsessions;

import java.util.Scanner;

public class MulitDimensionalArray {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int [3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}
