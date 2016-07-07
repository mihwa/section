package section;

import java.util.Scanner;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;

//소수의 합
public class PrimeSum {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("A입력");
	int A = scanner.nextInt();
	System.out.println("A :"+A);
	int HAP =0;
	int K =2,J=2;
	System.out.println("K:"+K);
	System.out.println("J:"+J);
	while (K%J==0) {
		System.out.println("MOD("+K+","+J+"):"+K%J);
		if (K==J) {
			
			HAP=HAP+K;
			System.out.println("HAP:"+HAP);
			if(K<A){
				K=K+1;
				J=2;
			}else{
				System.out.println("출력"+HAP);
			}
		} else {
			J=J+1;
		}
	}
	
	}
	
		
}


