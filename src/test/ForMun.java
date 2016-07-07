package test;

public class ForMun {
	public static void main(String[] args) {
		int A[] = new int[99];
		int K = 1;
		

		for (int i = 0; i < 99; i++) {
			A[i] = (i + 1);
		}
		for (int i = 0; i < A.length; i++) { //debug
			System.out.print(A[i] + "\t");
		}
		while (K < 100) {
			K++;
			A[K-1] = K;
		}
		int i=0;
		int J=0;
		
	
			}
	}

