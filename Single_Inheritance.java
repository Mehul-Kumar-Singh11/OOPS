package Inheritance;

public class Single_Inheritance{
     public void eat() {
    	 System.out.println("Eating");
     }
     public static void main(String[] args) {		
  		derived obj = new derived();
  		obj.run();
          obj.eat();
  	   }
}

class derived extends Single_Inheritance {
	public void run() {
		System.out.println("running");
	}
}
    


