package misClases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Estamos en cuarentena";
		int numeroVocales = MetodosCadenas.contarVocales(mensaje);
		
		
		System.out.println(mensaje + " tiene " + numeroVocales + " vocales.");
		
		//Probar m�todo getFirstNullPosition
		
		String cadenas[] = {"Rodrigo",null,"Alejandro","Cousi�o"};
		
		int primeraPosVac�a = MetodosCadenas.getFirstNullPosition(cadenas);
		
		
		if(primeraPosVac�a<0) {
			System.out.println("No hay posiciones vac�as.");
		}
		else {
			System.out.println("La primera pos vac�a es : " + primeraPosVac�a);
		}
		
		
		
	}

}
