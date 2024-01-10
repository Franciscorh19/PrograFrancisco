package Clase011223;

import java.util.Scanner;

public class EjercicioMultiArray03 {

	public static void main(String[] args) {
		int darray [][] = new int [5][5];
		int suma = 0;
		int media = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0 ; i <darray.length; i++) {
				for(int j=0 ; j < darray[i].length; j++) {
			
			System.out.println("Ingrese las notas: ");
			darray[i][j] = sc.nextInt();
			suma += darray[i][j];
			}		
			}
		}
		
		System.out.println("La matriz 5x5 generada es: ");
				
		for(int i=0 ; i <darray.length; i++) {
			for(int j=0 ; j < darray[i].length; j++) {
		System.out.print(darray[i][j]+"\t");
		}	
		System.out.println();
		}
		
		int i=darray.length;
		int j=darray[i].length;
		media = suma/(i*j);
		System.out.println("La media de los datos es: "+media);
		
		}
		}

