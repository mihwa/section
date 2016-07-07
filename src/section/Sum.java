package section;

import sun.applet.Main;

public class Sum {
	public static void main(String[] args) {
		int i=0,j=0;
		while(i<100){
			i++;
			j+=i;
		}
		System.out.println("i는"+i+"j는"+j);
	}
}
