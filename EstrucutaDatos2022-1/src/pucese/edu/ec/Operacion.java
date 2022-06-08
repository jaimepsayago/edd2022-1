package pucese.edu.ec;

public class Operacion {

	public static void main(String[] args) {
		// factura
		
		//atribuos
		//precio unitario, preciofinal, unidades, iva, 
		double precioUnitario, precioFinal;
		byte unidades;
		final byte iva = 12; //constante
		//inicializar las variables
		unidades=10;
		precioUnitario=53.78;
		
		//operacion de precio final
		precioFinal = (precioUnitario * unidades) + (iva / (double)100 * (precioUnitario*unidades));
		
		//imprimir los datos
		System.out.println("precio unitario *  unidades " + precioUnitario *  unidades);
		System.out.println(" precio final de compra " + precioFinal);
		System.out.println("metodo para devolver iva " + devolver(45) );
		
	}
	
	public static int devolver(int dato) {
		int a =10;
		return  a + dato;
	}
	
	
	
	

}
