package Week1.Day2;

public class Car {
public void applyBrake() {
	System.out.println("whenever needed use brake");
}
public void  applyGear() {
	System.out.println("Apply gear");
}
public void switchOnAc() {
	System.out.println("Switch on ac");
}
	public void applyAccelerate() {
		System.out.println("apply accelerate");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c1 = new Car();
     c1.applyBrake();
     c1.applyGear();
     c1.switchOnAc();
     c1.applyAccelerate();
	}

}
