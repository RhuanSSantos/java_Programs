import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, negativos;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		negativos = 0;
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				if(mat[i][j] < 0) {
					negativos++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);
		
		sc.close();
	}
}
