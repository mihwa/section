package section;

import java.util.Scanner;

public class Factor2 {
	public static void main(String[] args) {
		int A[] = new int[100];
		int B = 0;
		int C = 0;
		int D = 0;
		int i ;
		int MOK,NMG=0;

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("B값 입력");
		B = scanner.nextInt();
		
		
		while (NMG == 0) {
				C++;
				D++;
			A[D]=C;
			System.out.println("C:"+C);
		
		if (C <= B) {
				MOK = B / C;
				System.out.print("MOK:" + MOK+"\t");
				NMG =B - (MOK * C);
				System.out.print("NMG:" + NMG+"\t");

			} else {
				System.out.print("B:" + B);
			
		}

	}
		System.out.println("D:"+D);
		for (i = 1; i < D; i++){
			System.out.println("A[i]"+A[i]);
			
			return;

		}
	}
}

