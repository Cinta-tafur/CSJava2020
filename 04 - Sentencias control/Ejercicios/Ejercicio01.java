
package Ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Detectar n�meros primos
		
		int numero  = 7;
		
		boolean primo = false;
		
		for(int i = 2;i<numero;i++) {
			if(numero%i==0) {
				primo = true;
				break;
				
			}
		}
		
		if(primo) {
			System.out.print("N�mero primo");
		}
		else {
			System.out.println("N�mero no primo");
		}
		
		
		
		
	}

}
