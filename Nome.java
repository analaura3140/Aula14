package aula14;

import java.util.Scanner;

public class Nome {

	public static void main(String[] args) {
	
		String a[] = new String[5];
		Scanner ler = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.println("Informe um nome: ");
			a[i] = ler.next();
		}
		for (int x = 0; x<5; x++) {
			System.out.println("Os nomes foram: " + a[x]);
		}
		ler.close();	
		}	
	}