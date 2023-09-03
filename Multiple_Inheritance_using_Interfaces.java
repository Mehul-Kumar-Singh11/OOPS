package Abstraction;

interface I1{
	public static final int a = 1;
	public abstract void m1();
}
interface I2{
	public static final int b = 2;
	public abstract void m2();
}
public class Multiple_Inheritance_using_Interface implements I1,I2 {
	@Override
   public void m1() {
	   System.out.println("METHOD - 1");
   }
	@Override
   public void m2() {
	  System.out.println("METHOD - 2");
   }
	public static void main(String[] args) {
		Multiple_Inheritance_using_Interface obj = new Multiple_Inheritance_using_Interface();
		obj.m1();
		obj.m2();
	}

}
