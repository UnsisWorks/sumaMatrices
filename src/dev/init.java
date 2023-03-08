package dev;

import java.util.Scanner;

public class init {

	static Scanner input = new  Scanner(System.in);
	
	public static void main(String[] args) {
		
		int mat1[][] = new int[2][2];
		int mat2[][] = new int[2][2];
		
		llenado(mat1 , mat2);
		
		for (int i = 0; i < mat1.length; i++){
			for (int j = 0; j < mat1.length; j++){
				System.out.print("[ " + mat1[i][j] + " ] ");
			}
			System.out.println("");
						
		}
	}
	
	public static void llenado (int[][] mat1, int[][] mat2) {

		System.out.println("Lenado de matriz uno");
		
		for (int i = 0; i < mat1.length; i++){
			for (int j = 0; j < mat1.length; j++){
				System.out.print("Ingrese el valor [ " + i + "] [" + j + " ]: ");
				mat1[i][j] = input.nextInt();
			}
			
		}

		System.out.println("Llenado de matriz dos");
		
		for (int i = 0; i < mat2.length; i++){
			for (int j = 0; j < mat2.length; j++){
				System.out.print("Ingrese el valor [ " + i + "] [" + j + " ]: ");
				mat2[i][j] = input.nextInt();
			}
			
		}
	}
}
