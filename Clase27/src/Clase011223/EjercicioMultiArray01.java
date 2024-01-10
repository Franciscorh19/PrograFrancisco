package Clase011223;

import java.util.Scanner;

public class EjercicioMultiArray01 {
	
	public static void main(String[] args) {
	int darray [][] = new int [3][3];
	
	try (Scanner sc = new Scanner(System.in)) {
		for(int i=0 ; i <darray.length; i++) {
			for(int j=0 ; j < darray[i].length; j++) {
		
		System.out.println("Ingrese un valor: ");
		darray[i][j] = sc.nextInt();
			}		
		}
	}
	
	System.out.println("La matriz 3x3 generada es: ");
	
	for(int i=0 ; i <darray.length; i++) {
		for(int j=0 ; j < darray[i].length; j++) {
	
	System.out.print(darray[i][j]+"\t");
	
		}	
		System.out.println();
	}	
	
		}
	}
	
