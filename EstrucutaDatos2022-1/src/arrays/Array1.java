package arrays;

public class Array1 {

	public static void main(String[] args) {
		// declaracion
		int [] v;
		float w [];
		char ch[], p;
		//no se permite indicar el numero de elemento 
		//int numeros [12];//error!!

		//luego decimos que valores va a almacenar
		int [] matriz = new int [5];
		//posiciones
		matriz [0] = 15;
		matriz [1] = 25;
		matriz [2] = 8;
		matriz [3] = 7;
		matriz [4] = 92;
		//otra forma de agregar datos a la matriz
		int [] otraMatriz = {15,25,8,94,7,-9 };
		
		
		//leer u obtener los datos
		System.out.println(matriz[4]);
		
		//leer toda la matriz
		for (int i = 0; i<matriz.length; i++) {
			System.out.println("valor de i " + i + " valor de la matriz "+ matriz[i]);
		}
		//otra forma de recorrido  for each for mejorado
		
		for (int variable:matriz)
			System.out.println("datos: " + variable);
		
		//crear un array que se rellene con numero aleatorios y recorrerlos
		int [] matrizAleatorios = new int [150];
		//1.rellenando la matriz con datos aleatorios
		for(int i =0; i<matrizAleatorios.length; i++) {
			matrizAleatorios[i]= (int)Math.round(Math.random()*100);
		}
		int total=0;
		//2.recorrer la matriz
		for (int m: matrizAleatorios) {
			total+=m;
			System.out.print(m + " ");
			
		}
		System.out.println("suma de datos " + total);
		//3. sumar los datos
		
		///4. paso de arreglos a los metodos o funciones o procedimientos
		
		int array[] = {4,5,4,3,1};
		sum(array);
		
		//llamar a la funcion
		int array2 [];
		array2 = suma2();
		//falta mostrar
		for(int a:array2)
			System.out.println("recorre funcion matriz " + a);				
	}
	
	public static void sum(int [] array) {
		//manejar la operaciones para relizar una suma
		int sum=0;
		for(int s:array) {
			sum+=s;
		}
		System.out.println("suma del array es: " + sum);
		
	}
	
	public static int [] suma2() {
		//operaicones
		//int array[] = {4,5,4,3,1};
		
		return new int [] {1,2,3};
	}

}
