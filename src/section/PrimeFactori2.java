package section;

import java.util.Scanner;

public class PrimeFactori2 {

	public static void main(String[] args) {
		int A[] = new int[100];

		Scanner scanner = new Scanner(System.in);
		int B = scanner.nextInt();
		System.out.println("B:" + B);
		int C = 0;
		int D = 2;
		int E;
		int MOK = 0, NMG = 0;
		int i;

		while (true) {
			E = (int) Math.sqrt(B);
			System.out.println("E:" + E);

			while (true) {
				if (D > E) {
					D = B;
					System.out.println("D:" + D);
					C++;
					System.out.println("C:" + C);
					A[C] = D;

				} else {
					MOK = B / D;
					System.out.println("MOK:" + MOK);
					NMG = B - MOK * D;
					System.out.println("NMG:" + NMG);
					return;
				}
				if (B == D) {
					for (i = 0; i < C; i++) {
						System.out.println("A[i]" + A[i]);

					}
				} else {
					B = MOK;

				}
				System.out.println("소인수A:" + A);

				if (NMG != 0) {
					D++;
				} else {
					break;
				}

			}
		}

	}
}
