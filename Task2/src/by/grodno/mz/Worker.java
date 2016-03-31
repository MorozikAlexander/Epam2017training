package by.grodno.mz;

import java.util.ArrayList;

public class Worker {
	private String surname;
	private String name;
	private ArrayList<OfficeUnit> officeUnits;

	public Worker() {
		officeUnits = new ArrayList<OfficeUnit>();
	}

	public Worker(String workerSurname, String workerName) {
		this();
		surname = workerSurname;
		name = workerName;
	}
	
	public void SortOfficeUnitsById() {
		officeUnits.sort(new SortedById());
	}
	
	public void SortOfficeUnitsByName() {
		officeUnits.sort(new SortedByName());
	}
	
	public void SortOfficeUnitsByPrice() {
		officeUnits.sort(new SortedByPrice());
	}
	
	public void SortOfficeUnitsByPriceName() {
		officeUnits.sort(new SortedByPriceName());		
	}	

	public void addOfficeUnit(OfficeUnit item) {
		officeUnits.add(item);
	}
	
	public void printOfficeUnits() {
		for (OfficeUnit item : officeUnits) {
			System.out.println(item.toString());
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
