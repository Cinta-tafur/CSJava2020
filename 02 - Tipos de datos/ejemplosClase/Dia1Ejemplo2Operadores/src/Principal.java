
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores Matem�ticos = asignacion
		//+ suma
		//- resta 
		//Ojo con la promoci�n num�rica
		
		short numero2 = 34;
		short numero3 = (short)(numero2 - 1);
		
		//* multiplicaci�n
		// / cociente: Devuelve un entero si los operandos son enteros
		
		int x = 7 , y = 0;
		double cociente = (double)x / y;
		System.out.println("El cociente es : " + cociente);
		
		//Otros operadores matem�ticos
		// %: Resto de la divisi�n entera
		int resto = x % y;
		System.out.println("El resto de la divisi�n entera es: " + resto);
		
		//Incremento y asignaci�n +=
		
		int n = 9;
		n = n+ 5;
		n+=5;
		//Decremento y asignaci�n
		n = n - 2;
		n-=2;
		
		//Preincremento y postIncremento ++
		n = 1;
		int n2 = n++;
		System.out.println("n = " + n);
		System.out.println("n2 = " + n2);
		
		//Predecremento y postdecremento --
		
		int x1 = 10;
		int x2 = x1--;
		
		
		
		
		
	}

}
