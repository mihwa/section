package section;

import java.util.Scanner;

public class BaseConversion {
	public static void main(String[] args) {
		int A[]=new int[10];
		
		Scanner scanner=new Scanner(System.in);
		int B=scanner.nextInt(); //십진수를 입력받는다
		int BB=0;//
		int C=0;
		int MOK=0;
		int NMG;
		
		while (true) {
			if (BB==0) {
			System.out.println("BB:"+BB);	
			for (int i = 0; i < C; i++) {
				
			}
			break;} 
			else {
				B=MOK;
				C++;
				MOK=B/2;
				NMG=B-MOK*2;
				A[C]=NMG;
			}
			
		}
	}
}
