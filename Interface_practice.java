package Abstraction;

interface I10{
	public static final int a=10;
	public abstract void m1();
	default void dm1() {
		System.out.println("Default method in I10");
	}
}
interface I20{
	public static final int b=20;
	public abstract void m2();
	default void dm2() {
		System.out.println("Default method in I20");
	}
}
interface I30{
	public static final int c=30;
	public abstract void m3();
	default void dm3() {
		System.out.println("Default method in I30");
	}
}
public class Interface_practice implements I10,I20,I30{
    public void m1() {
    	System.out.println("abstract m1 in I10");
    }
    public void m2() {
    	System.out.println("abstract m2 in I20");
    }
    public void m3() {
    	System.out.println("abstract m3 in I30");
    }
    
	public static void main(String[] args) {
		Interface_practice obj = new Interface_practice();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.dm1();
		

	}

}
