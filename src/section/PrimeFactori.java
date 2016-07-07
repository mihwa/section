package section;

import java.util.Scanner;

public class PrimeFactori {

	public static void main(String[] args) {
		int A[] = new int[100];

		Scanner scanner = new Scanner(System.in);
		int B = scanner.nextInt();
		System.out.println("B:" + B);
		int C = 0;
		int D = 2;
		int E;
		int MOK = 0, NMG = 0;
		int i=0;

		while (true) {
			E = (int) Math.sqrt(B);
			System.out.println("E:" + E);
			while (true) {

				if (D > E) {
					D = B;
					break;
				} else {
					MOK = B / D;
					System.out.println("MOK:" + MOK);
					NMG = B - MOK * D;
					System.out.println("NMG:" + NMG);
					if (NMG == 0) {
						break;
					} else {
						System.out.println("D:" + D);
						D++;
						
					}
				}
			}
			//C++;
			// System.out.println("C:"+C);
			for (C = 0; C < 3; C++) {
				
				A[C] = D;
			}
			if (B == D) {
				break;
			} else {
				B = MOK;
			}
		}
		for (i = 0; i < C; i++) {
			System.out.print("A[i]:" + A[i]+"\t");
		}

	}
}
