package practice;

public class Animal implements Operation, Comparable {

	public int width;
	public int height;
	public int length;
	
	public Animal(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	@Override
	public int getVolume() {
		int result = this.height * this.length * this.width;
		return result;
	}
	@Override
	public int compareTo(Object arg0) {
		int result = 0;
		
		int Volume = this.getVolume();
		int other = ((Operation) arg0).getVolume();
		
		if(Volume > other) { 
			result = 1;
		} else if (Volume < other) {	
			result = -1;
		} else {	
			result = 0;
		}
		return result;
	}
}