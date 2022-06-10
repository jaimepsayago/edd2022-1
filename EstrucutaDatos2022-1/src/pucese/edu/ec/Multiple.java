package pucese.edu.ec;

public class Multiple {

	public static void main(String[] args) {
		// switch se utiliza cuando tengo varias condiciones y opciones para una condicion
		//seleccionamos un dia de la semana de acuerdo a un numero
		/*
		 * switch (condicion/variable){
		 * case 1: break;
		 * case 2.......
		 * 
		 * case n: break;
		 * }
		 */
		//dia de la semana en numero
		char diaSemana = '7'; 
		
		switch (diaSemana) {
		
		case '1':
			//codificacion
			System.out.println ("lunes");
			break;
		case '2':
			//codificacion
			System.out.println ("martes");
			break;
		case '3':
			//codificacion
			System.out.println ("miercoles");
			break;
		case '4':
			//codificacion
			System.out.println ("jueves");
			break;
		case '5':
			//codificacion
			System.out.println ("viernes");
			break;
		case '6':
			//codificacion
			System.out.println ("sabado");
			break;
		case '7':
			//codificacion
			System.out.println ("domingo");
			break;
			
		}
		

	}

}
