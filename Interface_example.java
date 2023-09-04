package Abstraction;
// ABSTRACTION USING INTERFACE

interface A{
	int a = 200;
	void m1() ;
}
interface vehicle_1 extends A{ // an interface can extends another interface
    public static final int a=10;
    public abstract void start();
    // from JAVA 8 concrete method can be declared in Interface using default
    default void mxplayer() {
    	System.out.println(" default MX PLAYER");
    }
    // from JAVA 8 static method can be declared in Interface using public 
    public static void brake() {
    	System.out.println("static Apply Brake");
    }
    // from JAVA 9 private method can be declared
    private void engine() {
    	System.out.println(" private ENGINE");
    }
    default void getEngine() {
    	engine();
    }
    default void setEngine() {
    	engine();
    }
    
}

class Bus implements vehicle_1{
	@Override
	public void start() { // should be public bcz of overridden method
		System.out.println("Bus class abstract start method");
	}
	public void m1() {
		System.out.println("");
	}
}

public class Bike_interface implements vehicle_1{
	    @Override
		public void start() {  // should be public bcz of overridden method
			System.out.println("Bike class abstract start method");
        }
	    public void m1() {
			System.out.println("");
		}
        public static void main(String[] args) {
        	Bus obj = new Bus();
		      obj.start();
		      obj.mxplayer();
		      vehicle_1.brake();
		      obj.getEngine();
		    Bike_interface obj2 = new Bike_interface();
		      obj2.start();
		      obj.mxplayer();
		      vehicle_1 obj3 = new Bus();
		      obj3.start();
		}
}
