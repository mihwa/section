package kaup;

import javax.swing.JOptionPane;

public class KaupContraller {
		public static void main(String[] args) {
			String mainName="",mainWeight="",mainHeight="";
			Kaup ka = new Kaup();
			while (true) {
				switch (JOptionPane.showInputDialog("1등록 0종료")) {
				case "1":
					mainName=JOptionPane.showInputDialog("이름");
					mainWeight=JOptionPane.showInputDialog("몸무게");
					mainHeight=JOptionPane.showInputDialog("키");
					ka.setName(mainName);
					ka.setWeight(Integer.parseInt(mainWeight));
					ka.setHeight(Integer.parseInt(mainHeight));
					
					JOptionPane.showMessageDialog(null, "이름:"+ka.getName()+"몸무게:"+ka.getWeight()+"키"+ka.getHeight());
					break;
				case "0":
					JOptionPane.showConfirmDialog(null, "종료합니다");
					return;

				default:
					break;
				}
			}
		}
}
