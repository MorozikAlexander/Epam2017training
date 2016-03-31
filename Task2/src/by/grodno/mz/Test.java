package by.grodno.mz;

import java.io.Console;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My test");
		
		Worker worker1 = new Worker("Ivanov", "Ivan");
		
		worker1.addOfficeUnit(new Pen(4, "black pen", 51));
		worker1.addOfficeUnit(new Pen(2, "green pen", 53));
		worker1.addOfficeUnit(new Pen(3, "red pen", 52));
		worker1.addOfficeUnit(new Pen(1, "blue pen", 54));
		worker1.printOfficeUnits();
		
		worker1.SortOfficeUnitsById();		
		worker1.printOfficeUnits();
		
		worker1.SortOfficeUnitsByName();		
		worker1.printOfficeUnits();		
		
		worker1.SortOfficeUnitsByPrice();		
		worker1.printOfficeUnits();		

	}

}
