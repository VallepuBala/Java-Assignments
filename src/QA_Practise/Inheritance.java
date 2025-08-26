package QA_Practise;

public class Inheritance {
	String parentName;
	int parentAge;
	
//	public Inheritance(String parentName, int parentAge) {
//		this.parentName = parentName;
//		this.parentAge = parentAge;
//	}
	
	public void willDo() {
		System.out.println("Parent will do work.");
	}
	
	
	public static void main(String[] args) {
		
		class Child extends Inheritance{
			
			
			// calling parent constructor using super()
//			public Child(String parentName, int parentAge) {
//				super(parentName, parentAge);
//			}
			
			@ Override
			public void willDo() {
				System.out.println("Child will play.");
			}
		}
		
		Child c1 = new Child();
		c1.willDo();
		
	}

}

// Learning: 
//If we want to create child class outside main(String[] args) then we should create it as static. (static class Child ...)
// if we create a parameterized constructor in parent then we must call it using super() in child class.
