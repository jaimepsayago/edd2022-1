package arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// declaracion
		
		double [][] temperaturas = new double [3][4];
		temperaturas[0][0] = 20.5 ;
		temperaturas[0][1] = 30.6;
		temperaturas[0][2] = 28.3 ;
		temperaturas[0][3] = 58.3;
		
		temperaturas[1][0] =  38.7;
		temperaturas[1][1] =  18.3;
		temperaturas[1][2] = 16.2;
		temperaturas[1][3] = 15.3;
		
		
		temperaturas[2][0] = 14.7;
		temperaturas[2][1] = 68.3;
		temperaturas[2][2] = 36.2;
		temperaturas[2][3] = 78.2;
		
		//otra forma de llenado manul
		int [][] temperatures = {
				{45,5,6,5,4},
				{8,4,7,8,5}
		};
		//otra forma de llenar
		//for anidado
		
		//recorrer los datos 
		for ( double [] columna:temperaturas) {
			System.out.println();
			for(double f:columna)
				System.out.println(f + " ");
		}
	}

}
