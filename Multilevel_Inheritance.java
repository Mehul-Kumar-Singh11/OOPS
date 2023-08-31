package Inheritance;

public class Multilevel_Inheritance {
  public void method_in_parent() {
	  System.out.println("Method in parent class");
  }
	public static void main(String[] args) {
      B obj = new B();
      obj.method_B();
      obj.method_A();
      obj.method_in_parent();
	}
}

class A extends Multilevel_Inheritance{
	public void method_A() {
		System.out.println("Class A method");
	}
}
class B extends A{
	public void method_B() {
		System.out.println("Class B method");
	}
}
