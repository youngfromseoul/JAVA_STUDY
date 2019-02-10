package practice;

public class Television_003 {
	
	// 멤버변수 선언
	public boolean power;
	public int volumn;
	public String channel;
	
	// 접근제어
	public String color;	// 자식클래스
	protected String factory;	// 자식클래스
	String type;	// 같은 패키지일 때만 활용
	private boolean isDesign;	// 자기 자신일 때만 활용
	
	// 정적멤버변수
	public static int count = 0;
	
	// 정적메소드
	public static int getTotalCount() {
		int total = Television_003.count;
		return total;
	}
		
	// 초기화1
	/* 초기화1 */
	/** 생성자 - 초기화 */
	public Television_003() {
		power = true;
		volumn = 1;
		channel = "2번";
		
		// 접근제어
		color = "검은색";
		factory = "삼성";
		type = "일본부품";
		isDesign = true;
		
		Television_003.count = Television_003.count + 1;	// 조립 댓수 증가
		
	}
	
	
	//메소드 오버로딩 //
	public void print (String addMsg) {
		System.out.println(addMsg + volumn);
		System.out.println(addMsg + power);
	}
	
	
	
	/** print - 상태출력 */
	public void print() {
		
		System.out.println("텔레비전의 전원 : " + power);
		System.out.println("텔레비전의 볼륨 : "+ volumn);
		System.out.println("텔레비전의 채널 : " + channel);
		
		// 접근제어
		//System.out.println(color);
		//System.out.println(factory);
		//System.out.println(type);
		//System.out.println(isDesign);
	}
	
	/* getter 목록 */ 
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
	
	/* setter 목록 */
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
