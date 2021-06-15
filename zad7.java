package projekat29_04;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N");
		int n = s.nextInt();
		
		System.out.println("Unesite M");
		int m = s.nextInt();

		int[] brojevi = { 1, 7, -5, 200, 55, 3, 2, 144, 227, 530 };

		for (int i = n; i <= m; i++)

			System.out.println(brojevi[i]);

	}
}
