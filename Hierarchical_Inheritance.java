package Inheritance;

public class Hierarchical_Inheritance {
	public void method_Parent_Class() {
		System.out.println("Method in Parent class");
	}
	public static void main(String[] args) {
		child_1 obj  = new child_1();
        obj.method_ClassA();
        obj.method_Parent_Class();
        
        child_2 obj1  = new child_2();
        obj1.method_ClassB();
        obj1.method_Parent_Class();
	}

}

class child_1 extends Hierarchical_Inheritance{
	public void method_ClassA() {
		System.out.println("Method in class A");
	}
}
class child_2 extends Hierarchical_Inheritance{
	public void method_ClassB() {
		System.out.println("Method in class B");
	}
}
