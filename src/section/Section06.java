package section;

public class Section06 {
	public static void main(String[] args) {
		int A = 1,B=1, C=1;
		int HAP=2,CNT=2;

		while (true) {
			C = A + B;
			HAP = HAP + C;
			CNT = CNT + 1;
			
			if (CNT < 20) {
				A = B;
				B = C;
			} else {
				break;
			}

		}

		System.out.println("HAP" + HAP);
	}

}
