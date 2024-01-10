package Clase041223;

import java.util.Scanner;

public class EjercicioSumaArray02 {
	public static void main(String[] args) {
		
		 //crear las matrices
		int array [][] = new int [4][4];
		int matrizT[][] = new int [4][4];
		//Introducir los datos en la matriz
		Scanner sc = new Scanner(System.in); 
		System.out.println("Llene la matriz: ");
		for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
	    System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
	    array[i][j] = sc.nextInt();
			    }
			}
		//mostrar por pantalla la matriz
		 System.out.println("matriz A:");
	     for (int i = 0; i < array.length; i++) {
	     for (int j = 0; j < array[i].length; j++) {
	     System.out.printf("%3d", array[i][j]);
		
	}
	     System.out.println();
}
	     
	   //generar matriz traspuesta
	     for (int i=0; i < array.length; i++) {
	    	  for (int j=0; j < array[i].length; j++) {
	    	    matrizT[j][i] = array[i][j];
	    	  }}
	   //mostrar por pantalla la matriz traspuesta
		 System.out.println("Matriz traspuesta:");
	     for (int i = 0; i < matrizT.length; i++) {
	     for (int j = 0; j < matrizT[i].length; j++) {
	     System.out.printf("%3d", matrizT[i][j]);
	     }
	     System.out.println();
	     }
	     sc.close();    
	}
	}    
	     
	     
	     