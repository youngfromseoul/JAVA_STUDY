package startup;

import javax.swing.JOptionPane;

public class StartMain {
	String originalTest;
	String regex;
	
	public void doIt() {
		originalTest = JOptionPane.showInputDialog("���ڿ��� �Է��ϼ���");
		regex = JOptionPane.showInputDialog("ã�� ��Ī�� �Է��ϼ���");
		evalPattern();
	}
	private void evalPattern() {
		if(originalTest.matches(regex)) {
			System.out.println(originalTest + "matches to" + regex);
			
		}else
			System.out.println(originalTest + "not mathces to" + regex);
		}
}

