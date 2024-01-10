package Clase041223;

import java.util.Scanner;

public class EjercicioSumaArray04 {

	public static void main(String[] args) {
	//crear matriz
	int zigzag [][] = new int [4][4];
	int i = 0;
	int j;
	
	//llenar matriz
	
	System.out.println("Llene la matriz: ");
	Scanner sc = new Scanner(System.in);
	
	for(i = 0; i < zigzag.length;i++){
	if(i%2 == 0){
	for(j = 0; j < zigzag.length;j++){
    System.out.print("Elemento[" + i + "][" + j + "] = ");
	zigzag[i][j] = sc.nextInt();
	}
    }else{
    for(j = zigzag.length; j >= 0;j--){
	System.out.print("Elemento[" + i + "][" + j + "] = ");
	zigzag [i][j]= sc.nextInt();
	}}}
    
	
	//imprimir matriz
	for(i = 0; i < zigzag.length;i++) {
		for(j = 0; j < zigzag.length;j++) {	
	System.out.print(zigzag[i][j]+"\t");
	}
		System.out.println("");
}
}}