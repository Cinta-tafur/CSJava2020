package tema5Metodos;

public class MiConsola {
	
	//M�todos que faciliten el env�o de informaci�n a la consola
	
	public static void p(String mensaje) {
		System.out.println(mensaje);
	}
	
	//M�todo que reciba una matriz y la printe por Consola
	
	public static void pMatriz(int matriz[]) {
		
		for(int valor : matriz) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	

}
