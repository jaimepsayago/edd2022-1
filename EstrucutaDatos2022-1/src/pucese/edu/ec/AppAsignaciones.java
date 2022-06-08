package pucese.edu.ec;

public class AppAsignaciones {

	public static void main(String[] args) {
		// Asignaciones
		int numero1 = 20;
		int numero2= 4;
		
		//equivale a numero = numero + numero2
		System.out.println("numero 1 += numero2 --->");
		numero1+=numero2;//numero1= numero1 +numero2
		System.out.println(numero1);
		
		//resta
		System.out.println("numero 1 -= numero2 --->");
		numero1= 20;
		numero2 =4;
		numero1-=numero2;
		System.out.println(numero1);
		
		//multiplicacion
		System.out.println("numero 1 *= numero2 --->");
		numero1= 20;
		numero2 =4;
		numero1*=numero2;
		System.out.println(numero1);
		
		//division 
		System.out.println("numero 1 /= numero2 --->");
		numero1= 20;
		numero2 =4;
		numero1 /=numero2;
		System.out.println(numero1);
		
		//pre y post incremento
		int i = 1;
		System.out.println("i: " + i);
		//pre incremento
		System.out.println("++i: " + ++i);
		//post incremento
		System.out.println("++i: " + i++);
		//pre decremento
		System.out.println("--i: " + --i);
		//post decremento
		System.out.println("--i: " + i--);
		
		//COMPARACIONES
		int n1 = 47;
		int n2 = 47;
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		//equals
		Integer n3 = 47;
		Integer n4 = 85;
		System.out.println(n3.equals(n4));
		
			
		int x= Integer.parseInt("752"); //primitivo
		Double y= Double.valueOf("3.14").doubleValue(); //objeto
		
	}

}
