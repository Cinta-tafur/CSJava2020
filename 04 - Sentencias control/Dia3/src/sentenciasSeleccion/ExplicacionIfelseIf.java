package sentenciasSeleccion;

public class ExplicacionIfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temperaturaDelAgua = 200f;
		
		//Programa indica si el agua est� en fase l�quida,gaseosa o s�lida
		
		if(temperaturaDelAgua <= 0) {
			System.out.print("S�lida , es hielo");
		}
		else if(temperaturaDelAgua < 100) {
			System.out.println("L�quida, es agua");
		}
		else {
			System.out.println("Gaseosa , es vapor de agua");
		}
		
		
		
		
	}

}
