//Exerciício que calcula tabuada de um inteiro por método
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int a, res;
		System.out.println("Digite o número inteiro que deseja calcular a tabuada:");
		a = ler.nextInt();
		tabuada(a);
	}
	public static void tabuada(int a) {
		int res;
		int i = 0;
		while(i<=10) {
			res=a*i;
		System.out.println(a+" X "+ i + " = " +res);
			i++;
		}
	}
}
