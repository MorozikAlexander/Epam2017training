package by.grodno.mz;

import java.io.Console;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My test");

		Worker worker1 = new Worker("Ivanov", "Ivan");
		worker1.addOfficeUnit(new Pen(9, "black pen0", 100));
		worker1.addOfficeUnit(new Pen(4, "black pen1", 53));
		worker1.addOfficeUnit(new Paper(2, "green paper", 53));
		worker1.addOfficeUnit(new Paper(5, "white paper", 53));
		worker1.addOfficeUnit(new Paper(6, "red paper", 53));
		worker1.addOfficeUnit(new Paper(7, "yellow paper", 53));
		worker1.addOfficeUnit(new Paper(8, "blue paper", 53));
		worker1.addOfficeUnit(new Pencil(3, "red pen", 53));		
		worker1.addOfficeUnit(new Pen(1, "blue pen", 53));
		worker1.addOfficeUnit(new Pen(0, "black pen", 60));

		System.out.println("Sorted by Id:");
		worker1.SortOfficeUnitsById();
		worker1.printOfficeUnits();
		
		System.out.println("Sorted by Name:");
		worker1.SortOfficeUnitsByName();
		worker1.printOfficeUnits();

		System.out.println("Sorted by Price:");
		worker1.SortOfficeUnitsByPrice();
		worker1.printOfficeUnits();			

		System.out.println("Sorted by Price&Name is the same to sort by Name then by Price:");
		worker1.SortOfficeUnitsByPriceName();
		worker1.printOfficeUnits();	
	}

}
