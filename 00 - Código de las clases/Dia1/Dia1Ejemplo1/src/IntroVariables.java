
public class IntroVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaraci�n de variables
		int numero1; //Sin inicializar
		int numero2 = 9;
		byte numero3 = -128;
		short numero4 = 900;
		long numero5 = 9_000_000_000_000L;
		
		float numero6 = 4.56f;
		double numero7 = 4.90;
		
		//Modificar valores de una variable
		numero2 = 10;
		//Aumentar en una unidad el valor de la variable numero2
		numero2 = numero2 + 1;
		numero2 = numero2 + 2;
		
		//numero1 = numero1 + 1;
		
		//Promoci�n de variables:
		//numero3 = numero3 + 1;
		//Conversi�n expl�cita de tipos
		numero3 = (byte)(numero3 - 5);
		System.out.println(numero3);
		
		//Declaraci�n de varias variables en una misma linea
		int x1,x2,x3;
		float Temp1 = 9.4f,temp2 = 7.4f,temp3 = 2.9f;
		
		//Reglas para los nombres de las variables.
		//1. No pueden contener espacios int x 1;
		//2. No pueden empezar por n�meros int 1x;
		//3. No pueden contener caracteres especiales , salvo _ . $
		//4. No pueden ser palabras reservadas.
		//5. Empiezan siempre por min�sculas(convenci�n)
		//6. Si el nombre es compuesto , la inicial de la segunda se escribe en may�scula
		float temperaturaMaxima= 90;
		
		//Mostrar info de variables por consola
		System.out.println("La temperatura m�xima es de : " + temperaturaMaxima + " grados.");
		
		System.out.println("Como dijo Valdano: \"El f�tbol as�\"");
		
		System.out.println("Voy a \t escribir \n en otra l�nea");
		
		System.out.println("El archivo est� en C:\\mis documentos");
		
				
				
		
		

	}

}
