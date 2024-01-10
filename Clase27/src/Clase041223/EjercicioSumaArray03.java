package Clase041223;

import java.util.Scanner;

public class EjercicioSumaArray03 {
	public static void main(String[] args) {
		//crear matriz
int darray [][] = new int [5][5];
		
		//llenar la matiz
        Scanner sc = new Scanner(System.in); 
        System.out.println("Llene la matriz: ");
		for(int i=0 ; i <darray.length; i++) {
			for(int j=0 ; j < darray[i].length; j++) {
		
	    
				
	    if(i==j){
	    	System.out.print("Elemento[" + i + "][" + j + "] = "); 
	    	darray[i][j] = sc.nextInt();
	    	
	    }else {
	    	darray [i][j]= 0;
	    }}}
	   			
		//imprimir la matriz
		System.out.println("La matriz 5x5 generada es: ");
		for(int i=0 ; i <darray.length; i++) {
			for(int j=0 ; j < darray[i].length; j++) {
		
		System.out.print(darray[i][j]+"\t");
		
			}	
			System.out.println();
		}	sc.close();
	}
}
