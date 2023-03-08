/**
 * 
 */
package codigo;
import java.util.*;
/**
 * Clase que representa codigo
 * @author juanm
 *
 */
public class Codigo {
	public static Scanner sc;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce aquello que quieras mostrar por pantalla:");
		String s = sc.nextLine();
		print(s);
		diaDeHoy();
	}
	/**
	 * Método que imprime por pantalla el argumento pasado por parámetro
	 * @param s cadena que se imprimirá por pantalla
	 */
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void diaDeHoy() {
		System.out.println("Hoy es mi�rcoles.");
	}

}
