//Exerc�cio que calcula a 4� pot�nica por m�todo
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int a, res;
		System.out.println("Digite o n�mero inteiro que deseja calcular a quarta pot�ncia:");
		a = ler.nextInt();
		potencia(a);
	}
	public static void potencia(int a) {
		int res = a*a*a*a;
		System.out.println("A quarta pot�ncia de "+a+" �: "+res);
	}
}
