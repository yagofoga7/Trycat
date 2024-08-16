import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ler = new Scanner(System.in);
		a = 10;
		System.out.println("digite um numero");
		b = ler.nextInt();
		c = a/ b;
		System.out.println("O valor de C é " + c);
		ler.close();
	}
}