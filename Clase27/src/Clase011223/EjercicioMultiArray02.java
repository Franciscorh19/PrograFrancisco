package Clase011223;



public class EjercicioMultiArray02 {
	public static void main(String[] args) {
		
		
		int darray [][] = new int [10][10];
		
	
		
		for(int i=0 ; i <darray.length; i++) {
			for(int j=0 ; j < darray[i].length; j++) {
		
	    if(i==j){
	    	darray [i][j]= 1;
	    }else {
	    	darray [i][j]= 0;
	    }
	    }
		}
				
		System.out.println("La matriz 10x10 generada es: ");
		
		for(int i=0 ; i <darray.length; i++) {
			for(int j=0 ; j < darray[i].length; j++) {
		
		System.out.print(darray[i][j]+"\t");
		
			}	
			System.out.println();
		}	
	}}
		
		
		
	

