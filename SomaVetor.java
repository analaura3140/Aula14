package aula14;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		for(int i = 0; i<a.length; i++) {
			System.out.println("Informe um valor: ");
			a[i]=ler.nextInt();		
		
        soma+=a[i];
	}
	
		
		System.out.println("O resultado é: " +soma);

	ler.close();
	}
}