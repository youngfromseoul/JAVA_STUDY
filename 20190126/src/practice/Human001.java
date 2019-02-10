package practice;

public  class Human001 implements Comparable {
	public int height;
	public int weigth;
	
	public Human001(int heigth, int weigth) {
		this.height = heigth;
		this.weigth = weigth;
	}
	
	public double getRate() {
		double result = ((double)weigth /(height -= 100));
		return result;
	}


	@Override
	public int compareTo(Object arg0){
	int result = 0;
		
		double me = this.getRate();
		double other = ((Human001)arg0).getRate();
		
		if (me > other) {
			result = 1;	
		}else if (me < other) {
			result = -1;
		}else {
			result = 0;
		}

		return result;
	}
}
