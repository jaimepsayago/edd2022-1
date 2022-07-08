package pucese.edu.ec;

public class Excepciones {

	public static void main(String[] args) {
		// lenguaje de programacion == fallos!
		/*
		 * try == intentar
		 */
		int n=1,d, z=0;
		String cadena = "1";
		
		try {
			//codigo
			//n = Integer.parseInt(cadena);
			
			System.out.println(d=n/z);
		}catch(/*tipo de error*/ ArithmeticException ex ){
			//catch=captura
			//codigo para tratar la excepcion
			System.out.println("no es posible una division por zero");
		}
		catch(NumberFormatException nex) {
			System.out.println("no esun numero , es una cadnea");
		
		}finally {
			//codigo de finalizacion
			
		}

	}

}
