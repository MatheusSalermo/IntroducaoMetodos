//Exercício que calcula a 4ª potênica por método
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int a, res;
		System.out.println("Digite o número inteiro que deseja calcular a quarta potência:");
		a = ler.nextInt();
		potencia(a);
	}
	public static void potencia(int a) {
		int res = a*a*a*a;
		System.out.println("A quarta potência de "+a+" é: "+res);
	}
}
