package bucles;

public class BreakYcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Detectar el n�mero m�s peque�o por debajo de 10000000 que sea par y m�ltiplo de 4 , 13 y 25
		
		// 1 --> 1000000
		//Detectar los 3 m�s peque�os
		int contador = 0;
		for(int j = 1;j<1_000_000;j++) {
			if(j%2 == 0 && j%4==0 && j%13==0 && j%25==0) {
				System.out.println(j);
				contador++;
				break;
			}
			
			if(contador==3) {
				break;
			}
			
		}
		
		//return;
		//continue
		
		//Mostrar todos los n�meros pares por debajo de 100
		
		for(int i = 2;i<=100;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.print(i + " ");
						
		}
		
		
		
		
		
		
	}

}
