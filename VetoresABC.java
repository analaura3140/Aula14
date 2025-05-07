package aula14;

import java.util.Scanner;

public class VetoresABC {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("5 valores para A");
		for (int i = 0; i<b.length; i++) {
			System.out.println("A[" + i + "]: ");
			a[i] =ler.nextInt();}
			
		
		System.out.println("5 valores para B");
		for (int i = 0; i<b.length; i++) {
			System.out.println("B[" + i + "]: ");
			b[i] =ler.nextInt();}
		
		for (int i= 0; i<5; i ++) {
			c[i] = a[i];
			c[i + 5] = b [i];
		
		}
		
		System.out.println("Vetor A");
		for (int valor : a) {
			System.out.print(valor + "");
		}
		
		System.out.println("");
		System.out.println("Vetor B");
		for (int valor : b) {
			System.out.print(valor + "");
		}
		System.out.println(" ");
		System.out.println("Vetor C");
			for(int valor : c) {
			System.out.print(valor + " ");
			{
	}ler.close();
			}
	}
}
			
		
