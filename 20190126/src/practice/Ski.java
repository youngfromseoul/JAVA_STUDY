package practice;

public class Ski {

	public static void main(String[] args) {
		Ski_Retal ski = new Ski_Retal();
		
		int result = (ski.clotherRental()*4) + ski.foodPrice() + ski.houseRental()+ski.skiRental()*4;
		
		
		System.out.println("��ü �ݾ� : " + result);
		System.out.println("�δ� �ݾ�  : " + result /4);
		
	}

}
