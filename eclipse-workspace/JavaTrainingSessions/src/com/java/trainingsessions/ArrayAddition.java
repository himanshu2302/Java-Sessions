package com.java.trainingsessions;

import java.util.Scanner;

public class ArrayAddition {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [][] a= new int[3][3];
		int [][] b = new int [3][3];
		System.out.println("Enter integers:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter integers:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int [][] x, y[][], z[][];
	}
}
