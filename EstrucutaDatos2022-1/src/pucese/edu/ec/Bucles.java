package pucese.edu.ec;

public class Bucles {

	public static void main(String[] args) {
		// bucle anidado
		//un bucle dentro de otro bucle
		//figuras geometricas regulares
		//patrones
		
/*		for (int i = 1; i<=3; i++) {
			for (int j = 1; j <=2; j++ ) {
				System.out.println("i : "+ i + "j: " + j);
			}
		}

	System.out.println("ejercicio 2-*-----");
	
	//matrices bidimensioales son utilizadas o representadas con bucles anidados
	//un bucle anidad en el cuerpo exterior del bucle se ejecutara 5 veces y
	//en el bucle interno se imprimira 10 numeros
	//para un total de 50 numeros impresos
	
	for (int a = 1; a<=5; a++) {
		for (int b = 1; b <=10; b++ ) {
			System.out.print("a*b= "+ (a*b) +  " ");
		}System.out.println();
		
		
	}
	
	//un cuadrado 
	/*
	 * for (int a = 1; a<=10; a++) { for (int b = 1; b <=10; b++ ) {
	 * System.out.print("* "); }System.out.println();
	 * 
	 * }
	 */
	
	//medio triangulo
	/*for (int a = 1; a<=10; a++) {
		for (int b = 1; b <=a; b++ ) {
			System.out.print("* ");
		}
	System.out.println();
			
	}*/
	
	//Ejercicios
	//cual es el codigo para esto
	/*
	 1, 1
	 2, 1
	 3, 1
	 1, 2
	 2, 2
	 3, 2
	 
	 */
	
	/*for (int a = 1; a<=2; a++) {
		for (int b = 1; b <=3; b++ ) {
			System.out.println(b + "," + a);
		}*/
	//System.out.println();
		/*for (int c = 4; c >=1; c--) {
			System.out.print("c"+ c);
		}	*/
	//bucle exterior 
	int x=4;
	for (int a = 1; a<=5; a++) {
		//bucle interno
		
		for (int b = x; b >0; b--) {
			System.out.print(".");
		}
		x = x-1;
		System.out.print(a);
		for (int c = 1; c <=(a-1); c++) {
			System.out.print(".");
		}	
		System.out.println();
	}
	
	
	
	
}
}
