package pucese.edu.ec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Funciones {
	public static void main(String[] args) {
		//funcion suma y con ingreso de datos(funiones) desde consola
		
		//ingreso de datos 
		
		String texto = leerTexto("introduzca valor 1");
		System.out.println("valor 1: " + texto);
		String valor2= leerTexto("introduzca valor2");
		System.out.println("valor 2: " + valor2);
		
		//operacion de la suma
		//suma(texto, valor2);
		
		System.out.println("la suma es:" + suma(texto, valor2));
	}
	public static int suma (String a, String b) {
		Integer x = 0, y=0;
		//operacion de casting
		x = Integer.parseInt(a);
		y = Integer.parseInt(b);
		return x+y;
	}
	public static String leerTexto(String mensaje) {
		String texto;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			texto=in.readLine();
		} catch (Exception e) {
			// erroes
			texto="error";	}
		return texto;
	}
	
}
