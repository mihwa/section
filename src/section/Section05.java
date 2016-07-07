package section;

import sun.applet.Main;

public class Section05 {
	public static void main(String[] args) {
		int i=1,K=1,J=1;
		while(i<10){
			i++;
			J*=i;
			K=K+J;
		}System.out.println("K는"+K);
	}
}
