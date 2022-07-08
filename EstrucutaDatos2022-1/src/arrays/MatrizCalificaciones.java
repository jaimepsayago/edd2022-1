package arrays;

public class MatrizCalificaciones {

	public static void main(String[] args) {
		//generar una matriz
		int arregloCalif[][] = { 
				{87,96,70},
				{68,87,90},
				{100,81,82},
				{83,65,85},
				{78,87,65},
				{85,75,83},
				{91,94,100},
				{76,72,84},
				{87,93,73},
		};
		imprimirCalificaciones(arregloCalif);//llamar funcion y enviar parametros
		System.out.println("calificacion maxima "+obtenerMaximo(arregloCalif));
		imprimirGraficoBarras(arregloCalif);
	}
	//funciones
	//imprimir las califaciones
	public static void imprimirCalificaciones(int [][] calificaciones) {
	System.out.println("las calificaciones son:\n");
	System.out.print("          ");
	//crear el encabezado
	for (int prueba=0; prueba < calificaciones[0].length;prueba++) 
		System.out.printf("prueba %d ", prueba +1);
		System.out.println("promedio");
	//crear las filas y las columnas con las respectivas calificaciones
		for(int estudiante = 0;estudiante<calificaciones.length; estudiante++) {
			System.out.printf("Estudiante %2d", estudiante +1);
		//imprimir las calificacione
			for (int p:calificaciones[estudiante])
				System.out.printf("%8d",p);
		//promedio
			double promedio = obtenerPromedio(calificaciones[estudiante]);
			System.out.printf("%9.2f",promedio);
		System.out.println();
		}//fin 2do for
	//}//fin for principal
	}//fin funcion imprimirCalificaciones
	//funcion para obtener el promedio
	public static double obtenerPromedio(int conjuntoCalific []) {
		int total =0;
		for (int cal:conjuntoCalific)
			total+=cal;
	return (double) total/conjuntoCalific.length;
		
	}
	//funciones para obtenr maximos
	public static int obtenerMaximo(int calificaciones[][]) {
		//1 crear matriz vacia
		int caliMax= calificaciones[0][0];
		//for para realizar una iteracion a traves de las filas del arreglo
		for(int califEstudiantes[]:calificaciones) {
			//revisar las columnas
			for(int calificacion: califEstudiantes) {
				//si la calificacinoes es menor y se asigna el valor
				if (calificacion > caliMax )
					caliMax=calificacion;
			}
		}
		return caliMax;
	}
	
	//funcion para obtener el minimo
	
	//funcion para el grafico 
	
	public static void imprimirGraficoBarras (int calificaciones [][]) {
		System.out.println("distribucion de calificaciones");
		//almancer la frecuencia de las califaciones en cada rato de 10 calificaciones 
		int frecuencia[] = new int[11];
		//para cada calificaciones en el libro de califaciones se incrementa la frecuenca apropiada
		for(int califestudiantes[]:calificaciones) {
			for (int calificacion:califestudiantes) {
				++frecuencia[calificacion/10];
			}
		}
		//for (int f: frecuencia)
			//System.out.println(f);
		//para cada frecuenca de calificaciones, imprmir una barra de grafico
		for (int cuenta=0; cuenta<frecuencia.length;cuenta++) {
			if (cuenta == 10)
				System.out.printf("%5d:",100);
			else
				System.out.printf("%02d - %02d:", cuenta*10, cuenta*10+9);
			//imprimir el grafico
			for (int estrellas=0; estrellas<frecuencia[cuenta]; estrellas++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
