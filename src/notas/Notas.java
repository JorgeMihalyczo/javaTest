package notas;
import java.util.Scanner;
/**
 * Clase que permite comprobar la aprobacion de notas ingresadas por el usuario.
 * @author jorge
 *
 */
public class Notas {
	//declaramos la variables que nos hacen falta.
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	Scanner entrada = new Scanner(System.in);
	/**
	 * Metodo que permite al usuario ingresar las notas a traves del teclado.
	 */
	public void IngresaNotas() {
		//cuando ejecutamos este metodo lo primero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");	
		System.out.print("ingrese nota 1: ");
		uf1= entrada.nextDouble();
		System.out.print("ingrese nota 2: ");
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		uf3= entrada.nextDouble();
	}
	/**
	 *  Metodo para comprobar la correcta introduccion de notas
	 */
	public void comprobacion(){
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");	
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	/**
	 * metodo para calcular nota
	 */
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		def = acu1 + acu2+ acu3;	
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	/**
	 * Metodo para mostrar las notas
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumulado 1 = "+ acu1);
		System.out.println(" acumualdo 2 = "+ acu2);
		System.out.println(" acumulado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
	}
	/**
	 * Metodo para comprobar si el alumno esta aprobado o no
	 */
	public void aprobado() {
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
	/**
	 * Metodo main, crea un objeto de tipo notas y llama a todos los metodos de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		// creamos mecanismos para llamar a cualquier metodo fuero de la clase
		Notas fc= new Notas();
		fc.IngresaNotas();	
		fc.comprobacion();
		fc.Calculonotas();
		fc.Mostrar();	
		fc.aprobado();
	}
}
