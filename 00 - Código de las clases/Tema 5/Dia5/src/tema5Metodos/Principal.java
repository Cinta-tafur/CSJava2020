package tema5Metodos;

public class Principal {

	//Declarando la funci�n resetear
	static int resetear(int numero) {
		numero = 0;
		return numero;
	}
	
	//Funci�n que devuelva un booleano true si un n�mero es par false si es impar
	
	static boolean isPar(int numero) {
		/*boolean par = false;
		
		if(numero%2==0) {
			par = true;
		}
		
		return par;*/
		if(numero%2==0) {
			return true;			
		}
		else {
			return false;
		} 
		
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variable = 10;
		
		//variable = resetear(variable);
		
		//System.out.println("variable = " + variable);
		
		//Comprobaci�n m�todo isPar
		
		if(isPar(variable)==true) {
			System.out.println("N�mero par");
		}
		else {
			System.out.println("Numero impar");
		}
			
			System.out.println("variable = " + variable);
			
			
		
	}

}
