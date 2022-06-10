package pucese.edu.ec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Funciones {
	public static void main(String[] args) {
		//funcion suma y con ingreso de datos(funiones) desde consola
		
		//ingreso de datos 
		
		String valor1 = leerTexto("introduzca valor 1");
		System.out.println("valor 1: " + valor1);
		String valor2= leerTexto("introduzca valor2");
		System.out.println("valor 2: " + valor2);
		
		//operacion de la suma
		//suma(texto, valor2);
		//SI o NO
		String pregunta= leerTexto("se entrego la tara S/N");
		System.out.println("esta aprobado si o no: " + pregunta);
		
		
	
	//if - switch --->condicionales
	//repeticiones for while do while 
				// OBJETOS --> CONOCER MANEJOS DE OBJETOS - ARRAYS
	//estructura complejas pilas colas listas 
		//arboles grafos 
		
		//condiciones si el valor una es mayor a 5 y si preguntar si fue entregado la nota 
		//esta aprobado sino no esta aprobado
		
		//condiciones
		int z = Integer.parseInt(valor1);
		if (z > 5 && ((pregunta.charAt(0)=='S') || (pregunta.charAt(0)=='s'))) {
			System.out.println("el estudiante esta aprobado");
		}else {
			System.out.println("el estudiante no esta aprobado");
		}
				
		System.out.println("la suma es:" + suma(valor1, valor2));
		
		
		//operador ternario IF
		//if reducido
		//mas sencillo con lineas de codigo genero un if completo
		//estructura 
		//resultado = (condicion)? valor1: valor2;
		
		int x = 1;
		int y = 2;
		int mayor= 0;
		
		//el numero mayor de dos numeros
		mayor = (x < y) ? x : 0;
		
		System.out.println("operador ternario if: " + mayor);
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
