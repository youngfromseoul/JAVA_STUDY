package practice;

public class Television_003 {
	
	// ������� ����
	public boolean power;
	public int volumn;
	public String channel;
	
	// ��������
	public String color;	// �ڽ�Ŭ����
	protected String factory;	// �ڽ�Ŭ����
	String type;	// ���� ��Ű���� ���� Ȱ��
	private boolean isDesign;	// �ڱ� �ڽ��� ���� Ȱ��
	
	// �����������
	public static int count = 0;
	
	// �����޼ҵ�
	public static int getTotalCount() {
		int total = Television_003.count;
		return total;
	}
		
	// �ʱ�ȭ1
	/* �ʱ�ȭ1 */
	/** ������ - �ʱ�ȭ */
	public Television_003() {
		power = true;
		volumn = 1;
		channel = "2��";
		
		// ��������
		color = "������";
		factory = "�Ｚ";
		type = "�Ϻ���ǰ";
		isDesign = true;
		
		Television_003.count = Television_003.count + 1;	// ���� ��� ����
		
	}
	
	
	//�޼ҵ� �����ε� //
	public void print (String addMsg) {
		System.out.println(addMsg + volumn);
		System.out.println(addMsg + power);
	}
	
	
	
	/** print - ������� */
	public void print() {
		
		System.out.println("�ڷ������� ���� : " + power);
		System.out.println("�ڷ������� ���� : "+ volumn);
		System.out.println("�ڷ������� ä�� : " + channel);
		
		// ��������
		//System.out.println(color);
		//System.out.println(factory);
		//System.out.println(type);
		//System.out.println(isDesign);
	}
	
	/* getter ��� */ 
	public String getColor() {
		return color;
	}

	public String getFactory() {
		return factory;
	}

	public String getType() {
		return type;
	}

	public boolean getIsDesign() {
		return isDesign;
	}
	
	/* setter ��� */
	public void setColor(String color1) {
		color = color1;
	}
	
	public void setFactory(String factory1) {
		factory = factory1;
	}
	
	public void setType(String type1) {
		type = type1;
	}
	
	public void setIsDesign(boolean isDesign1) {
		isDesign = isDesign1;
	}
	
}
