package clasesMatematicas1;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Random;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Librer�a Math --> java.lang 
		//Potencias : pow
		int resultado = (int)Math.pow(2,4);
		//Ra�z cuadrada : sqrt
		float raizCuadrada = (float)Math.sqrt(23);
		
		System.out.println("Raiz de 23 = " + raizCuadrada);
		
		float raizCuadradaRedondeo = (float) Math.floor(raizCuadrada);
		
		System.out.println("Ra�z de 23 redondeada por abajo: " + raizCuadradaRedondeo);
		
        float raizCuadradaRedondeo2 = (float) Math.ceil(raizCuadrada);
		
		System.out.println("Ra�z de 23 redondeada por arriba: " + raizCuadradaRedondeo2);
		
		raizCuadrada = 4.3679f;
		float raizCuadradaRedondeo3 = (float) Math.round(raizCuadrada);
		
		
		System.out.println("Ra�z de 23 redondeada al m�s cercano: " + raizCuadradaRedondeo3);
		
		//Redondeo con dos decimales
		
		System.out.printf("Raiz cuadrada con dos decimales %.2f", raizCuadrada);
		DecimalFormat df = new DecimalFormat("####.###");
		System.out.println();
		System.out.println(df.format(raizCuadrada));
		
		
		System.out.println("N�meros aleatorios:");
		//Generar n�meros aleatorios
		int aleatorio =(int)Math.random()*10;
		System.out.println(aleatorio);
		
		Random r = new Random();
		System.out.println(r.nextInt(50));
		
		
		
		
		
		
		
		
	}

}
