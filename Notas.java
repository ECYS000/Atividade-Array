package Atividade;

import java.util.Arrays;
import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4];
		String nome;
		
		System.out.println("Qual é seu nome?");
		nome = entrada.nextLine();
		
		for (int loop=0; loop<=3; loop++ ) {
			
			System.out.printf("Informe a nota %d \n",loop+1);
			notas[loop] = entrada.nextDouble();
			
		}
		
		System.out.println("notas de "+nome+ " é:"+Arrays.toString(notas));
		
		
		entrada.close();
		
	}

}
