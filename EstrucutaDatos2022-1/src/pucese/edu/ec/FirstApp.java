package pucese.edu.ec;

import java.util.Calendar;
import java.util.Scanner;

/*
 * comentarios varias lineas
 */
public class FirstApp {

	public static void main(String[] args) {
		// comentario una sola linea
	
		//imprimir un mensaje por consola
		System.out.println("hola mundo desde java por jsh");
		
		/*
		 * Bienvenido
		 * a
		 * la programcion
		 * en java
		 */
		
		//formatos libreria printf
		
		System.out.printf("%s \n %s \n %s ","Bienvenido", "a", "la programacion en java");
		
		//salida con print
		//ingreso de datos
		
		//Scanner permite leer datos como Int, String, Double
		
		//instanciar un objeto de tipo Scanner
		Scanner input = new Scanner(System.in);
		//pedir mensaje con ingreso de texto
		System.out.println("INGRESE EL TEXTO REQUERIDO: ");
		//asignar la entrada a la variable texto
		String texto = input.nextLine();
		
		//mostrar dato obtenido
		System.out.println("Este es un texto desde consola: "+texto);
		
		//formatos
		double n = 1.25036;
		System.out.printf("%.3f %n", n);
		int x =10;
		System.out.printf("%d %n", x);
		
		//calendario
		//crear objeto de tipo calendario con la fecha actual
		Calendar fechahora = Calendar.getInstance();
		
		//imprimir la fecha con con el formato a;o mes y dia
		System.out.printf("%tF \n",fechahora);
		
		//imprimir la fecha con con el formato mes dia anio
				System.out.printf("%tD \n",fechahora);
		
		//imprimir la fecha con con el formato hora minuto  mes dia anio
		System.out.printf("%tT \n",fechahora);
		
		

	}

}
