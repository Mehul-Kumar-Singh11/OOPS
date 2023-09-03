package Abstraction;
interface I11{ // abstract class implements Interface
	public static final int a =  10;
	public abstract void m3();
}
abstract class Vehicle implements I11 {
     int no_of_tyres=54;
    abstract void start();
     void engine() {
    	System.out.println("400 horsepower engine");
    }
}

class Car extends Vehicle{
	int no_of_tyres = 4;
	@Override
	void start() {
		System.out.println("Car starts with key");
	}
	public void m3() {
		System.out.println("METHOD-3 IN CAR");
	}
}
public class Abstract_Class_Bike extends Vehicle{
	int no_of_tyres = 2;
	@Override
	void start() {
		System.out.println("Bike starts with kick");
	}
	public void m3() {
		System.out.println("METHOD-3 IN Bike");
	}

	public static void main(String[] args) {
	  Abstract_Class_Bike b = new Abstract_Class_Bike();
      b.start();
      b.engine();
      System.out.println(b.no_of_tyres);
      Car c  = new Car();
      c.start();
      System.out.println(c.no_of_tyres);
      Vehicle v = new Car();
      v.start();
      System.out.println(v.no_of_tyres);
	}
}
