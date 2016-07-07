package section;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);//입력받는다
			int A=scanner.nextInt();//변수선언
			int i = A-1;//
			int J = 2;
			while (J<=1) {
				
				if (A%J==0) {
					System.out.println("소수아님");
				} else {
						J=J+1;
				}
			}
				System.out.println("소수");
			
	}
}
