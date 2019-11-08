package InterfaceConcept;

public class FortisHospital implements UsMedical,UKMedical,IndiaMedical{
	
	//US Medical
	@Override
	public void orthopedicServices(){
		System.out.println("Fortis Hospital------orthopedicServices");
	}
	@Override
	public void neuroServices(){
		System.out.println("Fortis Hospital ------neuroServices");
	}
	@Override
	public void dentalServices(){
		System.out.println("Fortis Hospital-----dentalServices");
	}
	@Override
	public void ambulanceServices() {
		System.out.println("Fortis Hospital-------ambulanceServices");
					}
	@Override
	public void Services_911(){
		System.out.println("US----911");
	}
	
	public static void Billing(){
		System.out.println("Billing -----US");
	}
	@Override
	public void polioServices(){
		System.out.println("WHO----polioServices");
	}
	
	//UK Medical
	@Override
	public void physioServices(){
		System.out.println("Fortis Hospital-----physioServices");
	}
	@Override
	public void ENTServices(){
		System.out.println("Fortis Hospital-----ENTServices");
	}
	@Override
	public void pediatricServices(){
		System.out.println("PediatricServices");
	}
	//India Medical
	
	@Override
	public void emergencyServices(){
		System.out.println("Fortis Hospital----emergencyServices");
	}
	@Override
	public void cardioServices(){
		System.out.println("Fortis Hospital-----cardioServices");
	}
	@Override
	public void OPTServices(){
		System.out.println("Fortis Hospital-----OPTServices");
	}
	
	//non override methods
	
	public void medicalInsurance(){
		System.out.println("Fortis Hospital-----medicalInsurance");
	}
	
	public void pathologyService(){
		System.out.println("Fortis Hospital-----pathologyService");
	}
	@Override
	public void billing() {
		System.out.println("US-----Billing");
		
	}
	
	
}
