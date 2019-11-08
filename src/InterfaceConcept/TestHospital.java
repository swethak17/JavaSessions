package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fs = new FortisHospital();
		fs.ambulanceServices();
		fs.cardioServices();
		fs.ambulanceServices();
		fs.ENTServices();
		fs.OPTServices();
		fs.neuroServices();
		fs.medicalInsurance();
		fs.orthopedicServices();
		fs.physioServices();
		fs.pediatricServices();
		fs.pathologyService();

		//top casting
		UsMedical us = new FortisHospital();
		us.ambulanceServices();
		us.dentalServices();
		us.orthopedicServices();
		us.ambulanceServices();
		us.Services_911();
		System.out.println(UsMedical.min_fee);
		
		
		
		
		//UK Medical Top casting
		
		UKMedical uk = new FortisHospital();
		uk.physioServices();
		uk.ENTServices();
		uk.pediatricServices();
		System.out.println(UKMedical.min_fee);
		
		//India MEdical
		
		IndiaMedical im = new FortisHospital();
		im.cardioServices();
		im.emergencyServices();
		im.OPTServices();
		
		
		//no method body - 100% abstraction
		//only method declaration / method prototype
		//no static methods in interface
		//but interface variables static and final in nature by default
		//can not create the object of interface

		//after jdk 1.8
		//1. can have method body : with defaut method
		//default void services_911(){}
		//can have static methods in interface
		//static method can be called by interface references
		
			
		
	}

}
