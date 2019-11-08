package ConstructorChaining;

public class RealEstate extends Business {

	public RealEstate(String type, int revenue, String branches) {
		super(type, revenue, branches);
		
	}

	public RealEstate() {
		System.out.println("RealEstate Default Constructor....");
	}

	public static void main(String[] args) {
		RealEstate rs = new RealEstate("Realestate" , 10000 , "Bangalore");
		System.out.println(rs.type);
		
		RealEstate rs1 = new RealEstate();
		
	}

}
