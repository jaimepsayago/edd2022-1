package pucese.edu.ec;

import java.util.Random;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// ejemplo operadores logicos
		
		//generar un numero randomico a traves de un objeto tipo Random
		Random aleatorio = new Random();
		
		//asignar el numero randomico a dos variables
		int i = aleatorio.nextInt() %100;
		int j = aleatorio.nextInt() %100;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		
		System.out.println("i < j es "+ (i<j));
		System.out.println("i > j es "+ (i>j));
		
		System.out.println("i <= j es "+ (i<=j));
		System.out.println("i >= j es "+ (i>=j));
		
		System.out.println("i == j es "+ (i==j));
		System.out.println("i != j es "+ (i!=j));
		
		
		System.out.println("(i < 10) && (j < 10) es "+ ((i<10) && (j<10)));
		System.out.println("(i < 10) || (j < 10) es "+ ((i<10) || (j<10)));
		
		

	}

}
