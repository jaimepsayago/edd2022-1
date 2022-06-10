package pucese.edu.ec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String[] args) {
		// generar un menu utilizando switch
		String opcion;
		
		try {
			do{
				//opciones del menu
				System.out.println("---Menu---");
				System.out.println("1---Clientes---");
				System.out.println("2---Facturas---");
				System.out.println("3---tabla de multiplicar---");
				System.out.println("4---Finalizar---");
				opcion = leerTexto("Introduzca una opcion escogida: ");
						switch(opcion) {
						case "1":
							//codificacion
							System.out.println ("ejecuta mantenimiento clientes");
							//funcion
							//procimiento
							//metodo
							break;
						case "2":
							//codificacion
							System.out.println ("ejecuta facturas");
							break;
						case "3":
							//codificacion
							System.out.println ("ejecuta tabla de multiplicar");
							//funcion
							tablasMultiplicar();
							break;
						case "4":
							//codificacion
							System.out.println ("cerrar la aplicacion");
							System.exit(0); //cierra la aplicacion 
							break;
						}//fin switch
				
			}//fin del do while
			while(opcion.compareTo("4") != 0); //condicion
			
			
			
		}
			catch (Exception e){
			System.out.println("exception"+ e.getMessage());
			
		}
		
		
		
		

	}
	public static void tablasMultiplicar(){
		//for 
		/*
		 * estrucuta
		 * for ( inicio; comprobacion; actualizacion){
		 * 	sentencias
		 * }
		 *for mejorado
		 *leer objetos / coleccin / matrices 
		 * for ( TipoDato Objeto : coleccion/matriz/objeto)
		 * ejemplo for mejorado
		 *  for (Persona p : ListaPersona)
		 * 
		 */
		//tabla multiplicar
		
		for (int i = 1; i<= 10; i ++) {
			System.out.println("tabla del: " + i);
			//tabla de multiplica anidando la tabla con otro for
				for (int j = 1; j<=10; j++) {
					System.out.print(i + "x " + j + " = "+ (i*j) + " ");
				}
			//espacio 
				System.out.println(" ");
		}
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
