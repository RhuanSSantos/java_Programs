import java.util.Locale;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, resultado;
			
		System.out.print("Quer saber a tabuada de qual numero? ");
		N = sc.nextInt();
		
		
		for(i = 1; i <= 10; i++) {
			resultado = N * i;
			System.out.println(N + " x " + i + " = " + resultado);
		}
		
		sc.close();
	}
}
