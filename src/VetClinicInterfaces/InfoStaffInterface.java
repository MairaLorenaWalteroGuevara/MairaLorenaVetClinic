package VetClinicInterfaces;


import java.util.Collection;

import Staff.Administrative;
import Staff.Medical;


public interface InfoStaffInterface {
	
	
	public Collection<Medical> addMedicalStaff(Medical fullname ); 
	
	public Collection<Administrative> addAdministrativeStaff(Administrative fullname1);
	

	public Collection<String> listStaff(); 
	

}