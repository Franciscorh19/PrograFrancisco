package Clase271123;

import java.util.Arrays;

public class EjercicioArray05 {

	public static void main(String[] args) {
		Boolean[] boolArray = {false,false,false,false,false}; 	     
	      Arrays.fill(boolArray, Boolean.TRUE);
	      // all the values will be true
	      for (int i = 0; i < boolArray.length; i++) {
	         System.out.println(boolArray[i]);
	      }
	   }
	}