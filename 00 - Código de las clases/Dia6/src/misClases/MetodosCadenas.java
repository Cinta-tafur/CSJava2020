package misClases;

public class MetodosCadenas {
	
	//En java 4 atributos de acceso distintos:
	//public: permite llamar el m�todo desde cualquier clase del proyecto.
	//private: permite llamar al m�todo desde la propia clase.
	//protected: permite llamar al m�todo desde clases hijas.
	//por defecto : permite llamar al m�todo desde clases del mismo paquete
	
	public static int contarVocales(String cadena) {
		
		int contador = 0;
		String vocales="aeiouAEIOU";
		for(int i  = 0;i<cadena.length();i++) {
			/*if(cadena.charAt(i)=='a'||cadena.charAt(i)=='e'||cadena.charAt(i)=='o'||cadena.charAt(i)=='i') {
				contador++;
			}*/
			if(vocales.contains(Character.toString(cadena.charAt(i)))) {
				contador++;
			}
			
		}
		
		return contador;
		
	}	
	
	//M�todo que recibe una matriz de Strings y devuelve la primera posici�n vac�a
	
	public static int getFirstNullPosition(String matriz[]) {
		int posicion = -1;		
		//Recorrer la matriz en busca de la primera posicion null
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==null) {
				//actualizo la variable posicion
				posicion = i;
				//Fuerzo para salir del bucle
				break;
			}
		}		
		return posicion;
	}
	
	public static void p(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static String spaceKiller(String cadena) {
		cadena = cadena.trim();
		cadena = cadena.replaceAll(" ","");
		return cadena;
	}
	
	
	

}
