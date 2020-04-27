package VetClinic;


import java.util.ArrayList;
import java.util.Collection;
import Staff.Administrative;
import Staff.Medical;
import VetClinicInterfaces.InfoStaffInterface;

public class InfoStaff implements InfoStaffInterface{
	
	ArrayList<Medical> medicalStaff = new ArrayList<Medical>(30); 
	ArrayList<Administrative> administrativeStaff = new ArrayList<Administrative>(10); 
	
	
	@Override
	public Collection<Medical> addMedicalStaff(Medical fullname) {
		// TODO Auto-generated method stub
		medicalStaff.add(fullname);
		return medicalStaff; 
			
	}

	@Override
	public Collection<Administrative> addAdministrativeStaff(Administrative fullname) {
		// TODO Auto-generated method stub
		administrativeStaff.add(fullname);
		return administrativeStaff;
		
	}


	@Override
	public Collection<String> listStaff() {
		// TODO Auto-generated method stub
//		ArrayList<String> staff = new ArrayList<String>(); 
//		Medical employee; 
//		
		return null;
	}

	

}
