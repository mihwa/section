package section;

import javax.swing.JOptionPane;

/*스위치변수
 * 수열2 
 * 1-2+3-4+5-6...+99-100까지합계
 */
public class SwitchSum {
	public static void main(String[] args) {
		int i=0,j=0,sw=0;
		while(i<100){
			i++;
			if(sw==0){
				j+=i;
				sw=1;
			}else{
				j-=i;
				sw=0;
			}
		}
		System.out.println("j는"+j);
	}
}
