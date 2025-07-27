package QA_Practise;


public class EncapsulationCall {

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setName("Bala");
		String name  = obj.getName();
		System.out.println("My Name is: " + name);
		obj.setAge(25);
		int age = obj.getAge();
		System.out.println("I am " + age + "years old");

	}

}
