package startup;

import javax.swing.JOptionPane;

public class StartMain {
	String originalTest;
	String regex;
	
	public void doIt() {
		originalTest = JOptionPane.showInputDialog("문자열을 입력하세요");
		regex = JOptionPane.showInputDialog("찾는 매칭을 입력하세요");
		evalPattern();
	}
	private void evalPattern() {
		if(originalTest.matches(regex)) {
			System.out.println(originalTest + "matches to" + regex);
			
		}else
			System.out.println(originalTest + "not mathces to" + regex);
		}
}

