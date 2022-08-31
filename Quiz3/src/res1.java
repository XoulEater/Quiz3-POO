import java.util.Scanner;

//1. utilizando la menor cantidad de bytes posible escriba un main en java 
//   que lea un número entre 1 y 1000 desde consola, luego ese número lo 
//   multiplique por 8.721, lo divida entre 2, le reste 0.35 y finalmente
//   le haga módulo 1.63. Imprima el resultado sin perder los decimales.

public class res1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num = entrada.nextDouble();
		num = (num * 8.721 / 2 -0.35) % 1.63;
		System.out.print(num);
		
	}

}
