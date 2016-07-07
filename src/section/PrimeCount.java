package section;

public class PrimeCount {
	public static void main(String[] args) {
		int[] A = new int[99];
		int K = 1;
		int i = 2;
		int J = 0;
		int M = 0;
			
		for (K = 2; K <= 100; K++) {
			A[K - 2] = K;
			i+=1;
			
		for (i = 2; i < 99; i++) {
	
		while (M > 99) {
					i++;
					if(i>99){
				System.out.println("J:" + J);
				break;
			
		} else {
			A[i]=0;
			i++;
			
		J++;
				M = i;	
				
				M = M + A[i];}
				}
			A[M]=0;
				}
			}

		}
		
	}


