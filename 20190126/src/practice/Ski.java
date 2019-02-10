package practice;

public class Ski {

	public static void main(String[] args) {
		Ski_Retal ski = new Ski_Retal();
		
		int result = (ski.clotherRental()*4) + ski.foodPrice() + ski.houseRental()+ski.skiRental()*4;
		
		
		System.out.println("전체 금액 : " + result);
		System.out.println("인당 금액  : " + result /4);
		
	}

}
