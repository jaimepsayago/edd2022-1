package pucese.edu.ec;

public class FigurasComplejas {

	public static void main(String[] args) {

		//for lineas
		for (int line = 1; line <= 4; line++ ) {
			System.out.print("|");
			//for espacios izquierda
			for (int space = 1; space <= (line  * -2 + 8); space++ ) {
				System.out.print(" ");
			}
			System.out.print("<>");
			//for de puntos
			for (int dot = 1; dot <= (line  * 4 -4); dot++ ) {
				System.out.print(".");
			}
			System.out.print("<>");
			//for espacios derecha
			for (int space = 1; space <= (line  * -2 + 8); space++ ) {
				System.out.print(" ");
			}
			System.out.println("|");
		//			System.out.println();
		}//fin for lineas
		//System.out.print("|");
	}

}
