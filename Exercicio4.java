//Exercício que faz um "Triângulo" na matriz
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);	
    int matriz[][]= new int [5][5],i=0,reset=0, linha,coluna, vetor[]=new int[75],n;

    for (linha=0;linha<5;linha++){
       for(coluna=0;coluna<5;coluna++){
          if(coluna==0) {
        	  matriz[linha][coluna]=1;
          }else if(coluna==1){ 
        	  if (linha==1||linha==2||linha==3) {
        		  matriz[linha][coluna]=1;
          }
          }else if(coluna==2&&linha==2) {
        	  matriz[linha][coluna]=1;
          }else if(coluna==4||coluna==3){
        	  matriz[linha][coluna]=0;
          }
       }
       coluna=0;
   }
   linha=0;
   for (linha=0;linha<5;linha++){
       System.out.println();
       for(coluna=0;coluna<5;coluna++){
           System.out.print(matriz[linha][coluna]+" ");
       }
   }
	
	
	
	
	
	
	
		}
	
}
