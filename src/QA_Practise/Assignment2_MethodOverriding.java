package QA_Practise;

public class Assignment2_MethodOverriding {
	String panNum;
	String passportId;
	String voterId;
	
//	public Assignment2_MethodOverriding(String panNum, String passportId, String voterId) {
//		this.panNum = panNum;
//		this.passportId = passportId;
//		this.voterId = voterId;
//	}
	
	public String createAadharNum() {
		int firstFourDigits = (int)(Math.random()*10000);
		int secondFourDigits = (int)(Math.random()*10000);
		int thirdFourDigits = (int)(Math.random()*10000);
		String aadharNum = String.format("%04d %04d %04d\n", firstFourDigits, secondFourDigits, thirdFourDigits);
		return aadharNum;
	}
	
	//with only 1 argument panNum
	public void generateAadharNum(String panNum) {
		System.out.println("Only PAN Provided: "  + createAadharNum());
		
	}
	
	// with 2 arguments panNum and passportId
	public void generateAadharNum(String panNum, String passportId) {
		System.out.println("Only PAN & PassportID Provided: "  + createAadharNum());
	}
	
	// with 3 arguments panNum, passpoerId and voterId
	public void generateAadharNum(String panNum, String passportId, String voterId) {
		System.out.println("All required documents Provided: "  + createAadharNum());
	}
	
	
	public static void main(String[] args) {
		
		// Object Creation 
		Assignment2_MethodOverriding aadharNum = new Assignment2_MethodOverriding();
		
		// calling with only 1 argument panNum
		aadharNum.generateAadharNum("ABCDE123M");
		
		// calling with 2 arguments panNum and passportId
		aadharNum.generateAadharNum("ABCDE123M", "VDGSBNDHE232BDGRE");
		
		// calling with 3 arguments panNum, passpoerId and voterId
		aadharNum.generateAadharNum("ABCDE123M", "VDGSBNE232GRE", "BDHBRTY456BF");
		
	}
	
}
