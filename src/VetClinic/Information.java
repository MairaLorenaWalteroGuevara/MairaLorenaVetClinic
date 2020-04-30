package VetClinic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import Staff.Administrative;
import Staff.Medical;
import VetClinicInterfaces.InfoAnimalsInterface;
import VetClinicInterfaces.InfoInterface;
import VetClinicInterfaces.InfoStaffInterface;

public class Information implements InfoInterface {

	@Override
	public InfoStaffInterface createInfoStaff(BufferedReader in, BufferedReader on ) throws IOException {
		// TODO Auto-generated method stub
		

		InfoStaff medicalStaff = new InfoStaff();
		InfoStaff administrativeStaff = new InfoStaff();
		

		String firulito = null; 
		
		
		Medical fullname1;
		Administrative fullname2 = null;
//
		// es mejor tener un array list para leer la cantidad de info dentro del texto 
		String[] names = new String [40];
		String[] surnames = new String [40];
		Random r =new Random(); 
		
		try {
			int i=0; 

			for( i=0;i<40;i++) {
				names[i]=in.readLine(); 
				
			}
			
			for( i=0;i<40;i++) {
				surnames[i]=on.readLine(); 
				//System.out.println(surnames[i]); 
			}
			
			do {
			String fname = names[r.nextInt(names.length)];
			String sname = surnames[r.nextInt(surnames.length)];
			
			System.out.println(fname + sname); 
			
			firulito = "lorena"; 
			
			
			fullname1 = new Medical(fname, sname ); 
			fullname2 = new Administrative(fname,sname);
					
			// NOT ONLY THE INSTANCE SE ESTA CREANDO
			// TAMBIEN SE ESTA IMPRIENDO COMO EL toString METHOD DEFINES
			System.out.println(fullname1); 
			
			//medicalStaff.addMedicalStaff(fullname1);
			
			//administrativeStaff.addAdministrativeStaff(fullname2);
			// problemas pasando en este 
			
			}while(i<names.length || i>surnames.length);
		
		} catch (IOException e ) {
			throw new FileNotFoundException("Could not read the document");
		}

		System.out.print(names[1] + " " + surnames[1]);
		
		return null;
	}

// for loop para crear todas las instancias aleatorias con los atribuots requeridos para cada staff o animal 
	
	@Override
	public InfoAnimalsInterface createInfoAnimals(BufferedReader in) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
