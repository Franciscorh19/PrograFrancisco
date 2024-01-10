package Clase041223;

import java.util.Scanner;

public class EjercicioSumaArray01 {

	public static void main(String[] args) {
		 //crear las matrices A, B y C
		int A [][] = new int [3][3];
		int B [][] = new int [3][3];
		int C [][] = new int [3][3];

		 //Introducir los datos en las matrices A y B
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("matriz A:");
			for (int i = 0; i < A.length; i++) {
			    for (int j = 0; j < A[i].length; j++) {
			        System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
			        A[i][j] = sc.nextInt();
			    }
			}
			
			System.out.println("matriz B:");
			for (int i = 0; i < B.length; i++) {
			    for (int j = 0; j < B[i].length; j++) {
			        System.out.print("Elemento[" + i + "][" + j + "] = ");
			        B[i][j] = sc.nextInt();
			    }
			}
		}
		
		for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
		
        
      //mostrar por pantalla las matrices A y B
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        //mostrar la matriz suma de A + B
        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            
            System.out.println();
	}
	}}

