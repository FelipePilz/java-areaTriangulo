package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	
/* Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
   v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
   possui a maior �rea. */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle(); 
		
		System.out.println("Enter de measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter de measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); //objeto.Classe();
		double areaY = y.area(); //
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY){
			System.out.println("Larger area: X");
		}else if(areaX < areaY){
			System.out.println("Larger area: Y");
		}else {
			System.out.println("Both are equal!");
		}
		
		sc.close();
	}

}
