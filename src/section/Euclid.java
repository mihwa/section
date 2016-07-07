package section;

import java.util.Scanner;

public class Euclid {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("A를 입력하세요");
		int A = scanner.nextInt();
		System.out.println("B를 입력하세요");
		int B = scanner.nextInt();
		int SMALL=0,BIG=0;
		
		if (A >= B) {
			 BIG = A;
			System.out.println("BIG:" + BIG);
			SMALL = B;
			System.out.println("SMALL:" + SMALL);
		}
		int MOK, NMG = 0;
		int GCM = B;
		int LCM = (A * B) / B;
		while (true) {
			MOK = BIG / SMALL;
			System.out.println("MOK:" + MOK);
			NMG = BIG - (MOK * SMALL);
			System.out.println("NMG:" + NMG);
			 if (NMG != 0) {
				 BIG = SMALL;
				 SMALL = NMG;
			} else {
				GCM = SMALL;
				System.out.println("GCM:" + GCM);
				LCM = (A * B) / GCM;
				System.out.println("LCM:" + LCM);
				break;
			}
			
		} // while end
		
	}
}