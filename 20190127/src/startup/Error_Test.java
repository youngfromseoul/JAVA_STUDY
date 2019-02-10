package startup;

public class Error_Test {

	public static void main(String[] args) {
		int[] testError2 = new int[10];
		int[] testError1 = new int[10];
		
		try {
		testError1[100] = 10;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러입니다.");
		}
		testError2[100] = 10;
		System.out.println("gg");
		
	}

}
