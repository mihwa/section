package section;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		int A[] = new int[100];
		int B = 10;
		int C = 0;
		int D = 0;
		int i;
		int MOK, NMG ;

		Scanner scanner = new Scanner(System.in);
		System.out.println("B값 입력");
		B = scanner.nextInt();

		while (true) {

			if (C > B) {
				System.out.print("B:" + B);
				for (i = 0; i < D; i++)
					System.out.println("A[i]" + "");

			} else {
				MOK = B / C;
				NMG = B - (MOK * C);
			

				if (NMG == 0) {
					A[D] = C;
					D++;
				}

			}

		}
	}

}