package week.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Applied break");
	}
	 public void soundhorn() {
		System.out.println("sound horn");
	}
	 public void myCar() {
	    
		Car myCar= new Car();
		myCar.applyBreak();
        myCar.soundhorn();
	}
	
	public static void main(String[] args) {
		Bike myBike= new Bike();
		myBike.myCar();
}
}
