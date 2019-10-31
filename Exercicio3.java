//Exercício que exibe a diagonal principal de uma matriz 5X5
import java.util.Scanner;

public class Exercicio3 {
public static void main(String[]args) {
	int matriz[][] = new int[5][5];
	Scanner ler = new Scanner(System.in);
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
		int x = ler.nextInt();
			matriz[i][j]= x;
		}
	}
		for(int i=0;i<5;i++) {
			System.out.println(matriz[i][i]); 
		}
		
}
}

