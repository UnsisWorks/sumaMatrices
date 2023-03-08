package dev;

import java.util.Scanner;

public class init {
	
	public static void main(String[] args){
	
		int i;
		int j;
		int n;
		int m;
		
		Scanner input = new  Scanner(System.in);
		
		System.out.print("Inserte el número de filas: ");
		n=input.nextInt();
		
		System.out.print("Inserte el número de columnas: ");
		m=input.nextInt();
		
		int M1 [][]= new int[m][n];
		int M2 [][]= new int[m][n];
		int M3 [][]= new int[m][n];
		
		llenado(M1);
		llenado(M2);
		sumar(M1,M2,M3);
		System.out.println("");
		imp(M3);
		
		input.close();
	}
	
	public static void llenado (int[][] mat1) {
		
		Scanner input = new  Scanner(System.in);

		System.out.println("Lenado de matriz");
		
		for (int i = 0; i < mat1.length; i++){
			for (int j = 0; j < mat1[0].length; j++){
				System.out.print("Ingrese el valor [ " + (i+1) + "] [" + (j+1) + " ]: ");
				mat1[i][j] = input.nextInt();
			}
			
		}
		

	}
	
	public static void sumar (int[][] M1, int[][] M2, int[][] M3 ) {
		
		for (int i = 0; i < M2.length; i++) {
			for (int j = 0; j < M2[0].length; j++) {
				M3[i][j]= M1[i][j] + M2[i][j];
			}
		}
	}
	
	public static void imp (int[][] M3) {
		for (int i = 0; i < M3.length; i++) {
			for (int j = 0; j < M3[0].length; j++) {
				System.out.print(M3[i][j]);
			}
			System.out.println("");
		}
	}
	
}
